/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

import java.util.Scanner;

/**
 *
 * @author nghib
 */
public class Menu {

    public static int getChoice(Object[] options) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + " - " + options[i]);
        }
        System.out.println("Choose one of the " + options.length + " options:");
        int choice = 0;
        try {
            choice = Integer.parseInt(sc.nextLine());
            checkChoice(choice, options.length);
        } catch (NumberFormatException e) {
            System.out.println("Your choice must be an integer number.");
        } catch (choiceException ce) {
            System.out.println(ce.getMessage());
        }
        return choice;
    }

    private static void checkChoice(int choice, int numOfOptions) throws Exception{
        if (choice < 1 || choice > numOfOptions) {
            throw new choiceException("Your choice must be a number between 1 and " + numOfOptions + ".");
        }
    }
}

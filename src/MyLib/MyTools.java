/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTools {
    // to show menu
    // accept an option and return 
    public static int inputOptionInMenu(String[] options) throws Exception{
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            System.out.println((i+1) + ". " + option);
        }
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input option: ");
        choice = scan.nextInt();
        if(choice <= 0) throw new Exception();
        return choice;
            
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyTools {
    // to show menu
    // accept an option and return 
    public static int inputOptionInMenu(String[] options) throws Exception{
        for (int i = 0; i < options.length; i++) {
            String option = options[i];
            System.out.println((i+1) + ". " + option);
        }
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("input option: ");
        choice = scan.nextInt();
        if(choice <= 0) throw new Exception();
        return choice;
            
    }
}

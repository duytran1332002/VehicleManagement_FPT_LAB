/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {
    //the method is used to input 
    // positive interger number (>0)
    public static int inputNumber(String message) throws Exception{
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        num = scan.nextInt();
        if(num < 0) throw new Exception();
        return num;
    }
    // the method is used to input a String
    // matches a pattern string.
    public static String inputString(String message, String pattern) throws Excep/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLib;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Validation {
    //the method is used to input 
    // positive interger number (>0)
    public static int inputNumber(String message) throws Exception{
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        num = scan.nextInt();
        if(num < 0) throw new Exception();
        return num;
    }
    // the method is used to input a String
    // matches a pattern string.
    public static String inputString(String message, String pattern) throws Exception{
        String s = "";
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        s = scan.nextLine();
        if(!s.matches(pattern)) throw new Exception();
        return s;
    }
    
    public static boolean checkYearValid(int year){
        //get current year, month, day
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year > currentYear || year < 1900) {
            return false;
        }
        return true;
    }
    public static int inputYearValid(String message) throws Exception{
        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        year = scan.nextInt();       
        if(!checkYearValid(year)) throw new Exception();
        return year;
    }
}

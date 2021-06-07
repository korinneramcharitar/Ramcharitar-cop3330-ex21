
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */

package base;
import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int monthNum;
        do {
            System.out.println("Enter the number of the month: ");
            monthNum = sc.nextInt();
        }
        while(!(monthNum >=1 && monthNum<=12));
        switch(monthNum) {
            case 1:
                System.out.println("The name of the month is January");
                break;
            case 2:
                System.out.println("The name of the month is February");
                break;
            case 3:
                System.out.println("The name of the month is March");
                break;
            case 4:
                System.out.println("The name of the month is April");
                break;
            case 5:
                System.out.println("The name of the month is May");
                break;
            case 6:
                System.out.println("The name of the month is June");
                break;
            case 7:
                System.out.println("The name of the month is July");
                break;
            case 8:
                System.out.println("The name of the month is August");
                break;
            case 9:
                System.out.println("The name of the month is September");
                break;
            case 10:
                System.out.println("The name of the month is October");
                break;
            case 11:
                System.out.println("The name of the month is September");
                break;
            case 12:
                System.out.println("The name of the month is December");
                break;
         }
        }

}

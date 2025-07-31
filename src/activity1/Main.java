
package activity1;

import banking.bankingclass;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankingclass bc = new bankingclass();
                int attempts = 0;
                boolean success = false;

                while (attempts < 3 && !success) {
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        
                        System.out.println("LOGIN SUCCESS");
                        success = true;
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT!");
                        if (attempts < 3) {
                            System.out.println("Try again. Attempts left: " + (3 - attempts));
                        }
                    }
                }

                if (!success) {
                    System.out.println("Too many failed attempts. Program will now exit.");
                    System.exit(0);
                }
                break;

            case 2:
                System.out.println("Welcome to the Doctors Appointment system.");
                
                break;

            case 3:
                System.out.println("Welcome to the Shopping system.");
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
        
    
    


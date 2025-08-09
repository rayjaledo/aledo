package activity1;

import banking.BankingClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankingClass[] bApp = new BankingClass[10];
        int accountCount = 0;

        int mainChoice;
        do {
            
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Pay Bills");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                    int response;
                    do {
                        
                        System.out.println("1. Register Account");
                        System.out.println("2. Sign In to Account");
                        System.out.println("3. View All Accounts");
                        System.out.print("Enter Selection: ");
                        int action = sc.nextInt();

                        switch (action) {
                            case 1: 
                                if (accountCount < bApp.length) {
                                    bApp[accountCount] = new BankingClass();
                                    System.out.print("Enter your Account No.: ");
                                    bApp[accountCount].setAccNo(sc.nextInt());
                                    System.out.print("Set Account Pin: ");
                                    bApp[accountCount].setPin(sc.nextInt());
                                    bApp[accountCount].setBalance(0);
                                    System.out.println("Account Registered Successfully!");
                                    accountCount++;
                                } else {
                                    System.out.println("Account limit reached!");
                                }
                                break;

                            case 2: 
                                if (accountCount == 0) {
                                    System.out.println("No accounts registered yet!");
                                    break;
                                }

                                System.out.print("Enter your Account No.: ");
                                int account = sc.nextInt();
                                System.out.print("Enter Pin No.: ");
                                int pin = sc.nextInt();

                                BankingClass current = null;
                                int attempt = 3;

                                while (attempt > 0) {
                                    boolean found = false;
                                    for (int i = 0; i < accountCount; i++) {
                                        if (bApp[i].verifyAccount(account, pin)) {
                                            current = bApp[i];
                                            found = true;
                                            break;
                                        }
                                    }

                                    if (found) break;

                                    attempt--;
                                    if (attempt == 0) {
                                        System.out.println("ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    }

                                    System.out.println("Invalid Account! Attempts Left: " + attempt);
                                    System.out.print("Enter your Account No.: ");
                                    account = sc.nextInt();
                                    System.out.print("Enter Pin No.: ");
                                    pin = sc.nextInt();
                                }

                                System.out.println("LOGIN SUCCESS");

                                int loginChoice;
                                do {
                                    
                                    System.out.println("1. View Account Info");
                                    System.out.println("2. Deposit Money");
                                    System.out.println("3. Withdraw Money");
                                    System.out.println("4. Exit");
                                    System.out.print("Enter your choice: ");
                                    loginChoice = sc.nextInt();

                                    switch (loginChoice) {
                                        case 1:
                                            System.out.println("Account No.: " + current.getAccNo());
                                            System.out.println("Balance: ₱" + current.getBalance());
                                            break;
                                        case 2:
                                            System.out.print("Enter amount to deposit: ");
                                            double deposit = sc.nextDouble();
                                            current.deposit(deposit);
                                            break;
                                       case 3:
                                            System.out.println("Exiting Account Menu...");
                                            break;
                                        default:
                                            System.out.println("Invalid selection.");
                                    }
                                } while (loginChoice != 4);
                                break;

                            case 3: 
                                if (accountCount == 0) {
                                    System.out.println("No accounts registered yet!");
                                } else {
                                    for (int i = 0; i < accountCount; i++) {
                                        System.out.println("Account " + (i + 1) + ": " + bApp[i].getAccNo());
                                    }
                                }
                                break;

                            default:
                                System.out.println("Invalid selection.");
                        }

                        System.out.print("\nDo you want to continue in Banking? ((1) Yes / (0) No): ");
                        response = sc.nextInt();

                    } while (response == 1);
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                default:
                    System.out.println("INVALID SELECTION!");
            }

        } while (mainChoice != 4);

        sc.close();
    }
}

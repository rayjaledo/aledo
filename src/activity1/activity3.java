
package activity1;


import java.util.Scanner;

 class activity3 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }

        sc.close();

    }
    
}
    
    


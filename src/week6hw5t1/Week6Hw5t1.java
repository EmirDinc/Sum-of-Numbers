package week6hw5t1;

import java.util.Scanner;

public class Week6Hw5t1 {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        int userNum = -1;
        int sum = 0;
        
        while (userNum < 1){
        System.out.println("Enter a positive non-zero number.");
        userNum = keyIn.nextInt();
        }
        
        for(int num = 1; num <= userNum; num++ ){
            sum = sum + num;
        }
        System.out.println("The sum of number 1 to " + userNum + " is " + sum);
    }
    
}

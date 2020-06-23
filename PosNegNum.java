/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @HaripriyaHP
 */
import java.util.Scanner;
public class PosNegNum {

    
    public static void main(String[] args) {
      int N;
      Scanner s = new Scanner(System.in);
      N = s.nextInt();
        if(N > 0)
        {
            System.out.println("Positive number");
        }
        else if(N < 0)
        {
            System.out.println("Negative number");
        }
        else
        {
            System.out.println("Given number is Zero");
        }  
    }
    
}

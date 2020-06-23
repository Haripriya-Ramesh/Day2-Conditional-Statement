/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @HaripriyaHp
 */
import java.util.Scanner;
public class SumOfEvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);			
		int A = s.nextInt();			
		int B = s.nextInt();
		int C = A+B;
		if(C%2==0)
			System.out.println("Sum is Even");
		else
			System.out.println("Sum is Odd");
    }
    
}

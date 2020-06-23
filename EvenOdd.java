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
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);			
		int N = s.nextInt();	
		if(N%2==0)
			System.out.println(N + "is Even");
 	      	else
            		System.out.println(N + " is odd");
    
    }
    
}

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
public class GreaterValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);			
		int A = s.nextInt();			
		int B = s.nextInt();
		if(A > B)											
			System.out.println(A);
		else if(B > A)
			System.out.println(B);
		else
			System.out.println("Numbers are Equal");		
    }
    
}

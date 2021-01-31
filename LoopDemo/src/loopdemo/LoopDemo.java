/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopdemo;

/**
 *
 * @author Ali
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=========== foreach loop");
		int[] arr = {1, 2, 3};
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);

		for (int i : arr) {
			
		}
                
                System.out.println("=========== labels");
		loop1: for (int i = 0; i < 5; i++) {
				System.out.println("counter i: " + i);
			loop2: for (int j = 0; j < 5; j++) {
					System.out.println("counter j: " + j);
						if (j >= 0 && j < 3) {
							System.out.println("continue loop2");
							continue loop2;
						} else {
							System.out.println("break loop1");
							break loop1;
						}
					}
		}
    }
    
}

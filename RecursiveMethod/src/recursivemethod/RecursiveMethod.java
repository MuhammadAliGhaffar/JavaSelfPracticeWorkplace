/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivemethod;

/**
 *
 * @author Ali
 */
public class RecursiveMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //		callTheSameMethod();
        System.out.println("3! = " + calculateFactorial(3)); // 6 = 3 * 2 * 1
        System.out.println("4! = " + calculateFactorial(4)); // 24 = 4 * 3 * 2 * 1

        System.out.println("iterativeFactorial(4): " + iterativeFactorial(4));
    }

    private static void callTheSameMethod() {
        callTheSameMethod();
    }

    private static int calculateFactorial(int i) {
        if (i != 0) {
            return i * calculateFactorial(i - 1);
        } else {
            return 1;
        }
    }

    private static int iterativeFactorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}

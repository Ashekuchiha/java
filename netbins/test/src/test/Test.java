package test;
public class Test {
    
//    public static long calculateFactorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * calculateFactorial(n - 1);
//        }
//    }
   
    
    class FactorialCalculator {
    public static long calculateFactorial(int n) {
        long factorial = 1;
        //factorialLoop: 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

    public static void main(String[] args) {
        
        int number = 5; // Change this number to the one for which you want to calculate the factorial.
        long factorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);

        
//        int number = 1;
//        long factorial = calculateFactorial(number);
//        System.out.println("Factorial of " + number + " is " + factorial);
       
    }
    
}

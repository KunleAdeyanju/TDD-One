package rocks.zipcode;

/** 
 * EXERCISE 3: Calculator
 * 
 * Implement a Calculator class that can perform various mathematical operations
 * and passes all the tests.
 */

// Student must implement this class
public class Calculator {
    // TODO: Implement the following methods to make the tests pass
    
    public int add(int a, int b) {
        // Your implementation here
        return a + b;
    }
    
    public int subtract(int a, int b) {
        // Your implementation here
        return a - b;
    }
    
    public int multiply(int a, int b) {
        // Your implementation here
        return a * b;
    }
    
    public double divide(int a, int b) {
        // Your implementation here
        if( b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }
    
    public double power(int base, int exponent) {
        // Your implementation here
        return (double) Math.pow(base, exponent);
    }
}


package controller;

public class FibonacciController {

	public FibonacciController() {
		super();
	}

	public int fibonacci(int n) {
		if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
}

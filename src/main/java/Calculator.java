public class Calculator {
    int add(int i,int j) {
        return i + j;
    }
    int subtract(int i,int j) {
        return i-j;
    }
    int multiply(int i,int j) {
        return i*j;
    }
    int divide(int i,int j) {
        return i/j;
    }
    // Test 용도의 main method
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1,2));
        System.out.println(cal.subtract(2,3));
        System.out.println(cal.multiply(2,3));
        System.out.println(cal.divide(2,3));
    }
}

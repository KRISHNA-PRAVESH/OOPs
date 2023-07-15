package polymorphism;

//Suppose we are developing a calculator
// application that performs arithmetic operations
// on numbers. We want to provide flexibility by
// allowing users to perform operations with
// different numbers of operands

class Calculator{

    //sum of two integers
    public int add(int num1,int num2){
        return num1+num2;
    }

    //sum of three integers
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

    //sum of two doubles
    public double add(double num1,double num2){
        return num1+num2;
    }

    //sum of three doubles
    public double add(double num1,double num2,double num3){
        return num1+num2+num3;
    }

}
public class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //which method to invoke will be determined at compile time
        //by the compiler based on the arguments
        int sum1 = calculator.add(5,10);
        int sum2 = calculator.add(1,2,3);
        double sum3 = calculator.add(2.5,1.2);
        double sum4 = calculator.add(1.2,4.2,5.2);

        System.out.println("Sum1: "+sum1);
        System.out.println("Sum2: "+sum2);
        System.out.println("Sum3: "+sum3);
        System.out.println("Sum4: "+sum4);

        //Advantages:
        //1. Simplifies the code
        //2. Improves code readability



    }
}

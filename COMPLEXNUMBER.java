package complexnumber;

import java.util.Scanner;

public class COMPLEXNUMBER {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        int real1 = s.nextInt();
        System.out.println("Enter the imaginary part of the first complex number:");
        int imaginary1 = s.nextInt();

        System.out.println("Enter the real part of the second complex number:");
        int real2 = s.nextInt();
        System.out.println("Enter the imaginary part of the second complex number:");
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        int choice = s.nextInt();

        if (choice == 1) {
            c1.plus(c2);
            System.out.println("Result of Addition:");
            c1.print();
        } else if (choice == 2) {
            c1.multiply(c2);
            System.out.println("Result of Multiplication:");
            c1.print();
        } else {
            System.out.println("Invalid choice. Exiting.");
        }
    }
}

class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c2) {
        this.real += c2.real;
        this.imaginary += c2.imaginary;
    }

    public void multiply(ComplexNumbers c2) {
        int newReal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int newImaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);

        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public void print() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

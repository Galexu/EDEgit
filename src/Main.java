import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime dos numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
        } else {
            System.out.println("El numero mayor es: " + num2);
        }

        if (num1 < num2) {
            System.out.println("El numero menor es: " + num1);
        } else {
            System.out.println("El numero menor es: " + num2);
        }
    }
}
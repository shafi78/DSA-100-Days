import java.util.Scanner;

public class S_10_Calculator_using_switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();
        
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': System.out.println(a+b);
            break;

            case '-': System.out.println(a-b);
            break;

            case '*': System.out.println(a*b);
            break;

            case '/': System.out.println(a/b);
            break;

            case '%': System.out.println(a%b);
            break;

            default: System.out.println("Invalid operator");
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Введите второе число");
        double b = Double.parseDouble(input.nextLine());

        
        try{
            System.out.println("Операция умножения = "+ calc.multiply(a, b));
        }
        catch(InvalidInputException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Операция сложения = " + calc.sum(a, b));

        try {
            System.out.println("Операция деления = " + calc.dived(a, b));
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Операция вычитания = " + calc.substract(a, b));
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage() + " операция вычитания не может быть выполнена");
        }

        try{
            System.out.println("Операция возвдения в степень= " + calc.calculatePower(a, b));
        }
        catch(InvalidInputException e){
            System.out.println(e.getMessage() + " возведение в степень не может быть выполнено");
        }
        input.close();
    }
}

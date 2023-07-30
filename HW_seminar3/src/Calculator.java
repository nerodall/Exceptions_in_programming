public class Calculator {
    public double a;
    public double b;

    double sum(double a, double b) {
        return a + b;
    }

    double substract(double a, double b) throws InvalidInputException {
        if (a < b)
            throw new InvalidInputException("Первое число меньше второго");
        return a - b;
    }

    double multiply(double a, double b) throws InvalidInputException {
        if (a > Double.MAX_VALUE / b)
            throw new InvalidInputException("Выход за пределы типа данных");
        return a * b;
    }

    double dived(double a, double b) throws InvalidInputException {
        if (b == 0)
            throw new InvalidInputException("Деление на ноль недопустимо");
        return a / b;
    }

    double calculatePower(double a, double b) throws InvalidInputException {
        if (b <= 0 || b != (int) b)
            throw new InvalidInputException("Недопустимые вводные данные");
        return Math.pow(a, b);
    }
}

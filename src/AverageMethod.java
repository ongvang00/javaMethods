

public class AverageMethod {
    public static void main (String[] args) {
        double sumResult = sum(2, 5, 8);
        double averageResult = average(sumResult);
        System.out.println("The average is: " + averageResult);
    }

    public static double sum (int num1, int num2, int num3) {
        double total = num1 + num2 + num3;
        return total;
    }

    public static double average (double total) {
        return total / 3.0;
    }
}

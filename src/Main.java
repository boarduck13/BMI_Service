//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        int weight = 100; // Вес в килограммах

        int height = 2; // Рост в метрах

        int bmi = bmiService.calculate(weight, height);

        System.out.println("BMI индекс: " + bmi);

    }
}
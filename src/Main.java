//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightKg = 77;

        double heightM = 1.86;

        int bmi = service.calculate(weightKg, heightM);

        System.out.println("BMI индекс: " + bmi );
}
}
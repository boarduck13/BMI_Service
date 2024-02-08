public class BmiService {
    public int calculate(int weightKg, int heightM) {

        return weightKg / (heightM * heightM); // Приводим результат к целому числу
    }
}

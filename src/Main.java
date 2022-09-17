public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98; // кг
        double height = 1.80; // м^2
        double calculate = service.calculate(weight, height);
        double bmi = Math.round(service.calculate(weight, height) * 100.0) / 100.0;
        System.out.println("Ваш ИМТ равен " + bmi);
    }
}

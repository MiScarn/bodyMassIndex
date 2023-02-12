
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 46;
        double height = 1.6;
        double bmi = service.calculate(46, 1.6);
        System.out.println("Индекс массы тела = " + bmi);
    }
}
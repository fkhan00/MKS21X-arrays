public class CtoFTester {

    public static double fahrtoCel(double fahrTemp) {
        return (fahrTemp - 32) * 5.0 / 9.0;
    }
    public static double celtoFahr(double celTemp){
        return 1.8 * celTemp + 32;
    }

    public static void main(String[] args) {
        System.out.println(fahrtoCel(80));
        System.out.println(celtoFahr(90));
    }

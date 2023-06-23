public class Main {

    public static void main(String[] args) {
        System.out.println("------------------ Data types ------------------");
        int hisNum =10;
        int herNum =22;
        float herFloat = 123.456789f;
        double hisDouble = 9876.1234567;
        char herChar = 'C';
        String herName = "Ewa";
        String hisName = "Adam";
        boolean hisBool = true;
        herNum +=33;
        System.out.println("hisNum: " + hisNum);
        System.out.println("herNum: " + herNum);
        System.out.println("herFloat: " + herFloat);
        System.out.println("hisDouble: " + hisDouble);
        System.out.println(" " + herChar);
        System.out.println(herName + " i " + hisName + " są parą");
        System.out.printf("Dziś %s i %s wydali na zakup mebli %.2f ", herName, hisName, hisDouble + herFloat);

    }
}
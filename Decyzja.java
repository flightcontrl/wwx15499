public class Decyzja {
    public static void main(String[] args) {
        System.out.println("--------------- Decyzja -------------");

        /*
        good morning
        good afternoon
        good night
         */
        int godzina =21;
        if (godzina < 12) {
            System.out.println("good morning");
        } else if (godzina < 20) {
            System.out.println("good afternoon");
        }else{
            System.out.println("good night");

        }
    }
}

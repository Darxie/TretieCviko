import java.security.SecureRandom;

public class SecureAndRandomlyString {
    public static void main(String[] args) {
        SecureRandom nahodnyGeneratorCisel = new SecureRandom();
        int cislo;
        for (int i = 0; i < 10; i++) {
            cislo = nahodnyGeneratorCisel.nextInt();
            System.out.println(cislo + " ");
        }
    }
}
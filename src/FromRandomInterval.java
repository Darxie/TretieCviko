import java.util.Random;

public class FromRandomInterval {

    public static void main(String[] args) {

        Random r = new Random();
        for (int i = 0; i < 11; i++) {
            int[] fiveRandomNumbers = r.ints(5, 0, 159).toArray();
            int randomNumber = r.ints(1, 0, 159).findFirst().getAsInt();
            System.out.println(randomNumber);
        }
    }
}

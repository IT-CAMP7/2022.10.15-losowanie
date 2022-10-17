import java.util.Random;

public class ZadanieZLosowaniem {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        tab[0] = random.nextInt(101);
        for(int i = 1; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            if(tab[i] < tab[i-1]) {
                i--;
            }
        }

        for(int element : tab) {
            System.out.println(element);
        }
    }
}

package JAVA;
import java.util.Random;
class practical12 
{
    public static void main(String args[])
    {
        Random sc = new Random(1000);
        for (int i = 0; i < 100; i++) {
            System.out.printf("%5d", sc.nextInt(49));
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}

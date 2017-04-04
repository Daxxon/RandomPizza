import java.util.Random;

public class randomTest {

  public static void main(String args[]) {
    Random randomGenerator = new Random();
    for (int i=0; i<4; i++) {
      int randomInt = randomGenerator.nextInt(4);
      System.out.println(randomInt);
    }
  }

}

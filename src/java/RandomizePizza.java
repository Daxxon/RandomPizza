import java.util.Random;
import java.io.*;

public class RandomizePizza{

  public static void main(String args[]){
    Pizza myPizza = new Pizza();
    myPizza.setCrust(CrustChoices.randomGenerator.nextInt((CrustChoices.values().length -1));
    myPizza.setSauce(randomGenerator.nextInt(sauceChoices.length));
    myPizza.setNumberOfMeats(randomGenerator.nextInt(meatChoices.length));
    myPizza.setMeats();
    myPizza.setNumberOfVeggies(randomGenerator.nextInt(veggieChoices.length));
    myPizza.setVeggies();
  }
}











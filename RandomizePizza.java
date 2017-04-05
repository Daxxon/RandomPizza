import java.util.Random;
import java.io.*;

public class RandomizePizza{

  public static void main(String args[]){
    Pizza myPizza = new Pizza();
    myPizza.chooseCrust();
    myPizza.chooseSauce();
    myPizza.chooseMeats();
    myPizza.chooseVeggies();

  }
}


class Pizza {
  Random randomGenerator = new Random();

  String[] crustChoices = {"originalPan", "handTossed", "thin", "stuffed"};
  String[] sauceChoices= {"marinara", "crushedTomato", "garlicParmesan", "barbeque", "buffalo"};
  String[] meatChoices = {"pepperoni", "italianSausage", "salami", "meatball", "ham", "bacon", "chicken", "beef", "pork"};
  String[] veggieChoices = {"mushrooms", "spinach", "peruvianPeppers", "redOnions", "olives", "bellPeppers", "bananaPeppers", "pineapple", "jalapenoPeppers", "romaTomatoes"};

  String crust;
  String sauce;
  String[] meats = new String[(randomGenerator.nextInt(3) +1)];
  String[] veggies = new String[(randomGenerator.nextInt(3) + 1)];

  public void chooseCrust(){
    this.crust = crustChoices[randomGenerator.nextInt(crustChoices.length)];
    System.out.println("Your crust is " + this.crust);

  }

  public void chooseSauce(){
    this.sauce = sauceChoices[randomGenerator.nextInt(sauceChoices.length)];
    System.out.println("Your sauce is " + this.sauce);
  }

  public void chooseMeats(){
    int numberOfMeats = this.meats.length;
    for (int i=0; i<numberOfMeats; i++){
      this.meats[i] = meatChoices[randomGenerator.nextInt(8)];
      System.out.println("Meat " + (i + 1) + " is " + meats[i]);
    }
  }

  public void chooseVeggies(){
    int numberOfVeggies = this.veggies.length;
    for (int i=0; i<numberOfVeggies; i++){
      this.veggies[i] = veggieChoices[randomGenerator.nextInt(9)];
      System.out.println("veggie " + (i + 1) + " is " + veggies[i]);
    }
  }
}










import java.util.Random;
import java.io.*;

public class RandomizePizza{

  public static void main(String args[]){
    Pizza myPizza = new Pizza();
    myPizza.chooseCrust();
    myPizza.chooseSauce();
//    myPizza.chooseMeats();
//    myPizza.chooseVeggies();

  }
}

class Pizza {

  String[] crustChoices = {"originalPan", "handTossed", "thin", "stuffed"};
  String[] sauceChoices= {"marinara", "crushedTomato", "garlicParmesan", "barbeque", "buffalo"};
  String[] meatChoices = {"pepperoni", "italianSausage", "salami", "meatball", "ham", "bacon", "chicken", "beef", "pork"};
  String[] veggieChoices = {"mushrooms", "spinach", "peruvianPeppers", "redOnions", "olives", "bellPeppers", "bananaPeppers", "pineapple", "jalapenoPeppers", "romaTomatoes"};

  String crust;
  String sauce;
  String[] meats;
  String[] veggies;


public void chooseCrust(){
  Random randomGenerator = new Random();
  this.crust = crustChoices[randomGenerator.nextInt(crustChoices.length)];
  System.out.println("Your crust is " + this.crust);

}
public void chooseSauce(){
  Random randomGenerator = new Random();
  this.sauce = sauceChoices[randomGenerator.nextInt(sauceChoices.length)];
  System.out.println("Your sauce is " + this.sauce);
}
/*  String chooseMeats(){
    Random randomGenerator = new Random();
    numberOfMeats = new int[randomGenerator.nextInt(8) + 1];
    for (i=0; i<= numberOfMeats; i++){
      myPizza.meats =
    }
  }
  String chooseVeggies(){
    Random randomGenerator = new Random();
  }
*/
}

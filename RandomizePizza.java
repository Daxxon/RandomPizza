import java.util.Random;
import java.io.*;

public class RandomizePizza{

  public static void main(String args[]){
    Random randomGenerator = new Random();
    Pizza myPizza = new Pizza();
    chooseCrust();
    chooseSauce();
//    chooseMeats();
//    chooseVeggies();

  }
}

class Pizza {

  enum crustChoices {originalPan, handTossed, thin, stuffed};
  crustChoices crusts;

  enum sauceChoices {marinara, crushedTomato, garlicParmesan, barbeque, buffalo};
  sauceChoices sauces;

  String[] crust;
  String[] sauce;

//  String[] meats = { pepperoni, italianSausage, salami, meatball, ham, bacon, chicken, beef, pork };
//  String[] veggies = { mushrooms, spinach, peruvianPeppers, redOnions, olives, bellPeppers, bananaPeppers, pineapple, jalapenoPeppers, romaTomatoes };
}

void chooseCrust(){
  myPizza.crust = crusts[randomGenerator.nextInt(3) + 1];
  System.out.println("Your crust is " + myPizza.crust);

}
void chooseSauce(){
  myPizza.sauce = sauces[randomGenerator.nextInt(4) + 1];
  System.out.println("Your sauce is " + myPizza.sauce);
}
/*  String chooseMeats(){
    numberOfMeats = new int[randomGenerator.nextInt(8) + 1];
    for (i=0; i<= numberOfMeats; i++){
      myPizza.meats =
    }
  }
  String chooseVeggies(){

  }
*/


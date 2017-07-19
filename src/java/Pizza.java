public class Pizza {

  private CrustChoices crust;
  private SauceChoices sauce;
  private MeatChoices meats;
  private VeggieChoices veggies;

  public void setCrust(int i){
    this.crust = CrustChoices.values(i);
  }
  public void setSauce(int i){
    this.sauce = SauceChoices.values(i);
  }
  public int setNumberOfMeats(int numberOfMeats){
    return numberOfMeats;
  }
  public void setMeats() {
    for (int i = 0; i < myNumberOfMeats; i++) {
      this.meats[i] = meatChoices[randomGenerator.nextInt(8)];
    }
  }
  public int setNumberOfVeggies(int numberOfVeggies){
    return numberOfVeggies;
  }
  public void setVeggies(int[] veggies) {
    for (int i = 0; i < myNumberOfVeggies; i++) {
      this.veggies[i] = veggieChoices[randomGenerator.nextInt(10)];
    }
  }
  public String getCrust(){
    return crust;
  }
  public String getSauce(){
    return sauce;
  }
  public String[] getMeats(){
    return meats;
  }
  public String[] getVeggies(){
    return veggies;
  }
}

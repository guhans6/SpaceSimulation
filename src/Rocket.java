public class Rocket implements SpaceShip {


    int COST;
    int MAX_CARGO_WEIGHT;
    int MAX_WEIGHT;



    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

  
    @Override
    public boolean canCarry(Item item) {
        // System.out.println(item.getWeight() +" "+ u1Rocket.availableWeight);
        // return item.getWeight() <=  u1Rocket.availableWeight;
        return true;
    }

   @Override
   public void carry(Item item) {
        // u1Rocket.availableWeight -= item.getWeight();
        // System.out.println(u1Rocket.availableWeight);
   }


   public int getavailabe()
   {
        return 0;
   }


}
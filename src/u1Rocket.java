public class u1Rocket extends Rocket{

    final int COST = 100;
    final int MAX_CARGO_WEIGHT = 10;
    final int MAX_WEIGHT = 18;
    int availableWeight;


    u1Rocket() { 
        availableWeight = MAX_WEIGHT - MAX_CARGO_WEIGHT;
    }
    
    @Override
    public boolean launch(){
   
        double chance = 0.05 * (this.MAX_CARGO_WEIGHT - this.availableWeight) / MAX_CARGO_WEIGHT;
        return chance < Math.random();
    }

    
    @Override
    public boolean land() {
        // System.out.println("aa");
        // System.out.println(this.MAX_CARGO_WEIGHT - this.availableWeight);
        double chance = 0.01 * (MAX_CARGO_WEIGHT - availableWeight) / MAX_CARGO_WEIGHT;


        double ran = Math.random();
        System.err.println(chance +" "+ ran);
        if (chance < ran)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    



    
}

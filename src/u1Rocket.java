public class u1Rocket extends Rocket{

    static final int COST = 100;
    int MAX_CARGO_WEIGHT = 8000;
    static int MAX_WEIGHT = 18000;
    int availableWeight = 8000;
    
    @Override
    public boolean launch(){
        // System.out.println("launch"); 
        // System.out.println(MAX_CARGO_WEIGHT +" "+ availableWeight);
        double chance = 0.05 * (this.MAX_CARGO_WEIGHT - availableWeight) / MAX_CARGO_WEIGHT;

        return chance < Math.random() /12 ;
    }

    @Override
    public int getavailabe()
    {
        return this.availableWeight;
    }


    
    @Override
    public boolean land() {
        // System.out.println("land");
        // System.out.println(this.MAX_CARGO_WEIGHT - this.availableWeight);
            double chance = 0.01 * (MAX_CARGO_WEIGHT - availableWeight) / MAX_CARGO_WEIGHT;

            return chance < Math.random()/12;
    }

    @Override
    public String toString() {
        return "u1Rocket [COST=" + COST + ", MAX_CARGO_WEIGHT=" + MAX_CARGO_WEIGHT + "]";
    }
    
}

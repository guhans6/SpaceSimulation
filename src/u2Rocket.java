public class u2Rocket extends Rocket {
    
    final int COST = 120; // Million
    final int MAX_CARGO_WEIGHT = 18;  // Tonnes
    final int MAX_WEIGHT = 29;  // Tonnes
    int availableWeight;
    Item item;
    double chance;

    u2Rocket() { 
        availableWeight = MAX_WEIGHT - MAX_CARGO_WEIGHT;
    }

    public boolean launch() {
        double chance = 0.04 * (this.MAX_CARGO_WEIGHT - this.availableWeight) / MAX_CARGO_WEIGHT;
        return chance < Math.random();
    }

    public boolean land() {
        double chance = 0.08 * (this.MAX_CARGO_WEIGHT - this.availableWeight) / MAX_CARGO_WEIGHT;
        return chance < Math.random();
    }

    public int getCost() {
        return this.COST;
    }
    
}

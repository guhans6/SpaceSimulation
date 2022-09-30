public class Rocket implements SpaceShip {


    int COST;
    int MAX_CARGO_WEIGHT;
    int MAX_WEIGHT;
    int availableWeight;


    @Override
    public boolean launch() {
        System.out.println("aa");
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void carry(Item item) {
        // TODO Auto-generated method stub
        
    }
    
}

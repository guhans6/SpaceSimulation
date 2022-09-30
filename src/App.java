import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Simulation simulation = new Simulation();
        ArrayList<Item> items = simulation.loadItems();
        ArrayList<Rocket> u1Rockets = simulation.loadU1(items);
        ArrayList<Rocket> u2Rockets = simulation.loadU2(items);

        // for(Rocket r : u1Rockets)
        // {
        //     System.out.println(r.getavailabe());
        // }
        System.out.println(simulation.runSimulation(u1Rockets));
        System.out.println(simulation.runSimulation(u2Rockets));
    }
}

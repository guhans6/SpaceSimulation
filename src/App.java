import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        int totalCostU1 = 0,totalCostU2 = 0;
        Simulation simulation = new Simulation();
        ArrayList<Item> phase1 = simulation.loadItems("phase1");
        ArrayList<Item> phase2 = simulation.loadItems("phase1");


        ArrayList<Rocket> phase1U1rockets = simulation.loadU1(phase1);
        ArrayList<Rocket> phase2U1rockets = simulation.loadU1(phase2);
        ArrayList<Rocket> phase1U2rockets = simulation.loadU2(phase1);
        ArrayList<Rocket> phase2U2rockets = simulation.loadU1(phase2);

        // for(Rocket r : u1Rockets)
        // {
        //     System.out.println(r.getavailabe());
        // }
        totalCostU1 += simulation.runSimulation(phase1U1rockets);
        totalCostU1 += simulation.runSimulation(phase2U1rockets);

        totalCostU2 += simulation.runSimulation(phase1U2rockets);
        totalCostU2 += simulation.runSimulation(phase2U2rockets);



        System.out.println(totalCostU1);
        System.out.println(totalCostU2);
    }
}

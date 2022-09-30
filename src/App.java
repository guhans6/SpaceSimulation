import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Simulation sim = new Simulation();

        ArrayList<Item> itemList = sim.loadItems();

        for(int i=0;i<itemList.size();i++)
        {
            Item k = itemList.get(i);
            System.out.println(k.getWeight());
        }
        ArrayList<Rocket> rocketList = sim.loadU1(itemList);


        // for(Rocket i : rocketList) {
        //     System.out.println(i.availableWeight);
        // }

        // sim.loadU2(itemList);

        // sim.runSimulation(rocketList);

    }
}

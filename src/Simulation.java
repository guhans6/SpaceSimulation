import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems(String phase) throws FileNotFoundException{

        File file = new File(phase+".txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<Item> itemList = new ArrayList<>();   

        while(fileScanner.hasNextLine()){
            Item item = new Item();
            String[] getItem = fileScanner.nextLine().split("=");
            item.setName(getItem[0]);
            item.setWeight(Integer.parseInt(getItem[1]));
            itemList.add(item);
        }
        fileScanner.close();
        return itemList;
    }
    
    ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {

        ArrayList<Rocket> rocketList =  new ArrayList<>();
        u1Rocket rocket = new u1Rocket();
        for(int i=0;i<itemList.size();i++)
        {
            if(itemList.get(i).getWeight() <= rocket.availableWeight)
            {
                rocket.availableWeight -= itemList.get(i).getWeight();
            }
            else {
                rocketList.add(rocket);
                rocket = new u1Rocket();
            }
        }
        return rocketList;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

        ArrayList<Rocket> rocketList =  new ArrayList<>();
        u2Rocket rocket = new u2Rocket();
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).getWeight() <= rocket.availableWeight)
            {
                rocket.availableWeight -= items.get(i).getWeight();
            }
            else {
                rocketList.add(rocket);
                rocket = new u2Rocket();
            }
        }
        return rocketList;
    }

    int runSimulation(ArrayList<Rocket> rocketList) {
        int budget = 0;
        for(Rocket rocket : rocketList)
        {
            budget += u1Rocket.COST;
            if(rocket.launch() == false || rocket.land() == false)
            {
                budget += u1Rocket.COST;
            }
        }
        return budget;
    }
}

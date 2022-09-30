import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    ArrayList<Item> loadItems() throws FileNotFoundException{

        File file = new File("phase1.txt");
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
        // file = new File("phase2.txt");
        // fileScanner = new Scanner(file);
        // while(fileScanner.hasNextLine()){
        //     Item item = new Item();
        //     String[] getItem = fileScanner.nextLine().split("=");
        //     item.setName(getItem[0]);
        //     item.setWeight(Integer.parseInt(getItem[1]));
        //     itemList.add(item);
        // }
        // fileScanner.close();
        return itemList;
    }
    
    ArrayList<Rocket> loadU1(ArrayList<Item> itemList) {
       
        // int c=0;
        Item item = new Item();
        ArrayList<Rocket> rocketList = new ArrayList<>();
        while(itemList.isEmpty() == false) {
            u1Rocket rocket = new u1Rocket();
            for(int i=0;i<itemList.size();i++)
            {
                item = itemList.get(i);
                // System.out.println(item.getWeight());
                if(rocket.availableWeight == 0) { break; }
                if(item.getWeight() <= rocket.availableWeight * 1000)
                {
                    rocket.availableWeight -= (item.getWeight() / 1000);
                    itemList.remove(i);
                }
               
            }
            // c++;
            // System.out.println("Rocket "+c);
            // System.err.println("-------END-----");
            rocketList.add(rocket);
            
        }

        return rocketList;
    }

    ArrayList<Rocket> loadU2(ArrayList<Item> itemList) {
       
        // int c=0;
        Item item = new Item();
        ArrayList<Rocket> rocketList = new ArrayList<>();
        while(itemList.isEmpty() == false) {
            u2Rocket rocket = new u2Rocket();
            for(int i=0;i<itemList.size();i++)
            {
                item = itemList.get(i);
                if(item.getWeight() <= rocket.availableWeight * 1000)
                {
                    rocket.availableWeight -= (item.getWeight() / 1000);
                    System.out.println(rocket.availableWeight);
                    itemList.remove(i);
                }
            }
            // c++;
            // System.out.println("Rocket "+c);
            // System.err.println("-------END-----");
            rocketList.add(rocket);
            
        }
        return rocketList;
    }

    int runSimulation(ArrayList<Rocket> rockets) {

        int totalBudget = 0;
        while(rockets.isEmpty() == false)
        {
            Rocket r;
            for(int i=0;i<rockets.size();i++)
            {
                r = rockets.get(i);
                System.out.println(r.COST);
                if(r.launch() == true && r.land() == true)
                {
                    // System.out.println(r.COST);
                    totalBudget += r.COST;
                    rockets.remove(i);
                }
                else {
                    // System.out.println(r.COST);
                    totalBudget += r.COST;
                }
                System.out.println(totalBudget);
            }
        }
        return totalBudget;
    }
}

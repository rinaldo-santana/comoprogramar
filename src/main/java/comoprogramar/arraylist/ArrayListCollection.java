package  comoprogramar.arraylist;

import java.util.ArrayList;

/**
 * ArrayListCollection
 */
public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();
        items.add("vermerlho");
        items.add(0, "amarelo");


        for(int i = 0; i < items.size(); i++) {
            System.out.println("A cor eh: " + items.get(i));
        }


    }
}

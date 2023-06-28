package org.example;

import org.example.Toys;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Lot {
    public static Toys win(PriorityQueue<Toys> toyList){
        int sum = 0;
        for (Toys toy: toyList) {
            sum+= toy.getWeight();
        }
        ArrayList<Toys> arrPercentage = new ArrayList<>();

        for (Toys toy: toyList) {
            int percent = 0;
            percent = calculatePercentage(toy.getWeight(), sum);
            while (percent > 0){
                arrPercentage.add(toy);
                percent--;
            }
        }
        return arrPercentage.get((int) (Math.random()*100));
    }

    public static int calculatePercentage(int weight, int sum) {
        return weight * 100 / sum;
    }

}

package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToyList {
    public PriorityQueue<Toys> toyList = new PriorityQueue<>();

    public void addToQue(Toys toy){
        toyList.add(toy);
    }

}

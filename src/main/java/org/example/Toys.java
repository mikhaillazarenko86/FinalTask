package org.example;

public class Toys implements Comparable<Toys> {
    private int id;
    private String name;
    private int weight;

    public Toys() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Toys(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s ,ID игрушки: %d , вес игрушки: %d", name, id, weight);
    }

    @Override
    public int compareTo(Toys o) {
        int value = ((Toys) o).id;
        return this.id - value;
    }
}

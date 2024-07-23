package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size size;
    private HashMap<String, T> aviaryMap = new HashMap<String, T>();

    public void addAnimal(T animal) {
        if (!this.size.equals(animal.getSize())) {
            throw new WrongSizeException();
        }
        aviaryMap.put(animal.getName(), animal);
    }
    public T getAnimal(String name) {
        return aviaryMap.get(name);
    }

    public boolean removeAnimal(String name) {
        return aviaryMap.remove(name) != null;
    }


    public Aviary(Size size) {
        this.size = size;
    }
}

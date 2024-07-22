package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size size;
    private HashMap<String, T> hashMap = new HashMap<String, T>();

    public void addAnimal(T animal) {
        if (!this.size.equals(animal.getSize())) {
            throw new WrongSizeException();
        }
        hashMap.put(animal.getName(), animal);
    }
    public T getAnimal(String name) {
        return hashMap.get(name);
    }

    public boolean removeAnimal(String name) {
        return hashMap.remove(name) != null;
    }


    public Aviary(Size size) {
        this.size = size;
    }
}

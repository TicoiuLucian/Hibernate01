package org.example;


import org.example.entity.Animal;
import org.example.service.AnimalService;
import org.example.service.Service;

public class Main {

    public static void main(String[] args) {
        Service<Animal> animalService = new AnimalService();
        System.out.println(animalService.persist(new Animal("puffulete")));
    }
}
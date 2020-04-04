package io.github.czliu.DI.services;

import org.springframework.context.annotation.Profile;

@Profile({"dog", "default"})
public class DogPetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}

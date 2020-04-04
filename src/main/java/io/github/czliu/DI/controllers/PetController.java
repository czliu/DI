package io.github.czliu.DI.controllers;

import io.github.czliu.DI.services.PetService;

public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}

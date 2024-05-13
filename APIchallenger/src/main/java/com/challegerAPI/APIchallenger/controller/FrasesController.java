package com.challegerAPI.APIchallenger.controller;

import com.challegerAPI.APIchallenger.dto.FraseDto;
import com.challegerAPI.APIchallenger.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @Autowired
    FrasesService frasesService;

    @GetMapping("/series/frases")
    public FraseDto listFrases(){
        var s=frasesService.getFrasesAleatorios();
        System.out.println(s);
       return frasesService.getFrasesAleatorios();

    }

}

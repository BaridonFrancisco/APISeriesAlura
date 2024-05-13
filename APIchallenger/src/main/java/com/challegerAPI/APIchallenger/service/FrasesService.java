package com.challegerAPI.APIchallenger.service;

import com.challegerAPI.APIchallenger.dto.FraseDto;
import com.challegerAPI.APIchallenger.model.Frase;
import com.challegerAPI.APIchallenger.repository.IFrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private IFrasesRepository iFrasesRepository;

    public FraseDto getFrasesAleatorios(){
        Frase f=iFrasesRepository.getRramdomFrase();
        return new FraseDto(f.getTitulo(),f.getFrase(),f.getPoster(),f.getPersonaje());
    }

}

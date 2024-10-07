package com.pzampi.zegeojson.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pzampi.zegeojson.models.Partner;
import com.pzampi.zegeojson.repositories.PartnerRepository;

@Service
public class PartnetService implements Serializable{
    private static final long serialVersionUID = 1L;

    @Autowired
    private PartnerRepository repository;

    public List<Partner> listAll(){
        return repository.findAll();
    }
}

package com.pzampi.zegeojson.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pzampi.zegeojson.models.Partner;
import com.pzampi.zegeojson.services.PartnetService;

@RestController
@RequestMapping(value = "/partners")
public class PartnerController {

    @Autowired
    private PartnetService service;

    @GetMapping
    public ResponseEntity<List<Partner>> findAll(){
        List<Partner> obj = service.listAll();
        return ResponseEntity.ok().body(obj); 
    }
}

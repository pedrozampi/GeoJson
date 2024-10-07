package com.pzampi.zegeojson.models.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.pzampi.zegeojson.models.Coordinate;
import com.pzampi.zegeojson.models.GeoLocation;
import com.pzampi.zegeojson.models.Partner;
import com.pzampi.zegeojson.repositories.PartnerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private PartnerRepository partnerRepository;

    @Override
    public void run(String... args) throws Exception {
        Set<Coordinate> list = new HashSet<>();
        list.add(new Coordinate(30.0, 20.0));
        list.add(new Coordinate(45.0, 40.0));
        list.add(new Coordinate(10.0, 40.0));
        list.add(new Coordinate(30.0, 20.0));

        Set<Coordinate> list2 = new HashSet<>();
        list2.add(new Coordinate(-46.0, -21.0));

        GeoLocation g1 =  new GeoLocation(null, "MultiPolygon", list, null);
        GeoLocation g2 = new GeoLocation(null, "Point", list2, null);

        Partner p1 = new Partner(null, "Zé da Silva", "1432132123891/0001", g1 , null);
        partnerRepository.saveAll(Arrays.asList(p1));
    }

}

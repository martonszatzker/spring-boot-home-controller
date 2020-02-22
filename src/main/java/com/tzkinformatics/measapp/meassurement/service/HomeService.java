package com.tzkinformatics.measapp.meassurement.service;

import com.tzkinformatics.measapp.meassurement.domain.Meassurement;
import com.tzkinformatics.measapp.meassurement.repository.MeassurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;

@Service
public class HomeService {

    MeassurementRepository meassurementRepository;

    @Autowired
    public void setMeassurementRepository(MeassurementRepository meassurementRepository) {
        this.meassurementRepository = meassurementRepository;
    }

    public ArrayList<Meassurement> getMeassurements(){
        return meassurementRepository.findAll();
    }

    public Meassurement getMeassurement(String id){
        return meassurementRepository.findFirstById(id);
    }

    @PostConstruct
    public void init(){
        Meassurement meassurement1 = new Meassurement("Temperature","Eger","Marci",new Date());
        Meassurement meassurement2 = new Meassurement("Altitude","Székesfehérvár");
        Meassurement meassurement3 = new Meassurement("Humidity","Székesfehérvár");
        meassurementRepository.save(meassurement1);
        meassurementRepository.save(meassurement2);
        meassurementRepository.save(meassurement3);
    }


}

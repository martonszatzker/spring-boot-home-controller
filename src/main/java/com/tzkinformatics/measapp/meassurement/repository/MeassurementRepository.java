package com.tzkinformatics.measapp.meassurement.repository;

import com.tzkinformatics.measapp.meassurement.domain.Meassurement;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface MeassurementRepository extends CrudRepository<Meassurement,Long> {

    ArrayList<Meassurement> findAll();

    Meassurement findFirstById(String id);


}

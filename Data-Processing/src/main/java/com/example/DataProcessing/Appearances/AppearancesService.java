package com.example.DataProcessing.Appearances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AppearancesService {
    @Autowired
    private AppearancesRepository appearancesRepository;

    //Get all
    public List<Appearances> listAllAppearances(){
        return appearancesRepository.findAll();
    }

    //Post
    public void saveAppearances(Appearances appearances){
        appearancesRepository.save(appearances);
    }

    //Get with id
    public Appearances getAppearances(Integer appearanceID){
        return appearancesRepository.findById(appearanceID).get();
    }

    //Delete
    public void deleteAppearances(Integer appearanceID){
        appearancesRepository.deleteById(appearanceID);
    }
}

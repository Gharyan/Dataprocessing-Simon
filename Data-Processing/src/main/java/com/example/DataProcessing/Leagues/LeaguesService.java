package com.example.DataProcessing.Leagues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class LeaguesService {
    @Autowired
    private LeaguesRepository leaguesRepository;

    //Get all
    public List<Leagues> listAllLeagues(){
        return leaguesRepository.findAll();
    }

    //Post
    public void saveLeagues(Leagues leagues){
        leaguesRepository.save(leagues);
    }

    //Get with id
    public Leagues getLeagues(Integer leagueID){
        return leaguesRepository.findById(leagueID).get();
    }

    //Delete
    public void deleteLeagues(Integer leagueID){
        leaguesRepository.deleteById(leagueID);
    }
}

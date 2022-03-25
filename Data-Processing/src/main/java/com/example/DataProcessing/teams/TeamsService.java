package com.example.DataProcessing.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeamsService {
    @Autowired
    private TeamsRepository teamsRepository;

    //Get all
    public List<Teams> listAllTeams(){
        return teamsRepository.findAll();
    }

    //Post
    public void saveTeams(Teams teams){
        teamsRepository.save(teams);
    }

    //Get with id
    public Teams getTeams(Integer teamID){
        return teamsRepository.findById(teamID).get();
    }

    //Delete
    public void deleteTeams(Integer teamID){
        teamsRepository.deleteById(teamID);
    }
}

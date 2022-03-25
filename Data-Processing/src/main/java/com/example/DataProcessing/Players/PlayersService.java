package com.example.DataProcessing.Players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlayersService {
    @Autowired
    private PlayersRepository playersRepository;

    //Get all
    public List<Players> listAllPlayers(){
        return playersRepository.findAll();
    }

    //Post
    public void savePlayers(Players players){
        playersRepository.save(players);
    }

    //Get with id
    public Players getPlayers(Integer playerID){
        return playersRepository.findById(playerID).get();
    }

    //Delete
    public void deletePlayers(Integer playerID){
        playersRepository.deleteById(playerID);
    }
}

package com.example.DataProcessing.Players;

import com.sun.xml.bind.v2.model.core.NonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/players")
public class PlayersController {
    @Autowired
    PlayersService playersService;

    @GetMapping("")
    public List<Players> list() {
        return playersService.listAllPlayers();
    }

    @GetMapping("/{playerID}")
    public ResponseEntity<Players> get(@PathVariable Integer playerID) {
        try {
            Players players = playersService.getPlayers(playerID);
            return new ResponseEntity<Players>(players, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Players>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Players players) {
        playersService.savePlayers(players);
    }

    @PutMapping("/{playerID}")
    public ResponseEntity<?> update(@RequestBody Players players, @PathVariable Integer playerID) {
        try {
            Players existPlayers = playersService.getPlayers(playerID);
            players.setPlayerID(playerID);
            playersService.savePlayers(players);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{playerID}")
    public void delete(@PathVariable Integer playerID) {
        playersService.deletePlayers(playerID);
    }
}

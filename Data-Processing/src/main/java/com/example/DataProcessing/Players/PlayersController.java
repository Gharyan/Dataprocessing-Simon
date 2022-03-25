package com.example.DataProcessing.Players;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import com.sun.xml.bind.v2.model.core.NonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

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

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON.ALL_VALUE)
    public void add(@RequestBody Players  players) {
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

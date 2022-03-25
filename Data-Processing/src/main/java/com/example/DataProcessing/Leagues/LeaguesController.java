package com.example.DataProcessing.Leagues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/leagues")
public class LeaguesController {
    @Autowired
    LeaguesService leaguesService;

    @GetMapping("")
    public List<Leagues> list() {
        return leaguesService.listAllLeagues();
    }

    @GetMapping("/{leagueID}")
    public ResponseEntity<Leagues> get(@PathVariable Integer leagueID) {
        try {
            Leagues leagues = leaguesService.getLeagues(leagueID);
            return new ResponseEntity<Leagues>(leagues, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Leagues>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Leagues leagues) {
        leaguesService.saveLeagues(leagues);
    }

    @PutMapping("/{leagueID}")
    public ResponseEntity<?> update(@RequestBody Leagues leagues, @PathVariable Integer leagueID) {
        try {
            Leagues existLeagues = leaguesService.getLeagues(leagueID);
            leagues.setLeagueID(leagueID);
            leaguesService.saveLeagues(leagues);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{leagueID}")
    public void delete(@PathVariable Integer leagueID) {
        leaguesService.deleteLeagues(leagueID);
    }
}

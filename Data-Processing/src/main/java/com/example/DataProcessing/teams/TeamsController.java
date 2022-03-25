package com.example.DataProcessing.teams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/teams")
public class TeamsController {
    @Autowired
    TeamsService teamsService;

    @GetMapping("")
    public List<Teams> list() {
        return teamsService.listAllTeams();
    }

    @GetMapping("/{teamsID}")
    public ResponseEntity<Teams> get(@PathVariable Integer teamsID) {
        try {
            Teams teams = teamsService.getTeams(teamsID);
            return new ResponseEntity<Teams>(teams, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Teams>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Teams teams) {
        teamsService.saveTeams(teams);
    }

    @PutMapping("/{teamID}")
    public ResponseEntity<?> update(@RequestBody Teams teams, @PathVariable Integer teamID) {
        try {
            Teams existTeams = teamsService.getTeams(teamID);
            teams.setTeamID(teamID);
            teamsService.saveTeams(teams);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{teamID}")
    public void delete(@PathVariable Integer teamID) {
        teamsService.deleteTeams(teamID);
    }
}

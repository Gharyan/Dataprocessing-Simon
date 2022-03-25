package com.example.DataProcessing.Appearances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/appearances")
public class AppearancesController {
    @Autowired
    AppearancesService appearancesService;

    @GetMapping("")
    public List<Appearances> list() {
        return appearancesService.listAllAppearances();
    }

    @GetMapping("/{appearanceID}")
    public ResponseEntity<Appearances> get(@PathVariable Integer appearanceID) {
        try {
            Appearances appearances = appearancesService.getAppearances(appearanceID);
            return new ResponseEntity<Appearances>(appearances, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Appearances>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Appearances appearances) {
        appearancesService.saveAppearances(appearances);
    }

    @PutMapping("/{appearanceID}")
    public ResponseEntity<?> update(@RequestBody Appearances appearances, @PathVariable Integer appearanceID) {
        try {
            Appearances existAppearances = appearancesService.getAppearances(appearanceID);
            appearances.setAppearanceID(appearanceID);
            appearancesService.saveAppearances(appearances);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{appearanceID}")
    public void delete(@PathVariable Integer appearanceID) {
        appearancesService.deleteAppearances(appearanceID);
    }
}

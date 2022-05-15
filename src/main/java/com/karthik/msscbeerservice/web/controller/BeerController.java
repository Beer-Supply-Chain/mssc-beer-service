package com.karthik.msscbeerservice.web.controller;

import com.karthik.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    //private BeerService beerService;
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId){
        //beerService.getBeer(beerId);
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity createBeer(@RequestBody BeerDto beerDto){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@RequestBody BeerDto beerDto,@PathVariable("beerId")UUID beerId){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId")UUID beerId){

    }
}

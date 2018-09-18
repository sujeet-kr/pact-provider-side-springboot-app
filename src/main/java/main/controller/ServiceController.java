package main.controller;

import main.bean.Country;
import main.bean.PactSample;
import main.model.PactPostModel;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping(value = "/heartBeat", method = RequestMethod.GET)
    public ResponseEntity<String> heartBeat(){
        return new ResponseEntity<String>("Test Pass", HttpStatus.OK);
    }

    @RequestMapping(value = "/getCountry")
    public ResponseEntity<Country> getCountry(){
        Country country = new Country();
        country.setName("India");
        country.setPopulation(1234567);
        country.setCapital("New Delhi");
        country.setContinent("Asia");

        HttpHeaders header = new HttpHeaders();
        header.add("Responded","ServiceController");
        header.add("AppID", "132515-5264-sgsh345-6236h-25265");
        header.add("Content-Type","application/json");

        return ResponseEntity.accepted().headers(header).body(country);
    }


    @RequestMapping(value = "/getCountry2")
    public Country getCountry2(){
        Country country = new Country();
        country.setName("Canada");
        country.setPopulation(123456);
        country.setCapital("Ottawa");
        country.setContinent("North America");

        return country;
    }

    @RequestMapping(value = "/pact", method = RequestMethod.GET)
    public ResponseEntity<PactSample> getPact(){
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json");

        PactSample pactSample = new PactSample();
        pactSample.setName("sujeet");
        pactSample.setId(1234332945);
        pactSample.setCondition(true);

        return ResponseEntity.status(200).headers(header).body(pactSample);

    }


    @RequestMapping(value = "/pact", method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> postPact(@RequestBody PactPostModel pactPostSample){
        return ResponseEntity.status(201).body("successfull");
    }


}

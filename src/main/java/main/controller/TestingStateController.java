package main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingStateController {

    @RequestMapping(value = "tasks/pactStateChange", method = RequestMethod.POST)
    public ResponseEntity<String> pactStateChange(){
        return new ResponseEntity<String>("Test Pass", HttpStatus.OK);
    }
}

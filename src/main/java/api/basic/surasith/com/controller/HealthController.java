package api.basic.surasith.com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/Health")
public class HealthController {

    @GetMapping(path = "check")
    public ResponseEntity getHealth(){

        HashMap<String, String> response = new HashMap();
        response.put("status", HttpStatus.OK.name());
        response.put("message", "Success");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

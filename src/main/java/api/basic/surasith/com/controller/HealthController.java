package api.basic.surasith.com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.basic.surasith.com.entity.ApiResponseEntity;

@RestController
@RequestMapping("/Health")
public class HealthController {

    @GetMapping(path = "check")
    public ResponseEntity<ApiResponseEntity> getHealth(){
        ApiResponseEntity status = new ApiResponseEntity(HttpStatus.OK.value(), "Success");

        try{
            return new ResponseEntity<ApiResponseEntity>(status, HttpStatus.OK);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}

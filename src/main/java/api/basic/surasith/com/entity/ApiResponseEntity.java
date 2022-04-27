package api.basic.surasith.com.entity;


import org.springframework.http.HttpStatus;

public class ApiResponseEntity {
    public int status;
    public String message;

    public ApiResponseEntity(int status, String message){
        this.status = status;
        this.message = message;
    }
}

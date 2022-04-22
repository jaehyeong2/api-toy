package jjfact.apitest.dto;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ApiResponse<T> {
    private T data;
    private HttpStatus status;

    public ApiResponse() {
    }

    public ApiResponse(T data, HttpStatus status) {
        this.data = data;
        this.status = status;
    }
}

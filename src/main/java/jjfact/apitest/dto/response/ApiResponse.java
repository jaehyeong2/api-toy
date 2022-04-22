package jjfact.apitest.dto.response;

public class ApiResponse<T> {
    private T data;

    public ApiResponse(T data) {
        this.data = data;
    }
}

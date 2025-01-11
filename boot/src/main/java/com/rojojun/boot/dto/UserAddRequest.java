package com.rojojun.boot.dto;

public record UserAddRequest(
        String username,
        String email,
        String password
) {

}

package com.testing.gateway.entity;

public record ProductResponse(
        String id,
        String date,
        Boolean success,
        String result
) {
}

package com.sbaldasso.library_store.domain;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BookStatus {
    AVAILABLE("avaliable"),
    NOT_AVAILABLE("not-avaliable");

    private final String status;


    BookStatus(String status) {
        this.status = status;
    }

    @JsonValue
    public String getStatus(){
        return this.status;
    }
}

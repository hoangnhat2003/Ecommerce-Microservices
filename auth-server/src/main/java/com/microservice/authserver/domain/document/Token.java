package com.microservice.authserver.domain.document;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class Token implements Serializable {
    private String token;
    private String username;
    private String roles;
    private long currentDate;
    private long expireTime;
}

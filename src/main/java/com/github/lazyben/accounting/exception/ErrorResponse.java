package com.github.lazyben.accounting.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private String bizErrorCode;
    private String message;
}

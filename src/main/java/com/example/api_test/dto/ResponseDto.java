package com.example.api_test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDto {
    private Long member_id;
    private String user_id;
    private String user_pw;
    private String user_nickname;
}

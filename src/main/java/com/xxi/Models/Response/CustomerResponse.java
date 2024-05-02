package com.xxi.Models.Response;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
    private String name;
    private String email;
}

package com.xxi.Models.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {
    private String name;
    private String birthDate;
    private String phoneNumber;
    private String email;
    private String address;
}

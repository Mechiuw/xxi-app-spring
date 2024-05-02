package com.xxi.Controller;

import com.xxi.Models.Request.CustomerRequest;
import com.xxi.Models.Response.CustomerResponse;
import com.xxi.Service.CustomerService;
import com.xxi.constant.EndPointApp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(EndPointApp.CUSTOMER)
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping("/dto")
    private CustomerResponse createWithDto(@RequestBody CustomerRequest customerRequest){
        return customerService.create(customerRequest);
    }
}

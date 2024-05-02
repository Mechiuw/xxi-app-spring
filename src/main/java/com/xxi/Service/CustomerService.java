package com.xxi.Service;

import com.xxi.Models.Request.CustomerRequest;
import com.xxi.Models.Response.CustomerResponse;

public interface CustomerService {
    CustomerResponse create(CustomerRequest customerRequest);
}

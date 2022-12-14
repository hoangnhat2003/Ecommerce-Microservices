package com.microservice.orderservice.domain.request;

import com.microservice.orderservice.domain.model.AddressForm;
import com.microservice.orderservice.domain.model.PaymentDetailForm;
import lombok.Data;

@Data
public class CreateOrderRequest {
    private Long customerId;
    private String status;
    private Long productId;
    private Long quantity;
    private Double amount;
    private AddressForm billingAddress;
    private AddressForm shippingAddress;
    private PaymentDetailForm paymentDetails;
}

package com.gorgona.ecommerce.payment;

import com.gorgona.ecommerce.customer.CustomerResponse;
import com.gorgona.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}

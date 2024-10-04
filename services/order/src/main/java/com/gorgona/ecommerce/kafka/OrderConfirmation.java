package com.gorgona.ecommerce.kafka;

import com.gorgona.ecommerce.customer.CustomerResponse;
import com.gorgona.ecommerce.order.PaymentMethod;
import com.gorgona.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}

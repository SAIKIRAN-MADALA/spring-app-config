package com.gproject.OrderService.model;

import com.gproduct.PaymentService.model.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    private long orderId;
    private Instant OrderDate;
    private String orderStatus;
    private long amount;
    private ProductDetails productDetails;
    private PaymentDetails paymentDetails;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class ProductDetails {
        private String productName;
        private long productId;
        private long quantity;
        private long price;
    }
    @Builder
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PaymentDetails {
        private long paymentId;
        private String status;
        private PaymentMode paymentMode;
        private long amount;
        private Instant paymentDate;
        private long orderId;
    }
}
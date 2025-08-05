package com.tsinjo.app.models;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Payment {
  private String paymentRef;
  private Long amount;
  private PayType paytype;
  private PaymentStatus status;
  private LocalDateTime creationInstant;
}

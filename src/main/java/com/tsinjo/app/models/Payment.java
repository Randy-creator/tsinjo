package com.tsinjo.app.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String paymentRef;
  private Long amount;

  @Enumerated(EnumType.STRING)
  private PaymentStatus status;

  private LocalDateTime creationInstant;
}

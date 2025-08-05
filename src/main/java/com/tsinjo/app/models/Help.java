package com.tsinjo.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Help {
  private Beneficiary beneficiary;
  private Payment payment;
  String description;
}

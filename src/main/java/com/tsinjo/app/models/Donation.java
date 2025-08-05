package com.tsinjo.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Donation {
  private Donor donor;
  private Payment payment;
}

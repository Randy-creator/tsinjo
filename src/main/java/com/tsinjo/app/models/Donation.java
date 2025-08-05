package com.tsinjo.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donation {
  private Donor donor;
  private Payment payment;
}

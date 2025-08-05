package com.tsinjo.app.endpoint.rest.controller;

import com.tsinjo.app.models.Donation;
import com.tsinjo.app.repository.DonationRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class DonationController {

  private final DonationRepository donationRepository;

  @GetMapping("/")
  public String showDonations(Model model) {
    List<Donation> donations = donationRepository.findAllByOrderByPayment_CreationInstantDesc();
    model.addAttribute("donations", donations);

    return "index";
  }
}

package com.tsinjo.app.service;

import com.tsinjo.app.models.PaymentStatus;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class VolaService {
  private final RestTemplate restTemplate;

  @Value("${BASE_URL}")
  private String volaUrl;

  @Value("${API_KEY}")
  private String apiKey;

  public PaymentStatus submitPayment(String payerEmail, String pspPaymentId) {
    String url =
        String.format(
            "%s/payment?apiKey=%s&payerEmail=%s&pspType=ORANGE_MONEY&pspPaymentId=%s",
            volaUrl, apiKey, payerEmail, pspPaymentId);

    try {
      ResponseEntity<Map> response = restTemplate.postForEntity(url, null, Map.class);
      return PaymentStatus.valueOf((String) response.getBody().get("verificationStatus"));
    } catch (Exception e) {
      throw new RuntimeException("Erreur lors de l'appel à Vola API", e);
    }
  }
}

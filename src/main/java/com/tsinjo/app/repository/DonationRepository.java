package com.tsinjo.app.repository;

import com.tsinjo.app.models.Donation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {

  List<Donation> findAllByOrderByPayment_CreationInstantDesc();
}

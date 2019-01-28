package com.addolux.purchaserequest.repository;

import com.addolux.purchaserequest.dto.PurchaseRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRequestRepository extends JpaRepository<PurchaseRequestDTO, Long> {
}

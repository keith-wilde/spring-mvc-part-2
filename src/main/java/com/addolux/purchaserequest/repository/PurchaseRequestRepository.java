package com.addolux.purchaserequest.repository;

import com.addolux.purchaserequest.dto.PurchaseRequestDTO;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRequestRepository extends CrudRepository<PurchaseRequestDTO,Long> {
}

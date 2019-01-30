package com.addolux.purchaserequest.service.impl;

import com.addolux.purchaserequest.dto.PurchaseRequestDTO;
import com.addolux.purchaserequest.repository.PurchaseRequestRepository;
import com.addolux.purchaserequest.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class PurchaseRequestServiceImpl implements PurchaseRequestService {

    @Autowired
    private PurchaseRequestRepository purchaseRequestRepository;

    @Override
    public List<PurchaseRequestDTO> getAllPurchaseRequests() {
        if (purchaseRequestRepository.count() == 0 ) {

            PurchaseRequestDTO purchaseRequestDTO1 = new PurchaseRequestDTO();
            purchaseRequestDTO1.setJustification("Justification 1");
            purchaseRequestDTO1.setDate(LocalDate.now());
            purchaseRequestDTO1.setPoNumber("1234");

            purchaseRequestRepository.save(purchaseRequestDTO1);

            PurchaseRequestDTO purchaseRequestDTO2 = new PurchaseRequestDTO();
            purchaseRequestDTO2.setJustification("Justification 2");
            purchaseRequestDTO2.setDate(LocalDate.now().minusDays(2));
            purchaseRequestDTO2.setPoNumber("5678");

            purchaseRequestRepository.save(purchaseRequestDTO2);
        }

        return (List<PurchaseRequestDTO>) purchaseRequestRepository.findAll();
    }

}

package com.addolux.purchaserequest.service.impl;

import com.addolux.purchaserequest.dto.PurchaseRequestDTO;
import com.addolux.purchaserequest.repository.PurchaseRequestRepository;
import com.addolux.purchaserequest.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PurchaseRequestServiceImpl implements PurchaseRequestService {

    @Autowired
    private PurchaseRequestRepository purchaseRequestRepository;

    @Override
    public List<PurchaseRequestDTO> getAllPurchaseRequests() {
        return getDummyPurchaseRequestData();
    }

    private List<PurchaseRequestDTO> getDummyPurchaseRequestData() {
        List<PurchaseRequestDTO> purchaseRequestDTOs = new ArrayList<PurchaseRequestDTO>();
        //Create dummy data here

        PurchaseRequestDTO purchaseRequestDTO = new PurchaseRequestDTO();
        purchaseRequestDTO.setDate("12345");
        purchaseRequestDTO.setJustification("thes are words");
        purchaseRequestDTO.setPoNumber("12345");


        purchaseRequestDTOs.add(purchaseRequestRepository.save(purchaseRequestDTO));
        return purchaseRequestDTOs;
    }
}

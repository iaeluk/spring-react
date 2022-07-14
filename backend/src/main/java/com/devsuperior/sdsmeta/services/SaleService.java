package com.devsuperior.sdsmeta.services;

import java.util.List;

import com.devsuperior.sdsmeta.entities.Sale;
import com.devsuperior.sdsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }
}

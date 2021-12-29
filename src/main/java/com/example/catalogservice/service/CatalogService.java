package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntity;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

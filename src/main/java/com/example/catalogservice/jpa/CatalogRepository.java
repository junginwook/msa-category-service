package com.example.catalogservice.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
    CatalogEntity findByProductId(String productId);
}

package com.ecom.catalog.service;

import com.ecom.catalog.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

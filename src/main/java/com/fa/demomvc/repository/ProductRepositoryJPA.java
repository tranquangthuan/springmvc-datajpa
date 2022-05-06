package com.fa.demomvc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fa.demomvc.entity.Product;

//@Repository
public interface ProductRepositoryJPA extends PagingAndSortingRepository<Product, Long> {
}

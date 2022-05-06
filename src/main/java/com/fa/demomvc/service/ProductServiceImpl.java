package com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fa.demomvc.entity.Product;
import com.fa.demomvc.repository.ProductRepositoryJPA;

@Service
public class ProductServiceImpl implements ProductService {

	//@Autowired
	// private ProductRepository productRepository;
	@Autowired
	private ProductRepositoryJPA productRepositoryJPA;

	@Override
	@Transactional
	public List<Product> findAll() {
		return (List<Product>) productRepositoryJPA.findAll();
	}

	@Override
	@Transactional
	public void saveOrUpdate(Product product) {
		productRepositoryJPA.save(product);
	}

	@Override
	@Transactional
	public void delete(long id) {
		Product product = findById(id);
		if (product != null) {
			productRepositoryJPA.delete(product);
		}
	}

	@Override
	@Transactional
	public Product findById(long id) {
		return productRepositoryJPA.findById(id).orElse(null);
	}

}

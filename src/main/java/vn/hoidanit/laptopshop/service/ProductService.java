package vn.hoidanit.laptopshop.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.repository.ProductRepository;

@Service
public class ProductService {
  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Product createProduct(Product pr) {
    return this.productRepository.save(pr);
  }

  public List<Product> fetchProducts() {
    return this.productRepository.findAll();
  }

  public void deleteProduct(long id) {
    this.productRepository.deleteById(id);
  }

  public Optional<Product> fetchProductById(long id) {
    return this.productRepository.findById(id);
  }
}

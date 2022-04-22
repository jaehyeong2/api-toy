package jjfact.apitest.service.product;

import jjfact.apitest.domain.categorry.Category;
import jjfact.apitest.domain.product.Product;

import java.util.List;

public interface ProductService {
    Product getProduct(Long id);
    List<Product> getProductList();
    void insertProduct(Product product);
    void delete(Long id);
    void update(Long id);
}

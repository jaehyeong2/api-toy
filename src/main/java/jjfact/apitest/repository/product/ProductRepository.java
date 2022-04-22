package jjfact.apitest.repository.product;

import jjfact.apitest.domain.categorry.Category;
import jjfact.apitest.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

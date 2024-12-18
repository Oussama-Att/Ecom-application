package oss.att.orderservice.repository;

import oss.att.orderservice.entities.ProductItem;
import oss.att.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}

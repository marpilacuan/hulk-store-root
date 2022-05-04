/**
 * 
 */
package ec.com.hs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.hs.model.ProductEntity;

/**
 * Product repository.
 * 
 * @author mpilacuan
 *
 */
public interface IProductRepository extends JpaRepository<ProductEntity, Long> {

}

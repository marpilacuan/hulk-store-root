/**
 * 
 */
package ec.com.hs.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ec.com.hs.model.ProductRecordEntity;

/**
 * Product record repository.
 * 
 * @author mpilacuan
 *
 */
public interface IProductRecordRepository extends JpaRepository<ProductRecordEntity, Long>{
	
	@Query("SELECT p FROM ProductRecordEntity p WHERE p.idProduct = ?1")
	Collection<ProductRecordEntity> findAllByIdProduct(Long idProduct);

}

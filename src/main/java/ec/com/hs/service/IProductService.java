/**
 * 
 */
package ec.com.hs.service;

import java.util.Collection;

import ec.com.hs.model.ProductEntity;
import ec.com.hs.vo.ProductVo;

/**
 * Product service.
 * 
 * @author mpilacuan
 *
 */
public interface IProductService {

	/**
	 * Method find all products.
	 * 
	 * @return collection
	 */
	Collection<ProductEntity> findAllProducts();

	/**
	 * Method to create or update product.
	 * 
	 * @param productVo
	 * @return productVo
	 */
	ProductVo createOrUpdateProduct(ProductVo productVo);

	/**
	 * Method to find by id,
	 * 
	 * @param idProduct
	 * @return productVo
	 */
	ProductVo findById(Long idProduct);
}

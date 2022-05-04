/**
 * 
 */
package ec.com.hs.service;

import java.util.Collection;

import ec.com.hs.model.ProductRecordEntity;
import ec.com.hs.vo.ProductRecordVo;

/**
 * Product record service.
 * 
 * @author mpilacuan
 *
 */
public interface IProductRecordService {

	/**
	 * Method find all record for product.
	 * 
	 * @param idProduct
	 * @return collection
	 */
	Collection<ProductRecordEntity> findRecordByIdProduct(Long idProduct);

	/**
	 * Method create or update record of product.
	 * 
	 * @param productRecordVo
	 * @return productRecordVo
	 */
	ProductRecordVo createOrUpdate(ProductRecordVo productRecordVo);
}

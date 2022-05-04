/**
 * 
 */
package ec.com.hs.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.hs.model.ProductEntity;
import ec.com.hs.repository.IProductRepository;
import ec.com.hs.service.IProductService;
import ec.com.hs.vo.ProductVo;

/**
 * Product service implementation.
 * 
 * @author mpilacuan
 *
 */
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;

	@Override
	public Collection<ProductEntity> findAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public ProductVo createOrUpdateProduct(ProductVo productVo) {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setId(productVo.getId());
		productEntity.setName(productVo.getName());
		productEntity.setCategory(productVo.getCategory());
		productEntity.setPrice(productVo.getPrice());
		productEntity.setStock(productVo.getStock());
		productRepository.save(productEntity);
		return new ProductVo(productEntity.getId(), productEntity.getName(), productEntity.getCategory(),
				productEntity.getPrice(), productEntity.getStock());
	}

	@Override
	public ProductVo findById(Long idProduct) {
		Optional<ProductEntity> response = productRepository.findById(idProduct);
		return new ProductVo(response.get().getId(), response.get().getName(), response.get().getCategory(),
				response.get().getPrice(), response.get().getStock());
	}

}

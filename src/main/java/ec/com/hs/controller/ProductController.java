/**
 * 
 */
package ec.com.hs.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.hs.model.ProductEntity;
import ec.com.hs.service.IProductService;
import ec.com.hs.vo.ProductVo;

/**
 * Product controller.
 * 
 * @author mpilacuan
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/product/")
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping(value = "/findAllProducts")
	public ResponseEntity<Collection<ProductEntity>> findAllProducts() {
		return ResponseEntity.ok(productService.findAllProducts());
	}

	@PostMapping(value = "/createOrUpdateProduct")
	public ResponseEntity<ProductVo> createOrUpdateProduct(@RequestBody ProductVo productVo) {
		ProductVo response = productService.createOrUpdateProduct(productVo);
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/findById/{idProduct}")
	public ResponseEntity<ProductVo> findById(@PathVariable("idProduct") Long idProduct) {
		return ResponseEntity.ok(productService.findById(idProduct));
	}
}

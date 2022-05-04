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

import ec.com.hs.model.ProductRecordEntity;
import ec.com.hs.service.IProductRecordService;
import ec.com.hs.vo.ProductRecordVo;

/**
 * Product record controller.
 * 
 * @author mpilacuan
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/productRecord/")
public class ProductRecordController {

	@Autowired
	private IProductRecordService productRecordService;

	@GetMapping(value = "/findRecordByIdProduct/{idProduct}")
	public ResponseEntity<Collection<ProductRecordEntity>> findRecordByIdProduct(
			@PathVariable("idProduct") Long idProduct) {
		return ResponseEntity.ok(productRecordService.findRecordByIdProduct(idProduct));
	}

	@PostMapping(value = "/createOrUpdateProductRecord")
	public ResponseEntity<ProductRecordVo> createOrUpdateProductRecord(@RequestBody ProductRecordVo productRecordVo) {
		ProductRecordVo response = productRecordService.createOrUpdate(productRecordVo);
		return ResponseEntity.ok(response);
	}
}

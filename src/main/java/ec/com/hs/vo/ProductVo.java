/**
 * 
 */
package ec.com.hs.vo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Product Vo.
 * 
 * @author mpilacuan
 *
 */
@Data
@AllArgsConstructor
public class ProductVo {

	private Long id;

	private String name;

	private String category;

	private BigDecimal price;

	private Integer stock;

}

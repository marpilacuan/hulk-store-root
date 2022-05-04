/**
 * 
 */
package ec.com.hs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Product record Vo.
 * 
 * @author mpilacuan
 *
 */
@Data
@AllArgsConstructor
public class ProductRecordVo {

	private Long id;

	private Long idProduct;

	private String typeRecord;

	private String dateRecord;

	private Integer totalItems;
}

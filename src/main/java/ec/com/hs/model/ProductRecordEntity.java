/**
 * 
 */
package ec.com.hs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Product record entity.
 * 
 * @author mpilacuan
 *
 */
@Entity
@Table(name = "hstpersonrecord")
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
public class ProductRecordEntity extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "is_product")
	private Long idProduct;

	private String typeRecord;

	private Date dateRecord;

	@Column(name = "total_items")
	private Integer totalItems;

}

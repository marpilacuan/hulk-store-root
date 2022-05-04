/**
 * 
 */
package ec.com.hs.model;

import java.util.Date;

import javax.persistence.Column;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;

/**
 * Audit model.
 * 
 * @author mpilacuan
 *
 */
@Data
public class AuditModel {

	@Column(name = "created_by")
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@LastModifiedDate
	@Column(name = "modified_date")
	private Date modifiedDate;

	private Boolean status;
}

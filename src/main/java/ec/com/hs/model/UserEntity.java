/**
 * 
 */
package ec.com.hs.model;

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
 * User entity.
 * 
 * @author mpilacuan
 *
 */
@Entity
@Table(name = "hstusers")
@Data
@EntityListeners(AuditingEntityListener.class)
@EqualsAndHashCode(callSuper = false)
public class UserEntity extends AuditModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nickname;

	private String password;

	private String email;

	@Column(name = "is_admin")
	private Boolean isAdmin;

}

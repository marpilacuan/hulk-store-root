/**
 * 
 */
package ec.com.hs.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User Vo.
 * 
 * @author mpilacuan
 *
 */
@Data
@AllArgsConstructor
public class UserVo {

	private String nickname;

	private String password;

	private String email;

	private Boolean isAdmin;
}

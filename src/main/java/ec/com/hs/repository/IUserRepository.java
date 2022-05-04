/**
 * 
 */
package ec.com.hs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ec.com.hs.model.UserEntity;

/**
 * User repository.
 * 
 * @author mpilacuan
 *
 */
public interface IUserRepository extends JpaRepository<UserEntity, Long>{

	@Query("SELECT u FROM UserEntity u WHERE u.nickname = ?1")
	UserEntity findUserByNickname(String nickName);
	
	@Query("SELECT u FROM UserEntity u WHERE u.nickname = ?1 and u.password = ?2")
	UserEntity findUserByNicknamePassword(String nickName, String password);
}

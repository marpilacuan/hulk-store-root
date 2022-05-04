/**
 * 
 */
package ec.com.hs.service;

import ec.com.hs.vo.UserVo;

/**
 * User service.
 * 
 * @author mpilacuan
 *
 */
public interface IUserService {

	/**
	 * Method to create or update user.
	 * 
	 * @param userVo
	 * @return userVo
	 */
	UserVo createOrUpadateUser(UserVo userVo);

	/**
	 * Method to sing in.
	 * 
	 * @param nickname
	 * @param password
	 * @return userVo
	 */
	UserVo singIn(String nickname, String password);

}

/**
 * 
 */
package ec.com.hs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.hs.model.UserEntity;
import ec.com.hs.repository.IUserRepository;
import ec.com.hs.service.IUserService;
import ec.com.hs.vo.UserVo;

/**
 * User service implementation.
 * 
 * @author mpilacuan
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public UserVo createOrUpadateUser(UserVo userVo) {
		UserEntity userFound = userRepository.findUserByNickname(userVo.getNickname());
		if (userFound != null) {
			userFound.setPassword(userVo.getPassword());
			userFound.setEmail(userVo.getEmail());
			userFound.setIsAdmin(userVo.getIsAdmin());
			userRepository.save(userFound);
			return new UserVo(userFound.getNickname(), userFound.getPassword(), userFound.getEmail(),
					userFound.getIsAdmin());
		} else {
			UserEntity user = new UserEntity();
			user.setNickname(userVo.getNickname());
			user.setPassword(userVo.getPassword());
			user.setEmail(userVo.getEmail());
			user.setIsAdmin(userVo.getIsAdmin());
			userRepository.save(user);
			return new UserVo(user.getNickname(), user.getPassword(), user.getEmail(), user.getIsAdmin());
		}

	}

	@Override
	public UserVo singIn(String nickname, String password) {
		UserEntity userFound = userRepository.findUserByNicknamePassword(nickname, password);
		if (userFound != null) {
			return new UserVo(userFound.getNickname(), userFound.getPassword(), userFound.getEmail(),
					userFound.getIsAdmin());
		} else {
			return new UserVo("", "", "", false);
		}

	}

}

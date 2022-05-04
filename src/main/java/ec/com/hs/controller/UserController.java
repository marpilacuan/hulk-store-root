/**
 * 
 */
package ec.com.hs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ec.com.hs.service.IUserService;
import ec.com.hs.vo.UserVo;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User controller.
 * 
 * @author mpilacuan
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/user/")
public class UserController {

	@Autowired
	private IUserService userService;

	@PostMapping(value = "/createOrUpdateUser")
	public ResponseEntity<UserVo> createOrUpadateUser(@RequestBody UserVo userVo) {
		UserVo response = userService.createOrUpadateUser(userVo);
		return ResponseEntity.ok(response);

	}
	
	@GetMapping(value = "/singIn/{nickname}")
	public ResponseEntity<UserVo> singIn(@PathVariable("nickname") String nickname) {
		UserVo response = userService.singIn(nickname);
		return ResponseEntity.ok(response);
	}

}

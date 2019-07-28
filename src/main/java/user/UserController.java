package user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return userDaoService.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User findUser(@PathVariable Integer id) {
		return userDaoService.findOne(id);
	}
	
	@PostMapping("/user/saveUser")
	public User saveUser(@RequestBody User user) {
		return userDaoService.save(user);
	}
}

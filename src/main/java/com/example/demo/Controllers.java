package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controllers {
	@Autowired
	private UserRepo userRepo;
	@RequestMapping("/")
	public String getPage() {
	return "welcome";
}
	@GetMapping(value="/users")
	public List<User> getUsers() {
		return userRepo.findAll();
	}
	@PostMapping(value="/save")
	public String saveUser(@RequestBody User user) {
		userRepo.save(user);
		return "saved..";}
	
	@PutMapping(value="update/{id}")
	public String updateUser(@PathVariable long id,@RequestBody User user) {
		User u=userRepo.findById(id).get();
		u.setFname(user.getFname());
		u.setLname(user.getLname());
		u.setOccupation(user.getOccupation());
		u.setAge(user.getAge());
		userRepo.save(u);
		return "updated details";
}
@DeleteMapping(value="/delete/{id}")
public String deleteUser(@PathVariable long id) {
	User del=userRepo.findById(id).get();
	userRepo.delete(del);
	return "deleted  user with id"+id;
	
}

}




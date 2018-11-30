package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.repositories.UserRepository;
import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models.User;

@RestController
@RequestMapping("/users")
public class UserController {
	 @Autowired
	  private UserRepository repository;
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<User> getAllUser() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public User getUserById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyUserById(@PathVariable("id") ObjectId id, @Valid @RequestBody User user) {
	    user.set_id(id);
	    repository.save(user);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public User createUser(@Valid @RequestBody User users) {
		  users.set_id(ObjectId.get());
	    repository.save(users);
	    return users;
	   
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteUser(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }
}

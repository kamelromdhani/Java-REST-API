package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models.User;

public interface UserRepository  extends MongoRepository<User, String>{
	 User findBy_id(ObjectId _id);
	 List<User> findAll();
	 User save(User pets);
	 void delete(User pets);
}

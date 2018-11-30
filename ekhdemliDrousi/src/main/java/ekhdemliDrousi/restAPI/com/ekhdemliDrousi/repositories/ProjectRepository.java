package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models.Project;

public interface ProjectRepository extends MongoRepository<Project, String>{
	Project findBy_id(ObjectId _id);
	 List<Project> findAll();
	 Project save(Project project);
	 void delete(Project project);
}

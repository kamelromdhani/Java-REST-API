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

import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models.Project;
import ekhdemliDrousi.restAPI.com.ekhdemliDrousi.repositories.ProjectRepository;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	  private ProjectRepository repository;
	 
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Project> getAllProject() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Project getProjectById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyProjectById(@PathVariable("id") ObjectId id, @Valid @RequestBody Project project) {
	    project.set_id(id);
	    repository.save(project);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Project createProject(@Valid @RequestBody Project projects) {
		  projects.set_id(ObjectId.get());
	    repository.save(projects);
	    return projects;
	   
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteProject(@PathVariable ObjectId id) {
	    repository.delete(repository.findBy_id(id));
	  }


}

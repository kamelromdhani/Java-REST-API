package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Project {
	@Id
	public ObjectId _id;
	private String name;
	private String description;
	private LocalDate date_limite;
	private LocalDate post_date;
	private String etat ;
	private String categorie;
	private ArrayList<File> files ;
	public Project(ObjectId _id, String name, String description, LocalDate date_limite, LocalDate post_date, String etat,
			String categorie,ArrayList<File> files ) {
		super();
		this.files = new ArrayList<File>();
		this._id = _id;
		this.name = name;
		this.description = description;
		this.date_limite = date_limite;
		this.post_date = post_date;
		this.etat = etat;
		this.categorie = categorie;
		for (File temp : files) {
			this.files.add(temp);
		}
		
	}
	public Project() {
		super();
		files = new ArrayList<File>();
	}
	public ArrayList<File> getFiles() {
	    return files;
	  }
	public void setFiles(ArrayList<File> files) {
		for (File temp : files) {
			this.files.add(temp);
		}
	}
	public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_limite() {
		return date_limite.toString();
	}
	public void setDate_limite(LocalDate date_limite) {
		this.date_limite = date_limite;
	}
	public String getPost_date() {
		return post_date.toString();
	}
	public void setPost_date(LocalDate post_date) {
		this.post_date = post_date;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}

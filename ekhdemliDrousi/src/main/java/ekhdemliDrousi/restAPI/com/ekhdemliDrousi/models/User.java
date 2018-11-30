package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models;

import java.util.ArrayList;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class User {
	@Id
	public ObjectId _id;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private String phone;
	private ArrayList<String> projectsID;
		// ObjectId needs to be converted to string
		  public String get_id() { return _id.toHexString(); }
		  public void set_id(ObjectId _id) { this._id = _id; }
		
		  
		  public User(ObjectId _id, String first_name, String last_name, String email, String password, String phone,ArrayList<String> projectsID) {
			super();
			this.projectsID = new ArrayList<String>();
			for (String temp : projectsID) {
				this.projectsID.add(temp);
			}
			this._id = _id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
			this.password = password;
			this.phone = phone;
		}
		public User() {
			super();
			this.projectsID = new ArrayList<String>();
			// TODO Auto-generated constructor stub
		}
		public ArrayList<String> getProjctsID() {
		    return projectsID;
		  }
		public void setProjectsID(ArrayList<String> projectsID) {
			for (String temp : projectsID) {
				this.projectsID.add(temp);
			}
		}
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		  
		  
}

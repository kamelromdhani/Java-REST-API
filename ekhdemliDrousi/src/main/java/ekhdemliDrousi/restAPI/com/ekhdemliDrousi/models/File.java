package ekhdemliDrousi.restAPI.com.ekhdemliDrousi.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class File {
	private String url;
	private String name;
	public File(String name, String url) {
		super();
		
		this.name = name;
		this.url = url;
	}
	public File() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public String get_id() {
		return _id.toHexString();
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}

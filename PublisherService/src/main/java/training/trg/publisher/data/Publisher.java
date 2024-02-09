package training.trg.publisher.data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "publishers")
public class Publisher {
	@Id
	@Column(name = "PUBLISHERID")
	private int publisherId;
	

	@Column(length = 15)
	private String name;
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publisher(int publisherId, String name, String address) {
		super();
		this.publisherId = publisherId;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", name=" + name + ", address=" + address + "]";
	}
	private String address;
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

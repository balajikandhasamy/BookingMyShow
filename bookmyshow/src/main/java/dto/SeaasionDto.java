package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SeaasionDto {
	@Id
private String name;
private String phone_no;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone_no() {
	return phone_no;
}
public void setPhone_no(String phone_no) {
	this.phone_no = phone_no;
}
}

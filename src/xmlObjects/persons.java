package xmlObjects;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class persons {
String name,address, age,phoneNum,id;

public String getName() {
	return name;
}
@XmlElement
public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}
@XmlElement
public void setAddress(String address) {
	this.address = address;
}

public String getAge() {
	return age;
}
@XmlElement
public void setAge(String age) {
	this.age = age;
}

public String getPhoneNum() {
	return phoneNum;
}
@XmlElement
public void setPhoneNum(String phoneNum) {
	this.phoneNum = phoneNum;
}

public String getId() {
	return id;
}
@XmlElement
public void setId(String id) {
	this.id = id;
}
//public persons(String name, String address, String age, String phoneNum,
//		String id) {
//	super();
//	this.name = name;
//	this.address = address;
//	this.age = age;
//	this.phoneNum = phoneNum;
//	this.id = id;
//}
@Override
public String toString() {
	return "persons [name=" + name + ", address=" + address + ", age=" + age
			+ ", phoneNum=" + phoneNum + ", id=" + id + "]";
}


}

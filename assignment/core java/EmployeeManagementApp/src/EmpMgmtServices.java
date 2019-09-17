
public class EmpMgmtServices {
int id;
String name;
int age;
String designation;
String dept;
String country;
public EmpMgmtServices(int id, String name, int age, String designation, String dept, String country) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.designation = designation;
	this.dept = dept;
	this.country = country;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Data [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", dept=" + dept
			+ ", country=" + country + "]";
}

}

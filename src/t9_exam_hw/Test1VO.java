package t9_exam_hw;

public class Test1VO {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//값이 넘어왔는지 아닌지 체크하기 위해  //alt sss + enter enter
	@Override
	public String toString() {
		return "Test1VO [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
}

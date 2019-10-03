package ver2;

//@MappedSuperclass
public class Person implements Human{

	private String name;

	private int age;

	private String gender;

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
}

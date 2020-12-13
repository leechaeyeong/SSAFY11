package member;

public class Member {
	private String name;
	private int age;
	private String email;
	public Member(){}
	public Member(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public Member(String name, int age){
		this(name, age, "");
	}
	@Override
	public String toString() {
		String info = name+"\t"+age+"\t"+email;
		return info;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Member) {
			Member cu = (Member) obj;
			if(name.equals(cu.name) && age == cu.age
					&& email.equals(cu.email)) {
				return true;
			}
		}
		return false;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

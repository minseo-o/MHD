package Projects;

public class DoctorDTO {
	private String name;
	private String id;
	private String pw;
	private String email;

	public String getId() {

		return id;

	}

	public void setId(String id) {

		this.id = id;

	}

	

	public String getPw() {

		return pw;

	}

	public void setPw(String pw) {

		this.pw = pw;

	}

	

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}


	

	@Override

	public String toString() {

		String str = String.format("아이디:%s \n이름:%s \n성별:%s \n생일:%s \n이메일:%s \n번호:%s \n",

				id, name, email);

				

		return str;

	}	
}

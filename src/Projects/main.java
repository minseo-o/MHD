package Projects;

public class main {

	public static void main(String[] args) {
		try {
			new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		new frame();
	}

}

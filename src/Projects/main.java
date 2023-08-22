package Projects;

public class Main {
	
	public static final int SCREEN_WIDTH = 1280; 
	public static final int SCREEN_HEIGHT = 720;
	
	public static void main(String[] args) {
		try {
			new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Start().setVisible(true);
		
	}
	
}

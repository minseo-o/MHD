package Projects;

public class Main {

	public static final int SCREEN_WIDTH = 1280;// 가로 길이 설정
	public static final int SCREEN_HEIGHT = 720;// 세로 길이 설정

	public static void main(String[] args) {
		// DB 연결 확인 코드
		try {
			new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		new Start().setVisible(true); // 프로젝트 시작, 창 보이게

	}
}
/**/
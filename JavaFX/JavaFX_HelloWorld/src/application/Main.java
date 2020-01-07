package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Say 'Hello, World!'");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello, World!");
			}
		});
		
		StackPane root = new StackPane(); // StackPane�� �����Ѵ�.
		// StackPane�̶�, ���𰡸� �׾Ƶε��� �� ��ġ�� ������ ���̾� ���������� ������ ������� ���׸��� ����� ���̾ƿ��̴�.
		
		root.getChildren().add(btn);
		// root ��ü�� ���� ��ư(btn)�� �߰��Ѵ�.
		
		Scene scene = new Scene(root, 300, 250); // ��� ũ�⸦ �����Ѵ�.
		
		primaryStage.setTitle("Hello World"); // Ÿ��Ʋ ����
		primaryStage.setScene(scene);
		primaryStage.show(); // ���� â ����. API�� ��� ����� �� ���� ���� �߰��ؾ� �Ѵ�.
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

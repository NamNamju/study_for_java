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
		
		StackPane root = new StackPane(); // StackPane을 생성한다.
		// StackPane이란, 무언가를 쌓아두듯이 한 위치에 들어오는 레이어 구성물들을 들어오는 순서대로 덧그리는 방식의 레이아웃이다.
		
		root.getChildren().add(btn);
		// root 객체에 만든 버튼(btn)을 추가한다.
		
		Scene scene = new Scene(root, 300, 250); // 배경 크기를 설정한다.
		
		primaryStage.setTitle("Hello World"); // 타이틀 설정
		primaryStage.setScene(scene);
		primaryStage.show(); // 최종 창 설정. API의 모든 기능은 이 라인 전에 추가해야 한다.
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

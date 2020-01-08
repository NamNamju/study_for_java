package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("지우기");
		TextArea textArea = new TextArea();
		// 입력 필드
		VBox vbox = new VBox(40);
		// HBox와 VBox는 수평과 수직으로 컨트롤을 배치하는 컨테이너이다.
		/*
		 * 자식 컨트롤의 크기를 재조정하는데, HBox는 높이를 확장하고 VBox는 폭을 확장한다.
		 * 단, 조정이 가능한 컨트롤만 자동 확장한다.
		 * 그 예로, button은 maxHeight와 maxWidth를 변경하여 크기를 조정한다.
		 */
		vbox.setSpacing(10);
		vbox.getChildren().add(textArea);
		vbox.getChildren().add(btn);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				textArea.clear();
				// button을 누르면 text가 지워진다.
				
			}
			
		});
		
		Scene scene = new Scene(vbox, 320, 112, Color.rgb(0, 0, 0, 0));
		// new Scene(pane, 폭, 높이)
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

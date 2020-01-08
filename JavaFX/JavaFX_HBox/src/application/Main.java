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
		Button btn = new Button("�����");
		TextArea textArea = new TextArea();
		// �Է� �ʵ�
		VBox vbox = new VBox(40);
		// HBox�� VBox�� ����� �������� ��Ʈ���� ��ġ�ϴ� �����̳��̴�.
		/*
		 * �ڽ� ��Ʈ���� ũ�⸦ �������ϴµ�, HBox�� ���̸� Ȯ���ϰ� VBox�� ���� Ȯ���Ѵ�.
		 * ��, ������ ������ ��Ʈ�Ѹ� �ڵ� Ȯ���Ѵ�.
		 * �� ����, button�� maxHeight�� maxWidth�� �����Ͽ� ũ�⸦ �����Ѵ�.
		 */
		vbox.setSpacing(10);
		vbox.getChildren().add(textArea);
		vbox.getChildren().add(btn);
		
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				textArea.clear();
				// button�� ������ text�� ��������.
				
			}
			
		});
		
		Scene scene = new Scene(vbox, 320, 112, Color.rgb(0, 0, 0, 0));
		// new Scene(pane, ��, ����)
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}

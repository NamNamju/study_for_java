package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Controller implements Initializable{
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	@FXML
	private void makeToDo(ActionEvent event) {
		Object buttonObject = event.getSource();
		Button button = (Button)buttonObject;
		System.out.println("���� �� �����ϴ�.");
		
	}
	@FXML
	private void delToDo(ActionEvent event) {
		Object buttonOb = event.getSource();
		Button butto = (Button)buttonOb;
		System.out.println("������ �� �����ϴ�.");
		
	}
}

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

	private String operator =""; // � �����ڸ� ����� �����ؾ��Ѵ�.
	private int x = 0; // ������ ����
	private Model model = new Model();
	@FXML
	private Text result;
	
	@FXML
	private void operand(ActionEvent event) { // ��ư�� ������ �� � event�� �߻��ؼ� operand��� �Լ� ����.
		result.setText(result.getText()+ ((Button)event.getSource()).getText());
		// result.getText() (���� �ڽ��� ������ �ִ� �ؽ�Ʈ)
		// (Button)event.getSource() (�̺�Ʈ�� �߻��ñ� ��ü�� ���� ����) ���� getText()�� �Ͽ� �װͿ� �����ִ� text�� ������.
	}
	
	@FXML
	private void operator(ActionEvent event) {
		if(((Button)event.getSource()).getText().equals("=")) {
			result.setText(model.calculator(operator, x, Integer.parseInt(result.getText())) + "");
			// y�� ���� �ԷµǾ� �ִ� ����, parseInt�� �ؼ� ���ڷ� �ٲ��ش�. , ������ ���� ���ڷ� �ٲ��ش�.
		} else {
			operator = ((Button) event.getSource()).getText();
			x = Integer.parseInt(result.getText());
			result.setText("");
		}
	}
	
}

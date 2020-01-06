package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

	private String operator =""; // 어떤 연산자를 썼는지 저장해야한다.
	private int x = 0; // 기존의 숫자
	private Model model = new Model();
	@FXML
	private Text result;
	
	@FXML
	private void operand(ActionEvent event) { // 버튼을 눌렀을 때 어떤 event가 발생해서 operand라는 함수 실행.
		result.setText(result.getText()+ ((Button)event.getSource()).getText());
		// result.getText() (현재 자신이 가지고 있는 텍스트)
		// (Button)event.getSource() (이벤트를 발생시긴 자체에 대한 정보) 이후 getText()를 하여 그것에 쓰여있는 text를 가져옴.
	}
	
	@FXML
	private void operator(ActionEvent event) {
		if(((Button)event.getSource()).getText().equals("=")) {
			result.setText(model.calculator(operator, x, Integer.parseInt(result.getText())) + "");
			// y는 현재 입력되어 있는 숫자, parseInt를 해서 숫자로 바꿔준다. , 공백을 통해 문자로 바꿔준다.
		} else {
			operator = ((Button) event.getSource()).getText();
			x = Integer.parseInt(result.getText());
			result.setText("");
		}
	}
	
}

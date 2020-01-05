package lecture_fourteen;

public class third_concept {
	public third_concept() {
		
	}
	
	private third_concept_EventListener listener;
	public void setListener(third_concept_EventListener listener) {
		this.listener = listener;
	}
	public void onClickProcess() {
		if (listener!=null) {
			listener.onClick();
		}
	}

}

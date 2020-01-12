package com.javaReview.interface_2;

public class Example_1_browser implements Example_1_ondownloadlistener{

	// browser은 download의 일을 전부 아는 것이 아닌, 언제 끝낼지만 알면 된다.
	
	public void imgClick() {
		Example_1_download downloader = new Example_1_download(this);
		
		// this에는 Example_1_ondownloadlistener 인터페이스를 넘겨준다.
		downloader.start();
	}

	@Override
	public void onDownFinish() {
		
		System.out.println("Download finished");
		
	}

	@Override
	public void onDownFailed() {
		System.out.println("Download failed");
		
	}
}

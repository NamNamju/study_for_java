package com.javaReview.interface_2;

import java.lang.Thread;

public class Example_1_download {

	private Example_1_ondownloadlistener mlistener;
	public Example_1_download(Example_1_ondownloadlistener listener) {
		mlistener = listener;
	}
	public void start() {
		
		System.out.println("Download Start!");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 콜백 지점
		mlistener.onDownFinish();
	}

	
}

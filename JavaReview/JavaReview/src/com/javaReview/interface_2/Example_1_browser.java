package com.javaReview.interface_2;

public class Example_1_browser implements Example_1_ondownloadlistener{

	// browser�� download�� ���� ���� �ƴ� ���� �ƴ�, ���� �������� �˸� �ȴ�.
	
	public void imgClick() {
		Example_1_download downloader = new Example_1_download(this);
		
		// this���� Example_1_ondownloadlistener �������̽��� �Ѱ��ش�.
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

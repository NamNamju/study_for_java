package com.javaReview.exception;

public class Example_1 {

	public static void main(String[] args) {
		
		try {
			boolean isLogin = login("Namju","11112222");;
			if(isLogin) System.out.println("Login Success! Conglatulation!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// Exception ��ȣ ���� �޼����� ���´�.
		} finally {
			System.out.println("Copyright Namju");
		}

	}
	
	static boolean login(String id, String pw) throws Exception{
		// ���ܰ� �߻��Ѵ�.
		
		// Android -> ���̵�, ��й�ȣ -> Server
		
		// ȯ�� ����
		boolean isNetFailed = true;
		boolean isNoId = false;
		boolean isPwWrong = false;
		boolean isPwExpired = false;
		
		if (isNetFailed) throw new Exception("Network Failed!");
		else if (isNoId) throw new Exception("There is no id");
		else if (isPwWrong) throw new Exception("Password is not correct");
		else if (isPwExpired) throw new Exception("Please change password");
		
		return true;
		
		
	}

}

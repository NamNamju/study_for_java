package com.javaReview.exception;

public class Example_1 {

	public static void main(String[] args) {
		
		try {
			boolean isLogin = login("Namju","11112222");;
			if(isLogin) System.out.println("Login Success! Conglatulation!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// Exception 괄호 안의 메세지가 나온다.
		} finally {
			System.out.println("Copyright Namju");
		}

	}
	
	static boolean login(String id, String pw) throws Exception{
		// 예외가 발생한다.
		
		// Android -> 아이디, 비밀번호 -> Server
		
		// 환경 설정
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

class YouTube{
	public String search(String movieName){
		System.out.println("Invoking search By Movie Name :"+movieName);
		String meesage=null;
		
		if(movieName!=null){
		String message="searching Movie Name is Available :"+movieName;
			
		}
		String message = "Login Successful";
return message;
	}
	public String search(String movieName,String hero){
		System.out.println("invoking search by movieName : "+movieName+ " hero : "+hero);
		String message=null;
		if(movieName!=null && hero !=null){
			message="searching movieName is available: " +movieName+" and hero:" +hero;

		}
		return message;
	}
	public boolean login(String userName,String psw){
		System.out.println("Invoking login using User name "+userName+" and psw :"+psw);
		String regUserName="Dhanu";
		String regPsw="Ngm@123";
		boolean isLogin=false;
		
		if(userName.equals(regUserName) && psw.equals(regPsw)){
			isLogin=true;
		}else{
			isLogin=false;
		}
		return isLogin;
	}
	public String login(String email,String psw,String captcha){
		System.out.println("Invoking login using email Id "+email+" and psw :"+psw);
		String regEmail="dhanu.30@gmail.com";
		String regPsw="Ngm@123";
		
		String isLogin=null;
		
		if(email == regEmail && regPsw == psw){
			
			String message = "Login successfully";
		}else{
			 isLogin="Login Failed";
		}
		return isLogin;
	}
	


}
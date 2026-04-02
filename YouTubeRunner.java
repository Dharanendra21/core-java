class YouTubeRunner{
	public static void main(String []search){
		YouTube tube =new YouTube();
		String msg=tube.search("LoveMockTail","Krishna");
		System.out.println(msg);
		
		boolean login=tube.login("Dhanu","Ngm@123");
		System.out.println(login);
		
		String result = tube.login("dhanu.30@gmail.com","Ngm@123","Suga32");
		System.out.println(login);
	}

}
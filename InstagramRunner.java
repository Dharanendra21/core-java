class InstagramRunner{
	
	public static void main(String[]args)
	{
		System.out.println("-------First time method Call--------");
		String Gowtham =Instagram.validateAndRegister(8430988576l,"gow@gmail.com","20-02-2004","Gowtham","gowtham_20");
		System.out.println(Gowtham);
		
		System.out.println("-------Second time method Call--------");
		String Dhanu =Instagram.validateAndRegister(8497988576l,"Dhanu@gmail.com","15-07-2004","Dhanu","Dhanu_15");
		System.out.println(Dhanu);
		
	}


}
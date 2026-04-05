class AmazonRunner{
	
	public static void main(String[]args)
	{
		System.out.println("-------First time method Call--------");
		String user1 =Amazon.validateAndRegister(8430988576l,"gow@gmail.com","20-02-2004","user1","gowtham_20");
		System.out.println(user1);
		
		System.out.println("-------Second time method Call--------");
		String user2 =Amazon.validateAndRegister(8497988576l,"Dhanu@gmail.com","15-07-2004","user2","Dhanu_15");
		System.out.println(user2);
		
	}


}
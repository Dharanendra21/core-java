class Instagram
{	
	//return type primitiveData/Non PrimitiveData
	public static String validateAndRegister(long mobileNumber,String psw,String birthday,String fullName,String userName)
	{
		System.out.println("validateAndRegister method is started");
		String registerStatus = null;
		if(mobileNumber != 0 && psw != null && birthday != null && fullName != null && userName != null)
		
		if(psw.length()>0 && fullName.length()>0 && userName.length()>0)
		
		{
			registerStatus ="Thank You" +fullName+" Registered successfully";
		}
		else
		{
			registerStatus="Please check the Length of PSW, FullName, User Name";
		}
	 else
	{
		registerStatus ="Please enter the Valide Data"; 
	}	
		System.out.println("validateAndRegister method is Ended");
		return registerStatus;
	}
}
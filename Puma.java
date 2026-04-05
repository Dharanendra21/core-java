class Puma{
	double shirtPrice;
	String shirtcolor;
	
	public Puma(){}
	public Puma(double shirtPrice,String shirtcolor){
		this.shirtPrice=shirtPrice;
		this.shirtcolor=shirtcolor;
		
	}
	public void display(){
		System.out.println("shirtPrice"+shirtPrice);
		System.out.println("shirtcolor"+shirtcolor);
	}

}
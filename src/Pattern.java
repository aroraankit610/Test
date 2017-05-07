class Pattern{
	
	public void display()
	{
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(i==1 || i==3 || i==5 ||  i==2&&j==1 ||  i==4&&j==1)
				{
					System.out.print("*");
				}
				
				else{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Pattern ref =  new Pattern();
		ref.display();
	}
}
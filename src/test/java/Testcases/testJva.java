package Testcases;

public class testJva 
{
	
	
	public static void main(String args [])
	{
		
		String sn="Swiss";
		String fs = sn.toLowerCase();
		String nrpt="";
		String rpt="";
		
		// we have to findout the non-repeatable characters in the given string...WI
		// here each character should be match to all the other chacters if foes not matched than note down
		
		// loop aage move kerne ke liye
		for(int i=0; i<sn.length(); i++)
		{
			
			int count=0;
			//char ch = sn.charAt(i);
			
			for(int j=0; j<fs.length(); j++)
			{
				
				if(sn.charAt(j)==fs.charAt(i))
				{
					
					count++;
					
				}
				
							
				
			}
			//System.out.print("Count is" +count +" " +i);
			
			if(count>1)
			{
				
				rpt=rpt +fs.charAt(i);
				
				
			}
			
			else if(count==1)
			{
				
	
				nrpt=nrpt+fs.charAt(i);

				
				
				
			}
			
			else 
			{
				
				System.out.print("Nothing");
				
			}
			
			
			
			
			
			}
			
			
			
		
		
		
		System.out.println("repetable" +" " +rpt);
		
		System.out.println("non-repetable"+" " +nrpt);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

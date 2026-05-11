package Testcases;

public class PracticeJava {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Reverse string without leaving space
		/*
		String Sn="I am in RSystems";
		String rev="";
		for(int i=Sn.length()-1;i>=0;i--)
		{
			
			rev = rev+Sn.charAt(i);
			
			
		}
		
		System.out.print(rev);
		
		
		*/
		
		
		// just reverse the words in a string but not change the sequence
		
		/*
		String Sn = "I am in Infosys";
        // split
        String[] sparr = Sn.split(" ");
        //["I","am","in","Infosys"]
        
               
        for(String word : sparr)
        {
            for(int j=word.length()-1; j>=0;j--)
            {
                
                 System.out.print(word.charAt(j));
                
            }
            
            
            System.out.print(" ");
            
            
            
        }
        
        */
		
		
		
		
		// Programme of fibonaciee
		
		/*
		
		int a,b,c;
		
		a=0;
		b=1;
		int n=10;
		
		System.out.print(+a +" " +b);
		
		for(int i=2; i<n; i++)
		{
			
			
			
			c=a+b;
			System.out.print(c);
			
			int temp = c;
			a=b;
			b=temp;
			
			
			
			
			
		}
		*/
		
		
		String Sn="Swiss";
		String st="";
		
		
		for(int i=0; i<Sn.length();i++)
			
		{
			//System.out.print(Sn.charAt(i)+" ");
			int count =0;
			
			for(int j=0; j<Sn.length();j++)
			{
				
				if(Sn.charAt(i)==Sn.charAt(j))
				{
					
					
					//st = st+Sn.charAt(i);
					count++;
					
					
				}
				
							
			}
			
			if(count>1 && Sn.indexOf(Sn.charAt(i))==1)
			{
				
				
				System.out.print(Sn.charAt(i));
				
				
			}

			
			
			
			
		}
		
		//System.out.print(st);
		
		
		
		
		
		
		

	}

}

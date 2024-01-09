package Methods;
import java.util.ArrayList;
import Items.item;
import Containers.container;;
public class calculations {
	
		private double totalvol,totalweight;
		private double sprice,bprice,bothprice;
		private int scounter,bcounter,bothcounter;
		private boolean Check=false;
		private item item = new item();
		public void caltotvol(ArrayList<item> items)
		{
			totalvol=0;
			for(int i=0;i<items.size();i++)
			{
				item=items.get(i);
				totalvol=totalvol+item.getVolume();
			}
		}
		public void caltotweight(ArrayList<item> items)
		{
			totalweight=0;
			for(int i=0;i<items.size();i++)
			{
				item=items.get(i);
				totalweight=totalweight+item.getWeight();
			}
		}
		public ArrayList <String> calprice()
		{
			double localweight=totalweight;
			double localvol=totalvol;
			container container=new container();
			scounter=0;
			container.calcbigvol();
			container.calcsmallvol();
	                             ArrayList <String> output = new ArrayList <String>();

			if (localvol >container.getSmall())
			{
				while(localvol>=0)
				{
					localvol=localvol-container.getSmall();
					scounter++;
				}
				
				
			}
			else {
				scounter++;
			}
					
			if(localweight/scounter>500)
			{
			sprice=1200*scounter;	
			output.add("Your total price using Small Containers ="+sprice+" euros");

			}
			else {sprice=1000*scounter;	
			output.add("Your total price using Small Containers ="+sprice+" euros");}
			bcounter=0;
			
			localweight=totalweight;
			localvol=totalvol;
			if (localvol > container.getBig())
			{
				while(localvol>=0)
				{
					localvol=localvol-container.getBig();
					bcounter++;
				}
				bprice=1800*bcounter;
				
			}
			else 
			{bprice=1800;
			 bcounter++;
			}
			output.add("Your total price using Big Containers= "+bprice+" euros");
			bothcounter=0;
			localweight=totalweight;
			localvol=totalvol;
			if (localvol > container.getBig())
			{
				while(localvol>container.getSmall())
				{
					localvol=localvol-container.getBig();
					bothcounter++;
				}
				if(localvol>0)
				{
					if(localweight/bothcounter>500)
						bothprice=1200;	
					else 
						bothprice=1000;	
				}
				else
					Check=true;
				
				
				bothprice=bothprice+(1800*bothcounter);
				
				if(Check==false)
				output.add("Your total price using Both Containers ="+bothprice+" euros");
			}
	                return output;
		}
		public ArrayList <String> bestshipping()
		{
	                                         ArrayList <String> output = new ArrayList <String>();

			if(bothprice==0 || Check==true)
			bothprice=9999999;
		
		if(bprice==bothprice)
		{
			output.add("The total price the least using either "+bcounter+ " Big Container or " +bothcounter+ " Big Containers and 1 Small Container");
		}
		
		if(bprice>sprice)
		{
			if(sprice<=bothprice)
				output.add("The total price the least using "+scounter+ " Small Container");
			else
				output.add("The total price the least using "+bothcounter+ " Big Containers and 1 Small Container");
		}
		else 
		{
			if(bprice<=bothprice)
				output.add("The total price the least using "+bcounter+ " Big Container");
			else 
				output.add("The total price the least using  "+bothcounter+ " Big Containers and 1 Small Container");
			
		}
	        return output;
		}
		public void neworder()
		{
			totalweight=0;
			totalvol=0;
			Check=false;
		}
		public void printiteminfo(ArrayList<item> item)
		{
			for(int i=0;i<item.size();i++)
				System.out.println("Item "+i+" informations "+item.get(i).getName()+" "+item.get(i).getVolume()+" "+item.get(i).getWeight());
		}
		public Double[] printorderinfo()
		{
	                            
			return new Double[]{totalvol,totalweight};
		}
	}



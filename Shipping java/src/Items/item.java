package Items;

public class item {
	
		
		private String name;
		private double weight,volume;
		public item()
		{
			
		}
		public item(item copyitem)
		{
			name=copyitem.name;
			weight=copyitem.weight;
			
		}
		public void Item(String name1,double weight1)
		{
			
		}
		public void setName(String name1)
		{
			name=name1;
		}
		public void setWeight(double weight1)
		{
			if(weight1<0)
				weight=0;
			else 
				weight=weight1;
		}
		public String getName()
		{
			return name;
		}
		public double getWeight()
		{
			return weight;
		}
		public double getVolume()
		{
			return volume;
		}
		
		public void calcvol(double radius)//Sphere
		{
			volume=(4/3)*3.14*Math.pow(radius,3);
		}

		public void calcvol(double radius,double height)//Cylinder
		{
			volume=3.14*Math.pow(radius,2)*height;
		}
		
		public void calcvol(double length,double width,double height)//Cuboid
		{
			volume=length*width*height;
		}
		

		public void calcvol(double length,double width,double height,int a)//Pyramid , Int 'A' is used to allow overloading since the attritubes of the formula of Cuboid and Pyramid are the same,except for the constant '3' which will be inputted inside int a 
		{
			volume=(length*width*height)/a;
		}
		
		
		public void calcvol(double radius,double height,int a)//Cone
		{
			volume=3.14*Math.pow(radius,2)*(height/a);
		}
		
		
		public void print()
		{System.out.println(volume+" "+weight+" "+name );}
	}



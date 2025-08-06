package Methods;
import java.util.ArrayList;
import java.util.Scanner;
import Items.item;
import Containers.container;;

public class test {
	public static ArrayList<item> item = new ArrayList();
    public static int numItems = 0;
    public static int currItem=1;
public static void addproduct()
{
boolean check=false;
Scanner sc=new Scanner(System.in);
Scanner scstring=new Scanner(System.in);
System.out.println("Type how many products you need");
int a=sc.nextInt();
for(int i=0;i<a;i++)
{
item localitem=new item();
System.out.println("Type the name of the item");
localitem.setName(scstring.next());
System.out.println("Type the weight of the item");
localitem.setWeight(scstring.nextDouble());
do {
	System.out.println("Type the shape of the item");
	String b=scstring.next();
	if(b.equalsIgnoreCase("sphere"))
	{
		System.out.println("Type the radius of your item");
		localitem.calcvol(scstring.nextDouble());
	}
	else if(b.equalsIgnoreCase("cylinder"))
	{
		System.out.println("Type the radius and the height of your item");
		localitem.calcvol(scstring.nextDouble(), scstring.nextDouble());
		check=false;
	}
	else if(b.equalsIgnoreCase("cuboid"))
	{
		System.out.println("Type the length, width and height");
		localitem.calcvol(scstring.nextDouble(), scstring.nextDouble(), scstring.nextDouble());
		check=false;
	}
	else if(b.equalsIgnoreCase("pyramid"))
	{
		System.out.println("Type the length, width and height");
		localitem.calcvol(scstring.nextDouble(), scstring.nextDouble(), scstring.nextDouble(), 3);
		check=false;
	}
	else if(b.equalsIgnoreCase("cone"))
	{
		System.out.println("Type the radius and the height");
		localitem.calcvol(scstring.nextDouble(), scstring.nextDouble(), 3);
		check=false;
	}
	else
	{
		System.out.println("That shape is not avaible");
		check=true;
	}
}while(check==true);
item.add(localitem);
}
}
public static void main(String[] args)
{
calculations read=new calculations();
addproduct();
read.caltotvol(item);
read.caltotweight(item);
read.calprice();
read.bestshipping();
read.printiteminfo(item);
read.printorderinfo();
}
}



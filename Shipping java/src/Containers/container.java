package Containers;

public class container {
	private double smallconvol,bigconvol;
	public void Containers()
	{
		
	}
	public double getSmall()
	{
		return smallconvol;
	}
	public double getBig()
	{
		return bigconvol;
	}
	public void calcsmallvol()
	{
		smallconvol=2.59*2.43*6.06;
	}
	public void calcbigvol()
	{
		bigconvol=2.59*2.43*12.01;
	}
	public void print()
	{
		System.out.println(smallconvol+" "+bigconvol);
	}

}

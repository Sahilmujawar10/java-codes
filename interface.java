interface std1
{

abstract public void holiday();

}

interface std2
{

abstract public void wday();

}

interface std3
{

abstract public void dresscode();

}

class Google implements std1,std2,std3
{

public void holiday()

{

System.out.println("Friday to saturday will be holiday");

}
public void wday()
{
	
	System.out.println("somvar to guruvar will be working day"); 
	
	
}
public void dresscode()
{

System.out.println("there is no dresscode");

}
}

class infy implements std1,std3
{

public void holiday()
{

System.out.println("saturday to sunday holiday");


}

public void dresscode()
{

System.out.println("friday on a dresscode");

}

}

class test
{
	
	public static void main(String[]args)
	{
		
		
		
		Google g1 = new Google();
		g1.holiday();
		g1.dresscode();
		g1.wday();
		
		
		infy I1 = new infy();
		I1.holiday();
		I1.dresscode();
	}
}

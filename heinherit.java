import javax.swing.*;
class person
{
	private String name,city;
	
	public void setdata()
	{
		name = JOptionPane.showInputDialog("Enter the name is");
		city = JOptionPane.showInputDialog("Enter the city name");
	}
	public void showdata()
	{
		System.out.println("the name is"+" "+name);
		System.out.println("city name is"+" "+city);
		
	}
}
  
 class saccount extends person
 {

  private int accno,balance;

public void setdata()
{
super.setdata();

String acn = JOptionPane.showInputDialog("Enter the account no");
accno = Integer.parseInt(acn);
String bal = JOptionPane.showInputDialog("Enter the balance");
balance = Integer.parseInt(bal);
}

public void showdata()
{
	super.showdata();
	
	System.out.println("the account no is"+" "+accno);
	System.out.println("balance is"+" "+balance);
}

public void withdraw()
{
	String wd = JOptionPane.showInputDialog("Enter the withdraw amount");
	int w = Integer.parseInt(wd);
	
	if(w<balance)
	{		
	int bal = w-balance;
	System.out.println("amount withdrawal successfully");
	}
	else{
		System.out.println("insufficient funds");
	}
}

public void deposite()
{
	String de = JOptionPane.showInputDialog("Enter the amount u want to deposite");
	int d =Integer.parseInt(de);
	balance = balance+d;
	System.out.println("the balance after deposite is"+" "+balance);
}
}
	

class fd extends person
{
	private int fbalance;
	private double roi;
	private int year;
	
	public void setdata()
	{
		super.setdata();
		
		String bal = JOptionPane.showInputDialog("Enter the fbalance");
		fbalance = Integer.parseInt(bal);
		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);
		String yr = JOptionPane.showInputDialog("Enter the years of fd amount");
		 year = Integer.parseInt(yr);
		 
	}
	
	public void showdata()
	{
		super.showdata();
		
		System.out.println("the fd balance is"+" "+fbalance);
		System.out.println("the roi will be 10% per year");
		System.out.println("the years of fd are"+" "+year);
		
	}
	
	public void maturityamnt()
	{
		roi = fbalance * 0.10 * year;
		double ffd = roi + fbalance;
		
		System.out.println("the final amount u will be getting is"+" "+ffd);
	}
}

class worker extends person
{		
		private int eid;
		private int wadges,wdays;
		
		public void setdata()
		{
			super.setdata();
			
			String ei = JOptionPane.showInputDialog("Enter eid");
			eid = Integer.parseInt(ei);
			String wdg = JOptionPane.showInputDialog("Enter wadges");
			wadges =Integer.parseInt(wdg);
			String wd = JOptionPane.showInputDialog("Enter work days");
			wdays = Integer.parseInt(wd);
		}
		public void showdata()
		{
			super.showdata();
			
			System.out.println("eid is"+" "+eid);
			System.out.println("wadges are"+" "+wadges);
			System.out.println("total work days are"+" "+wdays);
		}
 
        public void payment()
		{
          int fpay = wadges*wdays;
           
        System.out.println("the final payment of employe is"+" "+fpay);
        }
        }
		
		class test
		{
			public static void main(String[]args)
			{
			   saccount s;
			   s = new saccount();
			   
			   s.setdata();
			   s.showdata();
			   s.withdraw();
			   s.deposite();
			   
			   fd f;
			   f= new fd();
			   
			   f.setdata();
			   f.showdata();
			   f.maturityamnt();
			   
		      worker w;
			  w = new worker();
			  w.setdata();
			  w.showdata();
			  w.payment();
			  
			}
		}
		 
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	






	
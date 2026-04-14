import javax.swing.*;

class loan
{
private String firstname,middlename,lastname,gender,permentaddress,occupation;
private String addharno,dateofbirth, panno,mobileno;

public void setdata()
{

 firstname = JOptionPane.showInputDialog("Enter the firstname");
 middlename = JOptionPane.showInputDialog("Enter the middlename");
 lastname = JOptionPane.showInputDialog("Enter the lastname");
 gender = JOptionPane.showInputDialog("Enter the gender");
 permentaddress = JOptionPane.showInputDialog("Enter the permentaddress");
 occupation = JOptionPane.showInputDialog("Enter the occupation");
 dateofbirth = JOptionPane.showInputDialog("Enter the dob");
addharno = JOptionPane.showInputDialog("Enter your adharno");
 mobileno = JOptionPane.showInputDialog("Enter your mobileno");
panno = JOptionPane.showInputDialog("Enter your pan card no");

}

public void showdata()
{
System.out.println("your first name is"+" "+firstname);
System.out.println("your middlename is"+" "+middlename);
System.out.println("your lastname is"+" "+lastname);
System.out.println("your gender"+" "+gender);
System.out.println("your permentaddress is"+" "+permentaddress);
System.out.println("your occupation is"+" "+occupation);
System.out.println("your dateofbirth is"+" "+dateofbirth);
System.out.println("your addharno is"+" "+addharno);
System.out.println("your mobileno is"+" "+mobileno);
System.out.println("your pan no is"+" "+panno);
}
}

class homeloan extends loan
{

private String addressofproperty,typeofproperty,oldowner,typeofborrower,nameofborrower;
private int carpetarea,builduparea,grossincome,loanamount,roi,duration,dowmpayment,salebalarea;

public void setdata()
{

super.setdata();

addressofproperty = JOptionPane.showInputDialog("Enter addressofproperty");
typeofproperty = JOptionPane.showInputDialog("Enter typeofproperty");
oldowner = JOptionPane.showInputDialog("Enter oldowner");
typeofborrower = JOptionPane.showInputDialog("Enter typeofborrower");
nameofborrower = JOptionPane.showInputDialog("Enter nameofborrower");

String ca = JOptionPane.showInputDialog("Enter carpetarea");
carpetarea = Integer.parseInt(ca);

String ba = JOptionPane.showInputDialog("Enter builduparea");
builduparea = Integer.parseInt(ba);

String gi = JOptionPane.showInputDialog("Enter grossincome");
grossincome = Integer.parseInt(gi);

String la = JOptionPane.showInputDialog("Enter loanamount");
loanamount = Integer.parseInt(la);

String ri = JOptionPane.showInputDialog("Enter roi");
roi = Integer.parseInt(ri);

String dur = JOptionPane.showInputDialog("Enter duration");
duration = Integer.parseInt(dur);

String dp = JOptionPane.showInputDialog("Enter dowmpayment");
dowmpayment = Integer.parseInt(dp);

String sa = JOptionPane.showInputDialog("Enter salabe area");
salebalarea = Integer.parseInt(sa);
}

public void showdata()
{
super.showdata();
System.out.println("the address is"+" "+addressofproperty);
System.out.println("the type of property is"+" "+typeofproperty);
System.out.println("oldowner of property is"+" "+oldowner);
System.out.println("type of borrower is"+" "+typeofborrower);
System.out.println("the name of borrower is"+" "+nameofborrower);
System.out.println("carpet area is"+" "+carpetarea);
System.out.println("buildup area is"+" "+builduparea);
System.out.println("grossincome is"+" "+grossincome);
System.out.println("loanamount is"+" "+loanamount);
System.out.println("duration for loan amount"+" "+duration);
System.out.println("dowmpayment is"+" "+dowmpayment);
System.out.println("salebal area is"+" "+salebalarea);
}

public void totalcost()
{
	int tc = loanamount + dowmpayment;
	System.out.println("the total cost is"+" "+tc);
	
	
}

public void emi()
{
	
	int em = loanamount +(loanamount*roi)*duration/duration*12;
	System.out.println("emi for loan amount is"+" "+em);
}
}

class ploan extends loan
{
	
	private String companyname,jobprofile,jobexperience,currentorganisation,caddress,currentcomyear,durationyear;
	private int salary,otheremi,cibilscore,loanamount,durationinyear,roi,processingfee,nofamily;
	
	public void setdata()
	{
		super.setdata();
		
		
	companyname = JOptionPane.showInputDialog("Enter companyname");
	jobprofile = JOptionPane.showInputDialog("Enter jobprofile");
	jobexperience = JOptionPane.showInputDialog("Enter jobexperience");
	currentorganisation = JOptionPane.showInputDialog("Enter current organisation");
	caddress = JOptionPane.showInputDialog("Enter current address");
    currentcomyear	= JOptionPane.showInputDialog("Enter current company year");

	String dinyear = JOptionPane.showInputDialog("Enter durationinyear");
	durationinyear = Integer.parseInt(dinyear);
	
	String sa =JOptionPane.showInputDialog("Enter salary");
	salary = Integer.parseInt(sa);
	
	String oe = JOptionPane.showInputDialog("Enter other emi");
	otheremi = Integer.parseInt(oe);
	
	String cs = JOptionPane.showInputDialog("Enter your cibilscore");
	cibilscore = Integer.parseInt(cs);
	
	String la = JOptionPane.showInputDialog("Enter loanamount");
	loanamount = Integer.parseInt(la);
	
	String dy = JOptionPane.showInputDialog("Enter durationyear");
	durationinyear = Integer.parseInt(dy);
	
	String ri = JOptionPane.showInputDialog("Enter roi");
	roi = Integer.parseInt(ri);
	
	String pf = JOptionPane.showInputDialog("Enter processingfee");
	processingfee = Integer.parseInt(pf);
	
	String nfm = JOptionPane.showInputDialog("Enter members in family");
	nofamily = Integer.parseInt(nfm);
	}
	
	public void showdata()
	{
		super.showdata();
		
		System.out.println("the companyname is"+" "+companyname);
		System.out.println("the companyname is"+" "+jobprofile);
		System.out.println("the companyname is"+" "+salary);
		System.out.println("the companyname is"+" "+otheremi);
		System.out.println("the companyname is"+" "+cibilscore);
		System.out.println("the companyname is"+" "+jobexperience);
		System.out.println("the companyname is"+" "+currentorganisation);
		System.out.println("the companyname is"+" "+caddress);
		System.out.println("the companyname is"+" "+currentcomyear);
		System.out.println("the companyname is"+" "+loanamount);
		System.out.println("the companyname is"+" "+durationinyear);
		System.out.println("the companyname is"+" "+roi);
		System.out.println("the companyname is"+" "+processingfee);
		System.out.println("the companyname is"+" "+nofamily);
	}
	
	public void emi()
	{
		
	
	int em = loanamount +(loanamount*roi)*durationinyear/durationinyear*12;
	System.out.println("emi for loan amount is"+" "+em);
	
	}
	
	public void inhandamount()
	{
		int inhndamount = loanamount/loanamount*processingfee;
	}
}

class educationloan extends loan
{
	private String collagename, degreetype,degreename,gardianname,occupation,gardianincome,durationforrefund;
	private int durationofdegree,xpercentage, xiipercentage,loanamount,roi;
	
	public void setdata()
	{
		super.setdata();
		
		collagename = JOptionPane.showInputDialog("Enter collagename name");
		degreetype = JOptionPane.showInputDialog("Enter degreetype");
		degreename = JOptionPane.showInputDialog("Enter degree name");
		String dofd = JOptionPane.showInputDialog("Enter durationofdegree");
		durationofdegree =Integer.parseInt(dofd);
		gardianname = JOptionPane.showInputDialog("Enter gardian name");
		occupation = JOptionPane.showInputDialog("Enter occupation name");
		gardianincome = JOptionPane.showInputDialog("Enter gardianincome");
		durationforrefund = JOptionPane.showInputDialog("Enter duration for refund");
		
		String xperc= JOptionPane.showInputDialog("Enter 10th percentage");
		xpercentage = Integer.parseInt(xperc);
		
		String xiiper = JOptionPane.showInputDialog("Enter 12th percentage");
		xiipercentage = Integer.parseInt(xiiper);
		
		String la = JOptionPane.showInputDialog("Enter loanamount");
	    loanamount = Integer.parseInt(la);
		
		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);
		
	}
	
	public void showdata()
	{
		super.showdata();
		
		System.out.println("the collagename is"+" "+collagename);
		System.out.println("the degreetype is"+" "+degreetype);
		System.out.println("the degreename is"+" "+degreename);
		System.out.println("the duration of degree is"+" "+durationofdegree);
		System.out.println("the gardianname is"+" "+gardianname);
		System.out.println("the occupation is"+" "+occupation);
		System.out.println("the gardianincome is"+" "+gardianincome);
		System.out.println("the durationforrefund is"+" "+durationforrefund);
		System.out.println("the 10th percentage are"+" "+xpercentage);
		System.out.println("the 12th percentage are"+" "+xiipercentage);
		System.out.println("the loanamount is"+" "+loanamount);
		System.out.println("the roi is"+" "+roi);
	}
	
	public void disbursementloan()
	{
		int dl = loanamount/durationofdegree;
		System.out.println("disbursement amount is "+" "+dl);
	}
	
	public void emi()
	{
		double em = loanamount +(loanamount*roi)*durationofdegree/durationofdegree*12;
	System.out.println("emi for loan amount is"+" "+em);
	}
}

class bussinessloan extends loan
{
	private String typebus,busdetails,oname,bname,baddress,secdetails;
	private int shares,regno,capital,loanamount,roi,duration;
	
	public void setdata()
	{
		super.setdata();
		
		typebus = JOptionPane.showInputDialog("Enter the bussiness type");
		busdetails = JOptionPane.showInputDialog("Enter the bussiness details");
		oname = JOptionPane.showInputDialog("Enter the owner name");
		bname = JOptionPane.showInputDialog("Enter the bussiness name");
		baddress = JOptionPane.showInputDialog("Enter the bussiness address");
        secdetails = JOptionPane.showInputDialog("Enter the security details");
		
		String shr = JOptionPane.showInputDialog("Enter shares of owner");
		shares = Integer.parseInt(shr);
		
		String rgno = JOptionPane.showInputDialog("Enter the registration no");
		regno = Integer.parseInt(rgno);
		
		String cap = JOptionPane.showInputDialog("Enter the capital");
		capital = Integer.parseInt(cap);
		
		String la = JOptionPane.showInputDialog("Enter the loanamount");
		loanamount = Integer.parseInt(la);
		
		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);
		
		String dur = JOptionPane.showInputDialog("Enter duration");
		duration = Integer.parseInt(dur);
		
	}
	
	
	public void showdata()
	{
		super.showdata();
		
		System.out.println("the type bussiness is"+" "+typebus);
		System.out.println("the bussiness details is"+" "+busdetails);
		System.out.println("the bussiness owner name is"+" "+oname);
		System.out.println("the bussiness name is"+" "+bname);
		System.out.println("the bussiness address is"+" "+baddress);
		System.out.println("bussiness security details are"+" "+secdetails);
		System.out.println("the shares of owner"+" "+shares);
		System.out.println("the registration no is"+" "+regno);
		System.out.println("the capital is"+" "+capital);
		System.out.println("the loanamount is"+" "+loanamount);
		System.out.println("the roi is"+" "+roi);
		System.out.println("the duration is"+" "+duration);
	
}

 public void totalasset()
 {
	 
	 int tasset = capital + loanamount;
System.out.println("the total asset is"+" "+tasset);
 }

public void emi()
{
	
	 int em = loanamount +(loanamount*roi)*duration/duration*12;
	System.out.println("emi for loan amount is"+" "+em);
}
}
 
	class carloan extends loan
{
	private String carname, modelname, fueltype, insurranceyear;
	private int exshowroomprice, insurranceamount, rtochargers,
	            accessoriescost, downpayment, loanamount, roi, duration;

	public void setdata()
	{
		super.setdata();

		carname = JOptionPane.showInputDialog("Enter car name");
		modelname = JOptionPane.showInputDialog("Enter model name");
		fueltype = JOptionPane.showInputDialog("Enter fuel type");
		insurranceyear = JOptionPane.showInputDialog("Enter insurance year");

		String esp = JOptionPane.showInputDialog("Enter ex-showroom price");
		exshowroomprice = Integer.parseInt(esp);

		String ia = JOptionPane.showInputDialog("Enter insurance amount");
		insurranceamount = Integer.parseInt(ia);

		String rto = JOptionPane.showInputDialog("Enter RTO charges");
		rtochargers = Integer.parseInt(rto);

		String acc = JOptionPane.showInputDialog("Enter accessories cost");
		accessoriescost = Integer.parseInt(acc);

		String dp = JOptionPane.showInputDialog("Enter down payment");
		downpayment = Integer.parseInt(dp);

		String la = JOptionPane.showInputDialog("Enter loan amount");
		loanamount = Integer.parseInt(la);

		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);

		String dur = JOptionPane.showInputDialog("Enter duration");
		duration = Integer.parseInt(dur);
	}

	public void showdata()
	{
		super.showdata();

		System.out.println("car name is " + carname);
		System.out.println("model name is " + modelname);
		System.out.println("fuel type is " + fueltype);
		System.out.println("insurance year is " + insurranceyear);
		System.out.println("ex-showroom price is " + exshowroomprice);
		System.out.println("insurance amount is " + insurranceamount);
		System.out.println("rto charges are " + rtochargers);
		System.out.println("accessories cost is " + accessoriescost);
		System.out.println("down payment is " + downpayment);
		System.out.println("loan amount is " + loanamount);
		System.out.println("roi is " + roi);
		System.out.println("duration is " + duration);
	}

	public void onroadprice()
	{
		int orp = exshowroomprice + insurranceamount + rtochargers + accessoriescost;
		System.out.println("on road price is " + orp);
	}

	public void emi()
	{
		int em = loanamount + (loanamount * roi) * duration / (duration * 12);
		System.out.println("emi for car loan is " + em);
	}
}
class goldloan extends loan
{
	private String detailsofgold, itemwithdescription,
	               goldsmithname, addressofgoldsmith;
	private int weighttogold, avgcost, currentavgcost,
	            loanamount, roi, duration;

	public void setdata()
	{
		super.setdata();

		detailsofgold = JOptionPane.showInputDialog("Enter details of gold");
		itemwithdescription = JOptionPane.showInputDialog("Enter item with description");
		goldsmithname = JOptionPane.showInputDialog("Enter goldsmith name");
		addressofgoldsmith = JOptionPane.showInputDialog("Enter address of goldsmith");

		String wg = JOptionPane.showInputDialog("Enter weight of gold");
		weighttogold = Integer.parseInt(wg);

		String ac = JOptionPane.showInputDialog("Enter average cost");
		avgcost = Integer.parseInt(ac);

		String cac = JOptionPane.showInputDialog("Enter current average cost");
		currentavgcost = Integer.parseInt(cac);

		String la = JOptionPane.showInputDialog("Enter loan amount");
		loanamount = Integer.parseInt(la);

		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);

		String dur = JOptionPane.showInputDialog("Enter duration");
		duration = Integer.parseInt(dur);
	}

	public void showdata()
	{
		super.showdata();

		System.out.println("details of gold are " + detailsofgold);
		System.out.println("item with description is " + itemwithdescription);
		System.out.println("goldsmith name is " + goldsmithname);
		System.out.println("address of goldsmith is " + addressofgoldsmith);
		System.out.println("weight of gold is " + weighttogold);
		System.out.println("average cost is " + avgcost);
		System.out.println("current average cost is " + currentavgcost);
		System.out.println("loan amount is " + loanamount);
		System.out.println("roi is " + roi);
		System.out.println("duration is " + duration);
	}

	public void settlementamount()
	{
		int sa = loanamount + (loanamount * roi) * duration / (duration * 12);
		System.out.println("settlement amount is " + sa);
	}
}
class farmingloan extends loan
{
	private String villagename, gatno, details712, cropdetails, detailsoflandtype;
	private int areaoffarminhector, loanamount, roi, duration, shareoutamount;

	public void setdata()
	{
		super.setdata();

		villagename = JOptionPane.showInputDialog("Enter village name");
		gatno = JOptionPane.showInputDialog("Enter gat number");
		details712 = JOptionPane.showInputDialog("Enter 7/12 details");
		cropdetails = JOptionPane.showInputDialog("Enter crop details");
		detailsoflandtype = JOptionPane.showInputDialog("Enter land type details");

		String area = JOptionPane.showInputDialog("Enter area of farm in hector");
		areaoffarminhector = Integer.parseInt(area);

		String la = JOptionPane.showInputDialog("Enter loan amount");
		loanamount = Integer.parseInt(la);

		String ri = JOptionPane.showInputDialog("Enter roi");
		roi = Integer.parseInt(ri);

		// fixed duration = 1 year
		duration = 1;

		String sa = JOptionPane.showInputDialog("Enter share out amount");
		shareoutamount = Integer.parseInt(sa);
	}

	public void showdata()
	{
		super.showdata();

		System.out.println("village name is " + villagename);
		System.out.println("gat number is " + gatno);
		System.out.println("7/12 details are " + details712);
		System.out.println("crop details are " + cropdetails);
		System.out.println("land type details are " + detailsoflandtype);
		System.out.println("area of farm in hector is " + areaoffarminhector);
		System.out.println("loan amount is " + loanamount);
		System.out.println("roi is " + roi);
		System.out.println("duration is " + duration);
		System.out.println("share out amount is " + shareoutamount);
	}

	public void inhandamount()
	{
		int inhand = loanamount - shareoutamount;
		System.out.println("in hand amount is " + inhand);
	}

	public void settlementamount()
	{
		int sa = loanamount + (loanamount * roi) * duration / (duration * 12);
		System.out.println("settlement amount is " + sa);
	}
}
   
	 
	 
class test
{
	public static void main(String[]args)
	{
		loan l;
		l=new loan();
		l.setdata();
		l.showdata();
		
		homeloan hl;
		hl = new homeloan();
		hl.setdata();
		hl.showdata();
		hl.totalcost();
		hl.emi();
		
		ploan pl;
		pl = new ploan();
		pl.setdata();
		pl.showdata();
		pl.emi();
		pl.inhandamount();
		
		educationloan el;
		el = new educationloan();
		el.setdata();
		el.showdata();
		el.disbursementloan();
		el.emi();
		
		bussinessloan bl;
		bl = new bussinessloan();
		bl.setdata();
		bl.showdata();
		bl.totalasset();
		bl.emi();
		
		carloan cl;
        cl = new carloan();
        cl.setdata();
        cl.showdata();
        cl.onroadprice();
        cl.emi();
		
		goldloan gl;
        gl = new goldloan();
        gl.setdata();
        gl.showdata();
        gl.settlementamount();

        farmingloan fl;
        fl = new farmingloan();
        fl.setdata();
        fl.showdata();
        fl.inhandamount();
        fl.settlementamount();


		
	}
}
	
























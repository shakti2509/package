package utility;

public class Manager extends Employee {
	private double allow,incent;

	public Manager() {
		super();
	}

	public Manager(int eid,String name,double salary,double allow ,double incent) {
		super(eid,name,salary);
		this.allow = allow;
		this.incent = incent;
	}
	public void diplay()
	{
		super.display();
		System.out.println(super.display());
		System.out.println("allowence is :"+allow);
		System.out.println("incentive is :"+incent);
		
	}
	

}

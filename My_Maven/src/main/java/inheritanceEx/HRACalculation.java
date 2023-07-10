package inheritanceEx;

public class HRACalculation extends GetEmployeeSalary {
	float hra,pf;
	public void calculateHRA()	
	{
		hra=(basic_pay*5)/100;
		pf=(basic_pay*20)/100;
		//System.out.println("\nHRA = "+hra);
		//System.out.println("\nPF = "+pf);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRACalculation obj=new HRACalculation();
		obj.enterSalary();
		obj.calculateHRA();
	}*/

}

package inheritanceEx;

public class CheckSum extends AddNum {
	int total;
	public void check()
	{
		total=super.sum();
		System.out.println("Total = "+total);
		if (total%10==0)
			System.out.println("Addition result is divisible by 10");
		else
			System.out.println("Addition result is not divisible by 10");
				
	}

	public static void main(String[] args) {
		
		CheckSum obj=new CheckSum();
		obj.check();

	}

}

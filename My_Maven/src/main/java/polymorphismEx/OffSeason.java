package polymorphismEx;

public class OffSeason extends Discount 
{
	double getDiscount(double total)
	{
		discount=total*15/100;
		return discount ;
	}  

}

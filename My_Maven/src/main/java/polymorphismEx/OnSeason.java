package polymorphismEx;

public class OnSeason extends Discount
{
	double getDiscount(double total)
	{
		discount=total*40/100;
		return discount ;
	}  

}

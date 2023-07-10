package interfaceEx;

public interface RD {
    //Declare the constants
    double P = 1000; //deposit amount per month
    int N = 6; //duration in months
    double R = 8.1; //interest rate in percentage
    
    //Declare an abstract method to calculate the maturity amount
    double calculateMaturityAmount();
}

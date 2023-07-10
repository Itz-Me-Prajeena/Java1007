package interfaceEx;

class RDInterest implements RD {
    
    //Implement the method to calculate the maturity amount
    public double calculateMaturityAmount() {
        //double t = N / 12.0; //time duration in years
        double i = R / 100.0; //interest rate in decimal
        double a = P *N* (Math.pow((1 + i/4), N)); //maturity amount
        return a;
    }
    
    public static void main(String[] args) {
        //Create an object of the class
        RDInterest rd = new RDInterest();
        
        //Call the method to calculate the maturity amount
        double a = rd.calculateMaturityAmount();
        
        //Calculate the interest earned
        double interest = a - (P * N);
        
        System.out.println("The maturity amount is: " + a);
        System.out.println("The interest earned is: " + interest);
        
    }
}

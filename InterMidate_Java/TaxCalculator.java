// package myjava;

class CountrynotValidException extends Exception {
	public CountrynotValidException(String s) {
        super(s); // Call constructor of parent Exception
    }
}
 class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String s) {
		super(s); // Call constructor of parent Exception
	}
}
 
class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String s) {
		super(s); // Call constructor of parent Exception
	}
}
public class TaxCalculator {
    public static double CalulateTax(String empName,boolean isIndian,double Salary) throws CountrynotValidException, EmployeeNameInvalidException,TaxNotEligibleException {
    	double taxAmmount=0;
    	if (!isIndian) throw new CountrynotValidException("Nott An Indian");
    	if(empName=="" || empName==null) throw new EmployeeNameInvalidException("Employee Name Not Valid");
    	if(Salary>100000 && isIndian) {
    		taxAmmount=Salary*8/100;
    	}
    	else if(Salary<100000 && Salary>50000 && isIndian) {
    		taxAmmount=Salary*6/100;
    	}
    	else if(Salary<50000 && Salary>30000 && isIndian) {
    		taxAmmount=Salary*5/100;
    	}
    	else if(Salary<30000 && Salary>10000 && isIndian) {
    		taxAmmount=Salary*4/100;
    	}
    	else {
    		throw new TaxNotEligibleException(" No Tex");
    	}
    		
    	return taxAmmount;
    }
    public static void main(String[] args) {
        System.out.println("TestCase\tEmployee Name\tIsIndian\tSalary\t\tMessage / Tax");

        String t1name = "Ambuj";
        boolean t1isindian = false;
        double t1salary = 34000;

        String t2name = "tim";
        boolean t2isindian = true;
        double t2salary = 1000;

        String t3name = "jack";
        boolean t3isindian = true;
        double t3salary = 55000;

        String t4name = "";
        boolean t4isindian = true;
        double t4salary = 30000;

        // Test Case 1
        try {
            double tax = CalulateTax(t1name, t1isindian, t1salary);
            System.out.println("Test Case 1\t" + t1name + "\t\t" + t1isindian + "\t\t" + t1salary + "\t\tTax: " + tax);
        } catch (Exception e) {
            System.out.println("Test Case 1\t" + t1name + "\t\t" + t1isindian + "\t\t" + t1salary + "\t\t" + e.getMessage());
        }

        // Test Case 2
        try {
            double tax = CalulateTax(t2name, t2isindian, t2salary);
            System.out.println("Test Case 2\t" + t2name + "\t\t" + t2isindian + "\t\t" + t2salary + "\t\tTax: " + tax);
        } catch (Exception e) {
            System.out.println("Test Case 2\t" + t2name + "\t\t" + t2isindian + "\t\t" + t2salary + "\t\t" + e.getMessage());
        }

        // Test Case 3
        try {
            double tax = CalulateTax(t3name, t3isindian, t3salary);
            System.out.println("Test Case 3\t" + t3name + "\t\t" + t3isindian + "\t\t" + t3salary + "\t\tTax: " + tax);
        } catch (Exception e) {
            System.out.println("Test Case 3\t" + t3name + "\t\t" + t3isindian + "\t\t" + t3salary + "\t\t" + e.getMessage());
        }

        // Test Case 4
        try {
            double tax = CalulateTax(t4name, t4isindian, t4salary);
            System.out.println("Test Case 4\t" + t4name + "\t\t" + t4isindian + "\t\t" + t4salary + "\t\tTax: " + tax);
        } catch (Exception e) {
            System.out.println("Test Case 4\t" + t4name + "\t\t" + t4isindian + "\t\t" + t4salary + "\t\t" + e.getMessage());
        }
    }


}

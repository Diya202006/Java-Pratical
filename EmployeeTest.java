class Employee{
    private String FirstName;
    private String LastName;
    private double MonthlySalary;

  public Employee(String FirstName,String LastName, double MonthlySalary){
  this.FirstName=FirstName;
  this.LastName=LastName;
  if (MonthlySalary>0)
    this.MonthlySalary=MonthlySalary;
  else
    this.MonthlySalary=0.0;
}

  public String getFirstName(){
    return FirstName;
}

  public void setFirstName(String FirstName){
    this.FirstName=FirstName;
}

  public String getLastName(){
    return LastName;
}

  public void setLastName(String LastName){
    this.LastName=LastName;
}

  public double getMonthlySalary(){
    return MonthlySalary;
}

  public void setMonthlySalary(double MonthlySalary){
   if (MonthlySalary>0)
    this.MonthlySalary=MonthlySalary;
  else
    this.MonthlySalary=0.0; 
}

  public double getYearlySalary(){
    return MonthlySalary*12;
 }
}

public class EmployeeTest{
    public static void main(String[] args){
      Employee emp1 = new Employee("Ram","Patil",25000);
      Employee emp2 = new Employee("Raj","Sharma",26000);

      System.out.println("Yearly Salary of Employee's: ");
      System.out.println(emp1.getFirstName()+ " "+ emp1.getLastName()+ ": $" + emp1.getYearlySalary());
      System.out.println(emp2.getFirstName()+ " "+ emp2.getLastName()+ ": $" + emp2.getYearlySalary());
     
      emp1.setMonthlySalary(emp1.getMonthlySalary()*1.10);
      emp2.setMonthlySalary(emp2.getMonthlySalary()*1.10);

      System.out.println("\n After 10% Raise: ");
      System.out.println(emp1.getFirstName()+ " "+ emp1.getLastName()+ ": $" + emp1.getYearlySalary());
      System.out.println(emp2.getFirstName()+ " "+ emp2.getLastName()+ ": $" + emp2.getYearlySalary());

 }
}
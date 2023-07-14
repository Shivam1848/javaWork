	import java.util.*;
  
class Employee{
    int salary;
    int work_per_day;
    
    public void getInfo(){
        
        System.out.println(this.salary);
    }
    
    public void addSal(){
        if(salary<500){
            salary = salary + 10;
        }
        
    }
    
    public void addWork(){
        if(work_per_day>6){
            work_per_day = salary + 5;
        }
    }
}

public class EmployeeSalaryOOPS{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Employee em = new Employee();
        em.salary = 499;
        em.work_per_day = 8;
        
        //System.out.println("Want to know your salary....if yes press y otherwise n: ");
        //String know_salary = sc.nextLine();
        
        em.addSal();
        em.addWork();
        em.getInfo();
        
        //if(know_salary == "y"){
            
        //}
    }
}
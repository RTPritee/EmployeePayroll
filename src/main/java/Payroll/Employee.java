package Payroll;
import java.util.Objects;
class Employee{
    private String name;
    private String role;

    Employee(){}
    Employee(String name, String role){
        this.name= name;
        this.role=role;
    }
    private String getName(){
        return this.name;
    }
    private String getRole(){
        return this.role;
    }
    private String setName(){
    return this.name =name;
    }
    private String setRole(){
      return this.role = role;
    }





}
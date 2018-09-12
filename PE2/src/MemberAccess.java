import java.lang.String;
import java.lang.System;

class Member{
    String MemName;
    int Age;
    float MemSalary;

    Member(String memname, int age, float salary){
        MemName = memname;
        Age = age;
        MemSalary = salary;
    }
    public void DisplayMemberDetails(){
        System.out.println("Members Name: " + MemName);
        System.out.println("Members Age: " + Age);
        System.out.println("Members Salary: " + MemSalary);
    }
}

class Member_Variable{
    public String member_variable(String memname, int age, float salary){
        Member newmember = new Member(memname, age, salary);
        newmember.DisplayMemberDetails();
        return "Success";

    }
}
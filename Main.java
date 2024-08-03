package com.model;
import java.util.*;
public class Main {
    public static void emp()
    {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Select by process by entering number to make changes in the database");
		System.out.println("1.create table for the employee");
		System.out.println("2.insert data into the table");
		System.out.println("3.select  employee specific using id");
		System.out.println("4.select all employee deatails from the table");
		System.out.println("5.update the employee details");
		System.out.println("6.delete the employee from the database");
		int n=sc.nextInt();
		
		Employee_Dao edao=new Employee_Dao();
		
		if(n==1)
			{
		
				edao.create();
				//break;
			}
		else if(n==2)
		{
			
			System.out.println("Enter the number of employee details you can add?");
			int k=sc.nextInt();
			System.out.println("id ename city dept designation doj dob salary address");
			for(int i=0;i<k;i++)
			{
			edao.insert(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
			}
		}
		else if(n==3){
			System.out.print("Enter the id which you want to see: ");
			edao.select(sc.nextInt());
		}
			
		else if(n==4)
		{
			edao.selectAll();
			//break;
		}
		else if(n==5)
		{
			System.out.println("Enter id of the employee and the salary you want to change");
			
			edao.update(sc.nextInt(),sc.next());
			//break;
		}else if(n==6)
		
		{
			
			System.out.println("Enter id of the employee which you want to delete");
			edao.delete(sc.nextInt());
			//break;
		}
		else {
			System.out.println("Enter valid operation");
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 'true' to select another option or else false");
		while(sc.nextBoolean())
		{
			
		emp();
		System.out.println("Enter 'true' to select another option or else false");
		}
	}
	

}

package javacore5_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main=new Main();
		int i=0;
		Employee[] employeeArray =new Employee[200];
		while(true){
			System.out.println("1. Create new Employee");
			System.out.println("2. Show existing Employee");
			System.out.println("3. Exit");
			Scanner scan1= new Scanner(System.in);
			int chooice= scan1.nextInt();
			switch(chooice){
				case 1:
					Employee em=main.enterEmployeeInfo();
					while(em==null){
						em=main.enterEmployeeInfo();
					}
					employeeArray[i]= em;
					i++;
					break;
				case 2:
					for(Employee em2 : employeeArray){
						if(em2!=null){
							main.showInfo(em2);
						}
					}
					break;
				case 3:
					break;
					 
			}
		}
	}
	private void showInfo(Employee nv){
		System.out.println("*************************************");
		System.out.println("Name Employee: "+nv.getName());
		System.out.println("Age:" + nv.getAge());
		System.out.println("Job: "+nv.getJob());
		System.out.println("Department: "+nv.getDepartment());
		System.out.println("*************************************");
	}
	private void analyzeDepartment(Employee em){
		if(em!=null){
			switch(em.getJob()){
				case "developer":
					em.setDepartment("development");
					break;
				case "tester":
					em.setDepartment("QA");
					break;
				case "reception":
					em.setDepartment("HR");
					break;
				default: 
					em.setDepartment("master");
			}
		}
	}
	private Employee enterEmployeeInfo(){
		
		Scanner scan1= new Scanner(System.in);
		//For name
		System.out.println("Name Employee: ");
		String name= scan1.nextLine();	
		
		
		Scanner scan2= new Scanner(System.in);
		//For age
		System.out.println("Age Employee: ");
		String age= scan2.nextLine();	
	
		
		Scanner scan3= new Scanner(System.in);
		//For job
		System.out.println("Job Employee: ");
		String job= scan3.nextLine();	
		
		
		Scanner scan4= new Scanner(System.in);
		//For salary
		System.out.println("Salary Employee: ");
		double sal= scan4.nextDouble();	
		
		if(!validateNumber(age)){
			return null;
		}else{
			Employee em=new Employee();
			em.setAge(Integer.parseInt(age));
			em.setName(name);
			em.setJob(job);
			em.setSalary(sal);
			return em;
		}
	}
	
	private boolean validateNumber(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}

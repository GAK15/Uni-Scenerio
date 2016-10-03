package kletech.ac.in;

import kletech.ac.in.University;

public interface University {
	int noOfStaff ();


	class Department{
		String sDepName;
		int noOfstudents;
		int noOfFaculties;

		public Department(String sDepName, int noOfstudents, int noOfFaculties) {
			this.sDepName = sDepName;
			this.noOfstudents = noOfstudents;
			this.noOfFaculties = noOfFaculties;
		}
	}

	public abstract class College implements University{
		String collCode;
		String collName;
		Department[] departments = new Department[10];
		int noOfDepts=0;
		public int noOfStaff(){
			int sum=0;
			for(int j=0;j<noOfDepts;j++)
			{
				if(departments[j]!=null)
					sum=sum+departments[j].noOfFaculties;
			}
			return sum;
		}

		public College(String collCode, String collName) {
			this.collCode = collCode;
			this.collName = collName;
		}

		void createDept (String sDepName, int noOfstudents,	int noOfFaculties){
			departments[noOfDepts++]=new Department(sDepName, noOfstudents, noOfFaculties);
		}

		void PrintInfo()
		{
			System.out.println("College Details:");
			System.out.println("\tCollege Name: "+collName+"\n\tCollege code: "+collCode+"\n\tNo. of Departments: "+noOfDepts);
			for(int i=0; i<noOfDepts; i++)
				System.out.println("\tDepartment Name: "+departments[i].sDepName+", Faculties: "+departments[i].noOfFaculties+", Students: "+departments[i].noOfstudents);
		}
	}

	class autonomousCollege extends College // Inheritance
	{
		Department[] splDepts = new Department[10]; //additional depts for autonomous colleges
		int noOfsplDepts=0;

		public autonomousCollege(String collCode, String collName) {
			super(collCode, collName);
		}
		public void CreateSplDept(String sDepName, int NoOfstudents, int NoOfFaculties){
			splDepts[noOfsplDepts++]=new Department(sDepName, NoOfstudents, NoOfFaculties);
		}
		@Override // Overriding base class method
		void PrintInfo()
		{
			System.out.println("Autonomous College Details:");
			System.out.println("\tCollege Name: "+collName+"\n\tCollege code: "+collCode+"\n\tNo. of Departments: "+(noOfDepts+noOfsplDepts));
			for(int i=0; i<noOfDepts; i++)
				System.out.println("\tDepartment Name: "+departments[i].sDepName+", Faculties: "+departments[i].noOfFaculties+", Students: "+departments[i].noOfstudents);
			for(int i=0; i<noOfsplDepts; i++)
				System.out.println("\tDepartment Name: "+splDepts[i].sDepName+", Faculties: "+splDepts[i].noOfFaculties+", Students: "+splDepts[i].noOfstudents);
		}
	}

	class nonautonomousCollege extends College // Inheritance
	{
		public nonautonomousCollege(String collCode, String collName) {
			super(collCode, collName);
		}
	}
}










package greatleaen1;
 class SuperDepartment{
public void departmentName() {
	System.out.println("Super department");
}
public void getTodaysWork() {
	System.out.println("No work as of now");
}
	
public void getWorkDeadline() {
	System.out.println("nil");
}
public void isTodayAHoliday() {
	System.out.println("Today is not a Holiday");
}
}
 class Admindepartment extends SuperDepartment{
		public void welcome() {
			System.out.println("Welcome to Admin Department");
		}
	 
	public void departmentName() {
		System.out.println("Admin Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete your documents submision");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
}
 class Hrdepartment extends SuperDepartment{
		public void welcome() {
			System.out.println("Welcome to HR Department");
		}
	 public void departmentName() {
		System.out.println("HR Department");
	}
	public void getTodaysWork() {
		System.out.println("Fill today's timesheet mark your attendence");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void doActivity() {
		System.out.println("team lunch");
	}
	}
 class techdepartment extends SuperDepartment{
	 
		public void welcome() {
			System.out.println("Welcome to Tech Department");
		}
	 public void departmentName() {
		System.out.println("tech department");
	}
	public void getTodatwork() {
		System.out.println("Complete your coding Module 1");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
	public void getTechstackinformation() {
		System.out.println("Core java");
	}
 
 public static void main(String[] args) {
	  SuperDepartment obj=new SuperDepartment();
	  Admindepartment obj1=new  Admindepartment();
	  Hrdepartment obj2=new  Hrdepartment();
	  techdepartment obj3=new  techdepartment();
	obj1 .welcome();
    obj1.getTodaysWork();
    obj1.getWorkDeadline();
    obj.isTodayAHoliday();
	  
	obj2.welcome();
	obj2.doActivity();
    obj2.getTodaysWork();
	obj2.getWorkDeadline();
	obj.isTodayAHoliday();
	  
	
	obj3.welcome();
	obj3.getTodatwork();
	obj3.getWorkDeadline();
	obj3.getTechstackinformation();
	obj.isTodayAHoliday();
	  
 }	  
 }
 
 
 
 
 
 
 
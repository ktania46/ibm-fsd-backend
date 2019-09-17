import java.util.*;
public class Empmgmtmain01 {

	public static void main(String[] args) {
		List<EmpMgmtServices> employee = new ArrayList< EmpMgmtServices>();
		employee.add(new  EmpMgmtServices(1,"Tania",21,"Manager","IT.","INDIA"));
		System.out.println(employee);
		
		System.out.println("Enter operation to be performed");
		System.out.println("1:add employee");
		System.out.println("2:veiw employee");
		System.out.println("3:veiw all employee");
		System.out.println("4:update employee");
		System.out.println("5:delete employee");
		
		
		for(int x=0;x<10;x++) {
			Scanner sc=new Scanner(System.in);
			int k=sc.nextInt();
		if(k==1) {
			System.out.println("Enter id");
			int i=sc.nextInt();
			
			System.out.println("Enter name");
		    String n=sc.next();
			
			System.out.println("Enter age");
			int a=sc.nextInt();
			
			System.out.println("Enter designation");
			String d=sc.next();
			
			System.out.println("Enter department");
			String e=sc.next();
			
			System.out.println("Enter country");
			String c=sc.next();
			employee.add(new  EmpMgmtServices(i,n,a,d,e,c));
			System.out.println("Enter next operation");
			
		System.out.println(employee);
		}
		
		if(k==1) {
			System.out.println(employee);
			break;
		}
		if(k==2) {
			System.out.println("Enter id");
			Scanner sc1=new Scanner(System.in);
			int i=sc1.nextInt();
			for(int j=0;j<employee.size();j++) {
				if(employee.get(j).id==i)
				{
					System.out.println(employee.get(j));
					
					}
				}
			System.out.println("Enter next operation");
		}
		
		if(k==4) {
			
			System.out.println("Enter id");
			Scanner sc1=new Scanner(System.in);
			int i=sc1.nextInt();
			for(int j=0;j<employee.size();j++) {
				if(employee.get(j).id==i)
				{
					
					
					employee.set(j, new  EmpMgmtServices(1,"Tannu",34,"Manager","engg.","INDIA") );
					System.out.println("updated");
					System.out.println(employee);
					
					}
			}
			System.out.println("Enter next operation");
			
		}
		if(k==3) {
			System.out.println("veiw all");
			System.out.println(employee);
			System.out.println("Enter next operation");
		}
		if(k==5) {
			System.out.println("Enter id");
			Scanner sc1=new Scanner(System.in);
			int i=sc1.nextInt();
			for(int j=0;j<employee.size();j++) {
				if(employee.get(j).id==i)
				{
					
					
					employee.remove(j);
					System.out.println("updated");
					System.out.println(employee);
					
					}
			}
			System.out.println("Enter next operation");
		}
		x--;	
		}
	}

}

import java.util.*;
import java.util.stream.Stream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
class ImportData {

	public static String readFileAsString(String fileName)throws Exception 
	  { 
	    String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get(fileName))); 
	    return data; 
	  } 
	public static <T> Object[] concatenate(T[] a, T[] b) 
    { 
        // Function to merge two arrays of same type 
        return Stream.concat(Arrays.stream(a),Arrays.stream(b)).toArray(); 
    } 
}
 
public class Empmgmtmain01 {

	public static void main(String[] args) throws Exception  {
		List<EmpMgmtServices> employee = new ArrayList< EmpMgmtServices>();
		employee.add(new  EmpMgmtServices(1,"Tania",21,"Manager","IT.","INDIA"));
		System.out.println(employee);
		
		System.out.println("Enter operation to be performed");
		System.out.println("1:add employee");
		System.out.println("2:veiw employee");
		System.out.println("3:veiw all employee");
		System.out.println("4:update employee");
		System.out.println("5:delete employee");
		System.out.println("6:View imported employee");
		System.out.println("7:View imported and existing employee");
		
		
	    
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
		
		//
		
		if(k==6) {
			System.out.println(ImportData.readFileAsString("C:\\TRAINING\\ibm-fsd-backend\\assignment\\core java\\EmployeeData.txt")); 
	    }
		
		// 
		if(k==7) {
		List<String> lines = Collections.emptyList();
		lines = Files.readAllLines(Paths.get("C:\\TRAINING\\ibm-fsd-backend\\assignment\\core java\\EmployeeData.txt"));
	      Object[] array = employee.toArray();
	      Object[] array1 = lines.toArray();
	      Object[] c = ImportData.concatenate(array,array1); 
	      System.out.println("combined view is : "
                  + Arrays.toString(c));
	      FileWriter fw=new FileWriter("C:\\TRAINING\\ibm-fsd-backend\\assignment\\core java\\abc.txt");    
          fw.write(Arrays.toString(c));    
          fw.close(); 
		
	}
		Thread t1 = new Thread(new ImportExport());
		t1.start();
		}
	}
}

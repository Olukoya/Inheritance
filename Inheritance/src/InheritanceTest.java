import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class InheritanceTest 
{	
	public static void main(String[] args) {
		ArrayList<String> List=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		//SETTING THE CONDITION FOR CONTINUATION
		String choice="y";
		while(choice.equalsIgnoreCase("y")){
			
		//SELECTION OF PRODUCT TYPE
			System.out.println("Product type:(Book/Software)?");
			String type=sc.nextLine();
			
		//FOR BOOK, ENTER THE REQUIRED INFORMATION AND STORE TO DESIGNATED LOCATION
			if(type.equalsIgnoreCase("Book"))
				{				
				System.out.println("Enter the book description:");
				String descript=sc.nextLine();
				System.out.println("Enter the book price:");
				double price=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the book author:");
				String author=sc.nextLine();
				Book a=new Book();
				a.setAuthor(author);
				a.setDescription(descript);
				a.setPrice(price);
				a.setCode(type);	
				List.add(a.toString("detail"));				
				}
			else
			{
				
				//FOR SOFTWARE, ENTER THE REQUIRED INFORMATION AND STORE TO DESIGNATED LOCATION
			if(type.equalsIgnoreCase("Software"))
				{					
				System.out.println("Enter the software description:");
				String descript=sc.nextLine();
				System.out.println("Enter the software price:");
				double price=sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the software version:");
				String version=sc.nextLine();
				Software s=new Software();
				s.setVersion(version);
				s.setDescription(descript);
				s.setPrice(price);
				s.setCode(type);	
				List.add(s.toString("detail"));					
				}
				
			}
			System.out.println("Do you wish to continue?(y/n)");
			choice=sc.nextLine();
			
		}
		System.out.println("PRODUCT DETAILS DISPLAYED BELOW");
		System.out.println("\n");
		Iterator<String> itr=List.iterator(); 
		while(itr.hasNext()){  
			  String in=itr.next();  
			 System.out.println(in);  
			  }
		sc.close();
	}

}

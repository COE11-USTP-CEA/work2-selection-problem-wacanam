import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class inventory{
	public static void main(String[] args){
		boolean found=false;
		int counter=0;
		char c;
		System.out.println("\tGeneral Marchandise\n");
		System.out.println("P-name\t\tP-type\t\tP-price\n");	
		item t1 = new item ("Dove","Shampoo",7.00f);
		item t2 = new item ("Dove","Soap",25.00f);
		item t3 = new item ("555","Tuna",30.00f);
		item t4 = new item ("Colgate","Toothpaste",7.00f);
		item t5 = new item ("Ariel","Detergent",12.00f);
		item t6 = new item ("Close up","Toothpaste",7.00f);
		item t7 = new item ("Breeze","Detergent",14.00f);
		item t8 = new item ("XO","Candy",6.00f);
		item t9 = new item ("Neozep","Medicine",28.00f);
		item t10 = new item ("Maxx","Candy",1.00f);
		
		List<item> listofitems = new ArrayList();
		listofitems.add(t1);
		listofitems.add(t2);
		listofitems.add(t3);
		listofitems.add(t4);
		listofitems.add(t5);
		listofitems.add(t6);
		listofitems.add(t7);
		listofitems.add(t8);
		listofitems.add(t9);
		listofitems.add(t10);
		
		for(item x: listofitems){
			System.out.print(x.Getname());
			System.out.print("\t" + x.Getcname());
			System.out.print("\t" + x.Getprice()+ "\n");
		}
		//List<item> founditems = new ArrayList();
		while(!found == true){
			Scanner searchitem = new Scanner(System.in);
			System.out.print("\nType 'NO' to exit\nWhat product you are looking for? : ");
			String search = searchitem.nextLine();
			for(item y: listofitems){
				if(search.equalsIgnoreCase("no"))
					break;
				if((search.equalsIgnoreCase(y.Getname()))||(search.equalsIgnoreCase(y.Getcname()))){
					found = true;
					counter++;
					System.out.print(y.Getname()+"\t" + y.Getcname()+"\t" + y.Getprice()+ "\n");
						}
					}
			if(search.equalsIgnoreCase("no")){
				System.out.println("Exiting Program");
				found=true;
			}
			System.out.println(counter +" item(s) found");
			counter = 0;
			if(found ==false)
				System.out.println("try again!");
			}	
		}
	}
		
	
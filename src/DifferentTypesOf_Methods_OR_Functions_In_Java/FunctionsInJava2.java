package DifferentTypesOf_Methods_OR_Functions_In_Java;

import java.util.ArrayList;

public class FunctionsInJava2 {

	public static void main(String[] args) {


	FunctionsInJava2 obj = new FunctionsInJava2();

	
	
	String studentArray[] = obj.getStundetNames("second");
	for (String s : studentArray) {
		System.out.println(s);
	}
	
	//
	ArrayList<String> walMartProdList = obj.getProductList("walmart");
	System.out.println("total products in walmart store: " + walMartProdList.size());
//	for (String prod : walMartProdList) {
//		System.out.println(prod);
//	}
	
	//walMartProdList.forEach(ele -> System.out.println(ele));
	walMartProdList.stream().forEach(System.out::println);//method reference in JDK 1.8
	
	System.out.println(obj.isUSCitizen("Shweta"));

}
	//WAM --> which will take className(String) -- return the list of Student Names (static Array)
		public String[] getStundetNames(String className){
			String stundetNames[] = new String[3];
			
			if(className.equalsIgnoreCase("first")){
				stundetNames[0]="Tom";
				stundetNames[1]="Peter";
				stundetNames[2]="Steve";
			}
			
			else if(className.equalsIgnoreCase("second")){
				stundetNames[0]="naveen";
				stundetNames[1]="Rupali";
				stundetNames[2]="Shiva";
			}
			
			return stundetNames;
		}
		
		//WAM -- which will take ecomm site name, then return list of all the products
		public ArrayList<String> getProductList(String siteName){
			System.out.println("get the list of products from " + siteName);
			
			ArrayList<String> productList = new ArrayList<String>();
			
			if(siteName.equalsIgnoreCase("flipkart")){
				productList.add("Apple Macbook Pro");
				productList.add("Apple iPhoneX");
				productList.add("Nike Shoes");
			}
			
			else if(siteName.equalsIgnoreCase("amazon")){
				productList.add("Apple Macbook air");
				productList.add("Apple iPhoneX");
				productList.add("Reebok Shoes");
			}
			
			else if(siteName.equalsIgnoreCase("walmart")){
				productList.add("Windows 10 Lenovo");
				productList.add("Apple iPhoneX");
				productList.add("Nike Tshirts");
			}
			
			else{
				System.out.println("product list is not available for site: " + siteName);
			}
			
			return productList;
		}
		
		
		//WAM which will decide that person is US citizen or not...
		
		public boolean isUSCitizen(String personName){
			System.out.println("status for : " + personName);
		
			boolean status = false;
			
			if(personName.equalsIgnoreCase("Nimpa")){
				return status;
			}
			
			else if(personName.equalsIgnoreCase("Shweta")){
				status = true;
				return status;
			}
			
			else if(personName.equalsIgnoreCase("Naveen")){
				return status;
			}
			
			else{
				System.out.println(personName + " is not found.....");
				//return status;
			}
			
			return status;
			
		}
		
		}


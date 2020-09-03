package EncapsulationConcept_getter_And_setter;

public class CompanyTest {

	public static void main(String[] args) {

		
		Company c2 = new Company("HCL", 1900, "Noida", "HCL", "HR Policy");
		System.out.println(c2.name);
		
		System.out.println(c2.getPolicy());
		
		c2.getEmpData();
		
	}

}
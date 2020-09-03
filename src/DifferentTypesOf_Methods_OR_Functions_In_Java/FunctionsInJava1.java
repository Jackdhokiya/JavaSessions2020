package DifferentTypesOf_Methods_OR_Functions_In_Java;

public class FunctionsInJava1 {

	public static void main(String[] args) {
		System.out.println("main method");

		// create the object of class:
		
		FunctionsInJava1 obj = new FunctionsInJava1();
		obj.test();
		obj.getName();

		int i = obj.add();
		System.out.println(i + 20);

		String n = obj.getTrainerName();
		System.out.println("trainer name is : " + n);

		System.out.println(obj.isPermanent());

		int s1 = obj.sum(10, 20);
		System.out.println(s1);

		int s2 = obj.sum(40, 50);
		System.out.println(s2);

		double value = obj.multiply(2.3, 3.4);
		System.out.println(value);
		
		System.out.println(obj.getStudentMarks("Naveen"));
		System.out.println(obj.getStudentMarks("Tom"));
		System.out.println(obj.getStudentMarks("naveen"));
		
		obj.launchDriver("opera");


	}

	// 1. no input and no return:
	// void -- method can not return anything
	//return type: void
	public void test() {
		System.out.println("test method...");
	}

	public void getName() {
		System.out.println("get name method...");
	}

	// 2. no input but some return:
	//return type: int
	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	public String getTrainerName() {
		String name = "Naveen";
		return name;
	}

	public boolean isPermanent() {
		boolean flag = true;
		return flag;
	}

	// 3. some input but some return:
	public int sum(int x, int y) {
		System.out.println("SUM method....");
		int s = x + y;
		return s;
	}

	//return type: double
	/**
	 * this is used to multiply two numbers
	 * @param g
	 * @param h
	 * @return mul
	 */
	public double multiply(double g, double h) {
		System.out.println("multiply method");
		double mul = g * h;
		return mul;
	}

	/**
	 * This method is used to get the student marks on the basis of names.
	 * @param name
	 * @return int
	 */
	public int getStudentMarks(String name) {

		System.out.println("get Student Marks for ..." + name);
		
		int marks = -1;
		
		if (name.equalsIgnoreCase("Naveen")) {
			marks = 10;
		}

		else if (name.equalsIgnoreCase("Priya")) {
			marks = 50;
		}

		else if (name.equalsIgnoreCase("Piyanka")) {
			marks = 70;
		}

		else if (name.equalsIgnoreCase("llias")) {
			marks = 90;
		}

		else {
			System.out.println(name + " is not found....");
		}
		
		return marks;

	}
	
	//WAM where u have to send the browser name and launch the browser accordingly.
	
	public void launchDriver(String browserName){
		
		System.out.println("launching browser....");
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.out.println("launch google chrome");
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			System.out.println("launch mozilla firefox");
		}
		
		else if(browserName.equalsIgnoreCase("safari")){
			System.out.println("launch apple safari");
		}
		
		else if(browserName.equalsIgnoreCase("ie")){
			System.out.println("launch MS IE");
		}
		
		else{
			System.out.println("browser is not found: " + browserName + " we dont support this browser...");
		}
		

	}

}

package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

//		try {
//			throw new Exception("NAVEENEXCEPTION");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		String br = "opera";

		if (br.equals("chrome")) {

		}
		else if (br.equals("ff")) {

		}
		else if (br.equals("ie")) {

		}
		else{
			System.out.println("plz pass the right browser name..."+ br);
			try {
				throw new Exception("NOBrowserFoundException");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}



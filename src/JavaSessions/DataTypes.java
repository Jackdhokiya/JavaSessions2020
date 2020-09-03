package JavaSessions;

/**
 * 
 * @author Owner
 *
 */

public class DataTypes {

	public static void main(String[] args) {

    // Data Types:
	  //1. Primitive Data Types:
		 //a.Boolean Type: boolean: true or false
		 //b.Numeric Type:
		        //b.1:Character Type: char
		        //b.Integral Value:
		             //b.2.a: Integer: bytes,short,int,long
		             //b.2.b: Floating-point:float,double
		
		//1.bytes
		//range:-128 to 127
		//size: 8 bits = 1byte
		byte b =10;
		b = 20;
		
		byte b1 = 20;
		byte b2 = 0;
		
		//short:
		//range: -32468 to 32767
		//size: 16 bits = 2 bytes
		short sh = 1000;
		short b3 = 20;
		System.out.println(sh+b3);
		
		//3.int
		//range: 2147483648 to 2147483647
		//size: 32 bits = 4bytes
		int i = 100;
		int j = -200;
		int p = 3000;
		int q = 0;
		
		System.out.println(i+j+p);
		System.out.println((i+j+p)*q);
		
		//4.long:
		//range:
		//size: 32 bits = 4 bytes
		long l = 1000;
		long l1 = 9000009090148l;
		
		//5.float:
		//range: upto 7 decimal digits
		//size: 32 bits = 4 bytes
		float f = 12.33f;
		float f1 = (float)34.44f;
		
		System.out.println(f+f1);
		
		//6.double:
		//range: upto 16 decimal digits
		//size: 64 bits = 8 bytes
		double d = 12.333;
		double d1 = 111;
        System.out.println(d1);		
		
		//7.boolean: true / false
		// true and false are inbuilt default keyword
		boolean flag = true;
		boolean flag1 = false;
		boolean isUsCitizen = true;
		
		//8.char:
		//size: 16 bites = 2bytes
		char c = 'a';
		char c1 = '1';
		char c2 = '$';
		
		char gender = 'f';
		char score = 'P'; //Pass and fail
		
		System.out.println(c);
		
		
		
	}

}

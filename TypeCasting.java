package exercise;

public class TypeCasting {
	static byte byte_number=127;
	static int integer=2147483647;    //valid & range is between-21474836488 to 21474836488
	//static int j=-2147483649; 	//invalid
	
	static char character=97;			//valid & takes it as ascii value and prints the char
	static char character_1='k';		//valid
	
	static long Longnumber=23_45_566l;		//valid
	//static long Longnumber_1=9223372036854775808; //invalid as it's range is between -9223372036854775808 to 9223372036854775807
	 
	static short Shortnumber=-32768;	//valid ranges between -32768 to 32767
	static float Floatingpoint= -103.342f; //1.40239846e-45f to 3.40282347e+38f
	
	static double Doublepoint=4.94065645841246544e-324 ;
	static boolean bool=true;
	
	public static void main(String args[]) {
	System.out.println(integer);
	System.out.println(character);
	System.out.println(character_1);
	System.out.println(Longnumber);
	System.out.println(Shortnumber);
	System.out.println(Floatingpoint);
	System.out.println(Doublepoint);
	System.out.println(bool);
	
	
	
	//implicit typecasting
	

	int implicit_typecast_int=character;
	System.out.println("int to char : implicit");
	System.out.println(implicit_typecast_int);
	
	
	
	//explicit typecasting
	
	int explicit_typecast_int=(char)character;
	System.out.println("int to char : explicit");
	System.out.println(explicit_typecast_int);
	}
	
}

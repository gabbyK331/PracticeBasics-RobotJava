
public class practice {
	public static void main (String args[]) {
		newThang();
		System.out.println("Merp");
		//learning variables
			//int variables can only be whole numbers
				int merrr = 2;
				int meep = 17;
				int blerp = merrr*meep;
				int a = blerp/3;
				int derp = meep+5;
				
			//int arrays can have multiple values
				int [] intArray = {12,23,34,45,56};
				
				//printing int variables and intArrays
					System.out.println(merrr);
					System.out.println(meep);
					System.out.println(meep/merrr);
					System.out.println(blerp);
					System.out.println(intArray[2]);
					System.out.println(intArray[4]);
					System.out.println(intArray[1]);

			//booleans are true/false statements
				boolean merp = true;
				
				//learning if/else statements with booleans
					//"==" is like asking if equal to
					if(merp == true) {
						System.out.println("Yerp");
	
					}
					else if(merp == false) {
						System.out.println("nerp");
					}
					else {
						System.out.println("AAAAAAAHHHH!!");
					}
				
			//Strings are complex variables, which is why it is capitalized
				String string1 = "nerrr";
				
			//doubles are any numbers 
				double double1 = 4.77;
			
				//if/else statement with double
					if(double1 < 3){
						System.out.println(double1);
					}
					else if(double1 > 4){
						System.out.println(double1);
					}
					
				//while statements are loops when conditions are met
					while(double1 == 200){
						double1 = 200;
					}
					
			//floats are pretty much the opposite of integers, they are irrational values
				float float1 = (float) 6.77777777777;
				
			
	}
	
	static void newThang() {
		System.out.println("this is a new thang..");
	}
}

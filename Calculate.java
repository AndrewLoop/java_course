import java.util.Scanner;

public class Calculate{
public static double result;
	public static void main(String [] args){
		boolean calculationComplite = false;
		if(args.length != 0){
			double first = Double.valueOf(args[0]);
			double second = Double.valueOf(args[1]);
			String operation;
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose operation: add, sub, mult, div, or type [x] for exit ");
			operation = sc.nextLine();
				while(calculationComplite == false){
					if(operation.equals("add")){
						calculationComplite = true;
						add(first, second);
					} else if(operation.equals("sub")){
						calculationComplite = true;
						sub(first, second);
					} else if(operation.equals("mult")){
						calculationComplite = true;
						mult(first, second);
					} else if(operation.equals("div")){
						calculationComplite = true;
						div(first, second);
					} else if(operation.equals("x")){
						calculationComplite = true;
						result = 0.0;
					} else{
						System.out.println("You must choose operation.");
						operation = sc.nextLine();	
					}	
				}
				System.out.printf("Result " + "%.2f", result);	
			}else{
				System.out.printf("Not found any numbers");
			}
	}
	
		public static double add(double first,double second){
			System.out.println("Operation of addition");
			result = first + second;
			return result;
		}

		public static double sub(double first,double second){
			System.out.println("Operation of subtraction");
			result = first - second;
			return result;
		}

		public static double mult(double first,double second){
			System.out.println("Operation of multiplication");
			result = first * second;
			return result;
		}

		public static double div(double first,double second){
			System.out.println("Operation of division");
			result = first / second;
			return result;
		}	
}
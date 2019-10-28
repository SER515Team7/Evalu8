import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
	
	// String Variable to hold user input for Scanner
	public static String ops;
	public static String ops2;
	
	// Integer Double Variable to hold user input for Scanner
	public static int ops1;
	public static double num1, num2, answer = 0, radnum, degnum;
	
	// TODO Auto-generated method stub
	public static void toRadians(double a) {}
	
	// TODO Auto-generated method stub 
	public static void toDegrees(double b) {}
	
	// Main Method
	public static void main(String[] args) {
		menu ();
	}

	// OPTION MENU
	public static void menu () {		

// INPUT MENU
		Scanner in = new Scanner(System.in);
		System.out.println("Menu 1 Trigonometry");
		System.out.println("Menu 2 Standard");
		System.out.println("Menu 3 Standard2");
		System.out.println("Menu 4 Programmer");
		System.out.println("Choose Menu : ");Calculator.ops1 = in.nextInt();
	
		if (Calculator.ops1==1) {
			menuTrigono ();}
		else if (Calculator.ops1==2) {
			menuStandard ();}
		else if (Calculator.ops1==3) {
			menuStandard2();}
		else if (Calculator.ops1==4) {
			typeConversion();}
		else
			System.out.println("Invalid Command");
	}
	
	// CONVERSION Number
	public static void Konversi () {
		Calculator.degnum = Math.toRadians(Calculator.num1);
		Calculator.radnum = Math.toDegrees(Calculator.degnum);	
	}

	// CONVERSsION TYPE
	public static void typeConversion () {
	try {
			ops6();
		Scanner input = new Scanner( System.in );
		// Clear
		if (Calculator.ops1==1) {
			System.out.print("Enter a Binary number : ");
			String bin = input.nextLine();
			System.out.println("Decimal Output     : "+Integer.parseInt(bin,2));
			System.out.println("HexaDecimal Output : "+Integer.toString(Integer.parseInt(bin,2),16));
			System.out.println("Octal Output       : "+Integer.toString(Integer.parseInt(bin,2),8));
		}
		// Clear
		else if (Calculator.ops1==2) {
			System.out.print("Enter a Decimal number ");
			int dec =input.nextInt();
			System.out.println("Binary Output      : "+Integer.toBinaryString(dec));
			System.out.println("HexaDecimal Output : "+Integer.toHexString(dec));
			System.out.println("Octal Output       : "+Integer.toOctalString(dec));
		}
		// Clear
		else if (Calculator.ops1==3) {
			System.out.print("Enter a HexaDecimal number : ");
			String hex = input.nextLine();
			System.out.println("Decimal Output     : "+Integer.parseInt(hex,16));
			System.out.println("Binary Output      : "+Integer.toString(Integer.parseInt(hex,16),2));
			System.out.println("Octal Output       : "+Integer.toString(Integer.parseInt(hex,16),8));
		}
		//50%
		else if (Calculator.ops1==4) {
			System.out.print("Enter a Octal number : ");
			int oct = input.nextInt();
			int dec =Integer.parseInt(Integer.toString(oct,10),8);
			System.out.println("Decimal Output     : "+dec);
			System.out.println("Binary Output      : "+Integer.toBinaryString(dec));
			System.out.println("HexaDecimal Output : "+Integer.toHexString(dec));
		}
		else{
			System.out.println("\nInvalid Command Return Main Menu\n");
			menu(); 
		}
	}
	catch (NumberFormatException e) {
		System.out.println("\nPROGRAM FORMAT EXCEPTION ERROR");
		System.out.println("\nERROR DETAILS : \t" + e);
		playAgain();
	}
	catch (Exception e) {
		System.out.println("\nPROGRAM EXCEPTION ERROR");
		System.out.println("\nERROR DETAILS : \t" + e);
		playAgain();
	}
	
	playAgain();
}
	
	// print KONVERSI input angka
	public static void printKonversi () {
		DecimalFormat digitPresisi= new DecimalFormat("0.000");
		Konversi ();
		System.out.println("\nConvertion Unit Number\n");
		System.out.println("Degrees Number : "+digitPresisi.format(Calculator.radnum));
		System.out.println("Radians Number : "+digitPresisi.format(Calculator.degnum)+"\n");
	}

// TRIGONO CALC
	public static void menuTrigono () {
		
	try{
		ops4();
		Konversi ();
		
	// TRIGONO CALC
		if (Calculator.ops.toLowerCase().equals("sin")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.sin(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.sin(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("cos")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.cos(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.cos(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("sec")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.cos(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.cos(Calculator.degnum));
			}
		}
		else if (Calculator.ops.toLowerCase().equals("cosec")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.sin(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.sin(Calculator.degnum));
			}
		}
		else if (Calculator.ops.toLowerCase().equals("tan")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.tan(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.tan(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("cot")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.tan(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.tan(Calculator.degnum));
			}
		}
		
	//Arc Trigonometri
	else if (Calculator.ops.toLowerCase().equals("asin")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.asin(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.toDegrees(Math.asin(Calculator.num1));
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}
	else if (Calculator.ops.toLowerCase().equals("acos")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.acos(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.toDegrees(Math.acos(Calculator.num1));
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}
	else if (Calculator.ops.toLowerCase().equals("atan")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.atan(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.toDegrees(Math.atan(Calculator.num1));
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}
	else if (Calculator.ops.toLowerCase().equals("acosec")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer =(Math.asin(Calculator.num1))/1 ;
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = (Math.toDegrees(Math.asin(Calculator.num1)))/1;
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}
	else if (Calculator.ops.toLowerCase().equals("asec")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer =(Math.acos(Calculator.num1))/1 ;
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = (Math.toDegrees(Math.acos(Calculator.num1)))/1;
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}
	else if (Calculator.ops.toLowerCase().equals("acot")) {

		 if	((Calculator.num1 >=-1)&&(Calculator.num1 <= 1)) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer =(Math.atan(Calculator.num1))/1 ;
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = (Math.toDegrees(Math.atan(Calculator.num1)))/1;
			}
		}
		else {
			System.out.println("\n Invalid Input Number ");
			System.out.println(" Please enter a valid number between -1 and 1 (-1<=x<=1) \n");
			menuTrigono ();
		}
		}

	//Hiperbolic Trigonometri
		else if (Calculator.ops.toLowerCase().equals("cosh")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.cosh(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.cosh(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("sinh")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.sinh(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.sinh(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("cosech")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.sinh(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.sinh(Calculator.degnum));
			}
		}
		else if (Calculator.ops.toLowerCase().equals("sech")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.cosh(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.cosh(Calculator.degnum));
			}
		}
		else if (Calculator.ops.toLowerCase().equals("tanh")) {
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = Math.tanh(Calculator.radnum);
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = Math.tanh(Calculator.degnum);
			}
		}
		else if (Calculator.ops.toLowerCase().equals("coth")) {
			
		ops2();
			if	(Calculator.ops2.toLowerCase().equals("rad")) { // radian
				Calculator.answer = 1/(Math.tanh(Calculator.radnum));
			}
			else if (Calculator.ops2.toLowerCase().equals("deg")) { // degrees
				Calculator.answer = 1/(Math.tanh(Calculator.degnum));
			}
		}

			else{
				System.out.println("\nInvalid Command Return Main Menu\n");
				menu(); 
		}
		printKonversi();
		result();
		}

		catch (NumberFormatException e) {
			System.out.println("\nPROGRAM FORMAT EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
			playAgain();
		}

		catch (Exception e) {
			System.out.println("\nPROGRAM EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
			playAgain();
		}
	}

// STANDARD CALC	
	public static void menuStandard() {
		
		try {
		ops3();
			if (Calculator.ops.toLowerCase().equals("*"))
				Calculator.answer = Calculator.num1 * Calculator.num2;
			else if (Calculator.ops.toLowerCase().equals("/"))
				Calculator.answer = Calculator.num1 / Calculator.num2;
			else if (Calculator.ops.toLowerCase().equals("min"))
				Calculator.answer = Math.min(Calculator.num1,Calculator.num2);
			else if (Calculator.ops.toLowerCase().equals("max"))
				Calculator.answer = Math.max(Calculator.num1,Calculator.num2);
			else if (Calculator.ops.toLowerCase().equals("%"))
				Calculator.answer = Calculator.num1 % Calculator.num2;
			else if (Calculator.ops.toLowerCase().equals("+"))
				Calculator.answer = Calculator.num1 + Calculator.num2;
			else if (Calculator.ops.toLowerCase().equals("-"))
				Calculator.answer = Calculator.num1 - Calculator.num2;
			else if (Calculator.ops.toLowerCase().equals("^"))
				Calculator.answer = Math.pow(Calculator.num1, Calculator.num2);
			else{
				System.out.println("\nInvalid Command Return Main Menu\n");
				menu(); 
		}
		result();
		}

		catch (NumberFormatException e) {
			System.out.println("\nPROGRAM FORMAT EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
			playAgain();
		}

		catch (Exception e) {
			System.out.println("\nPROGRAM EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
			playAgain();
		}
	}
	
	// Result Method
	public static void result() {
		DecimalFormat digitPresisi= new DecimalFormat("0.000");
		System.out.println("The result is : " + digitPresisi.format(Calculator.answer)+"\n");
		playAgain();
	}
	
	// Play Again Method
	public static void playAgain() {
// 2nd INPUT part
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlay again ? y/n");
		Calculator.ops = in.next();
		if(Calculator.ops.toLowerCase().equals("y")) {
			menu();
			}
		else if(Calculator.ops.toLowerCase().equals("n")) {
			System.exit(0);
			}
		else {
			System.out.println("Invalid Command");
			playAgain();
			}
	}

	// Trigonometri Option Mode Method
	public static void ops2() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the mode : DEG for degrees and RAD for Radians");
			Calculator.ops2 = in.next();
	}
	
	// Input 2 Number and 1 Operand
	public static void ops3() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		Calculator.num1 = in.nextDouble();
		System.out.println("Enter another number:");
		Calculator.num2 = in.nextDouble();		
		System.out.println("Enter the operand:");
		Calculator.ops = in.next();
	}
	
	// Input 1 Number and 1 Operand
	public static void ops4() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		Calculator.num1 = in.nextDouble();
		System.out.println("Enter the operand:");
		Calculator.ops = in.next();	
	}
	
	public static void ops5() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		Calculator.num1 = in.nextDouble();
		System.out.println("Enter the operand:");
		Calculator.ops = in.next();
}

	//programmer option
	public static void ops6() {
		Scanner in = new Scanner(System.in);
		System.out.println("\nWelcome to Programmer Convertion Calculator");
		System.out.println("\nConversion Menu ");
		System.out.println("1. Conversion from Binary");
		System.out.println("2. Conversion from Decimal");
		System.out.println("3. Conversion from HexaDecimal");
		System.out.println("4. Conversion from Octal");
		System.out.println("Enter an Option of Convertion Menu : ");
		Calculator.ops1 = in.nextInt();
}	

// STANDARD 2 CALC
	public static void menuStandard2() {
	
	try {
			ops5();
		if (Calculator.ops.toLowerCase().equals("sqrt")) {
			Calculator.answer = Math.sqrt(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("cbrt")) {
			Calculator.answer = Math.cbrt(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("log")) {
			Calculator.answer = Math.log(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("log10")) {
			Calculator.answer = Math.log10(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("absolute")) {
			Calculator.answer = Math.abs(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("ceil")) {
			Calculator.answer = Math.ceil(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("floor")) {
			Calculator.answer = Math.floor(Calculator.num1);
		}
		else if (Calculator.ops.toLowerCase().equals("decrement")) {
			long l = (long)Calculator.num1;
			Calculator.answer = Math.decrementExact(l);
		} 
		else if (Calculator.ops.toLowerCase().equals("increment")) {
			long l = (long)Calculator.num1;
			Calculator.answer = Math.incrementExact(l);
		}
		else{
			System.out.println("\nInvalid Command Return Main Menu\n");
			menu(); 
		}
		result();
		}
		catch (NumberFormatException e) {
			System.out.println("\nPROGRAM FORMAT EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
		playAgain();
		}
		catch (Exception e) {
			System.out.println("\nPROGRAM EXCEPTION ERROR");
			System.out.println("\nERROR DETAILS : \t" + e);
		playAgain();
	}
}

}

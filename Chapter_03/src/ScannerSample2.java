import java.util.Scanner;

public class ScannerSample2 {

	public static void main(String[] args) {
		// Link: http://web.eecs.utk.edu/~bvanderz/teaching/cs365Sp12/examples/datacheck.html
		
//		This example has three main purposes:
//		1. it shows how you can read input from stdin using Java's Scanner class,
//		2. it shows you how can use the Scanner class to type check the user's input
//		3. it shows you Java's Console class.
		
		/* The Scanner Class */
		
//		The Scanner class must be imported from java.util. It provides a wrapper class that encapsulates an input stream,
//		such as stdin, and it provides a number of convenience methods for reading lines and then breaking a line into tokens.
		
		/* The Constructor */
		
//		The constructor for the Scanner class takes a Java InputStream, File, or String as a parameter and creates a Scanner object.
//		Basically, the Scanner class works with anything that support an iterator, since what you are essentially doing is iterating
//		through a collection of tokens.
		
//		In Java, the variable System.in is declared as an InputStream and it points to stdin. System.in is a byte stream so you can't
//		read from it directly if you want to read character strings, which is what you normally want to do. Hence you must wrap a Scanner object
//		around System.in to hanlde string oriented IO. The following statement accomplished this task:
		
//		Scanner console = new Scanner(System.in);
		
//		Oftentimes you will want read a line of user input and then break it into type fields. The Scanner class allows you to 
//		easily break the line into tokens, by creating a Scanner class that tokenizes the line. For example, if you have a line of user input
//		in the String variable nextLine, then you create a Scanner that will tokenize the line using the following statement:
		
//		Scanner lineTokenizer = new Scanner(nextLine);
//		------------------------------------------------------------------------------------------------------------------------------------------------
		
		/* Reading a Line of Input */
		
//		_ String nextLine(): Returns the next line of text, or, if you are in the middle of a line, returns the remainder of the line.
		
//		_boolean hasNextLine(): Returns true if there is another line of input or if there are tokens remaining on the current line.
//			It returns false if you have reached the end of the input line. It may block waiting for either the EOF character or 
//			another line of input. It will return true if the last line of input is terminated with a new line character. In this case,
//			when you call nextLine(), you will get an empty string. If you are not sure whether a file ends with a newline character, 
//			then you must query hasNextLine(), and if it returns true, then check to see if nextLine() has returned an empty string.
		

//		------------------------------------------------------------------------------------------------------------------------------------------------
		
		/* Reading and Type Checking Tokens */
		
//		A Scanner object will divide a line of input into tokens (fields) using white space to delimit the tokens. For example, givent the line:
//		brad 10 true
//		a Scanner will create the tokens "brad", "10", and "true". You can retrieve these tokens and convert them to appropriate types using
//		the following set of methods:
		
//		_ String next(): Returns the next token as a string.
//		_ int nextInt(): Returns the next token as an integer.
//		_ boolean nextBoolean(): Returns the next token as a boolean.
//		_ float nextFloat(), double nextDouble(): Returns the next token in the appropriate floating point format.
		
//		If the input has been exhausted or if the token cannot be converted to the desired type, then the above methods will throw exceptions.
//		To avoiding having exceptions thrown, you can check whether or not a token exists and whether or not it conform to the desired type
//		using the following set of methods:
		
//		_ boolean hasNext(): Returns true if the input has another token.
//		_ boolean hasNextInt(): Returns true if the input has another token and that token can be interpreted as an integer.
//		_ boolean hasNextBoolean(): Returns true if the input has another token and that token can be interpreted as an boolean.
//		_ boolean hasNextFloat(): Returns true if the input has another token and that token can be interpreted as a floating point number.
//		_ boolean hasNextDouble(): Returns true if the input has another token and that token can be interpreted as a double word floating point number.
		
//		------------------------------------------------------------------------------------------------------------------------------------------------
		
		/* Discarding a Scanner */
		
//		When you have finished using a Scanner, such as when you have exhausted a line of input or reached the end of a file, you should close
//		the Scanner using the close() method. If you do not close the Scanner then Java will not garbage collect the Scanner object and you will
//		have a memory leak in your program:
		
//		_ void close(): closes the Scanner and allows Java to reclaim the Scanner's memory. You cannot re-use a Scanner so you should get rid of it
//		as soon as you exhaust its input.
		
//		Because it is easy to forget to close a Scanner, a better option is to use a so-called "try with resources" statement.
//		Example:
		
//		try(Scanner lineTokenizer = new Scanner(inputLine)) {
//			int age = lineTokenizer.nextInt();
//			System.out.println("age = %d%n");
//		}
		
//		The try with resources statement will automatically close the resource when the try block exits.
		
//		int age = 100;
//		System.out.printf("age = %d%n", age);
//		System.out.println("hello");
		
//		------------------------------------------------------------------------------------------------------------------------------------------------
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter: "); // Brad 10 true
//		String st = scanner.next();
//		int num = scanner.nextInt();
//		boolean b = scanner.nextBoolean();
//		
//		System.out.println(st);
//		System.out.println(st.getClass().getSimpleName());
//		System.out.println(num);
//		System.out.println(b);
		

	}

}















































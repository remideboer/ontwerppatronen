package decorator;

import java.io.*;
import java.util.Scanner;

public class IOLaucher {

	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(
				new BufferedInputStream(
						new FileInputStream(
								new File("test"))));

	}

}

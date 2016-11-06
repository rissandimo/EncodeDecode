import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class App {


public static void main(String[] args) throws IOException
	{
			Scanner input = new Scanner(System.in);
			char[] alphabetChar = {'a', 'b', 'c', 'd', 'e', 'f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', 'A', 'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			char[] decryptionChar = {'k','n','g','c','a','d','s','x','b','v','f','h','j','t','i','u','m','y','l','z','q','r','o','p','w','e','K','N','G','C','A','D','S','X','B','V','F','H','J','T','I','U','M','Y','L','Z','Q','R','O','P','W','E'}; 
			String password = "";
			char[] alphabetEncrypted = new char[alphabetChar.length]; //make array for alphabet in char type
			
			
			
			
			
			String filepath = "C:/Users/omid/Desktop/";
			System.out.println("Please enter the name of the file you want to decrypt");
			String fileName = input.nextLine();
			filepath = filepath + fileName + ".txt";
			
			System.out.println("file name: " + filepath);
			
			File file = new File(filepath);
			Scanner document = new Scanner(file);
			
			while(document.hasNextLine())
			{
				password = document.nextLine();
			}
			
			System.out.println("password:" + password);
			char[] passwordChar = new char [password.length()];
			char[] passwordEncrypted = new char[password.length()];
			for(int i=0; i<password.length(); i++)//convert the password string to and array of char to store each letter separately
			{
				
				passwordChar[i] = (char) password.charAt(i);
				//System.out.print(passwordChar[i]);
			}
		

		
		for(int i=0; i<passwordChar.length; i++)
		{
			
			for(int j=0; j<alphabetChar.length; j++)
			{
				if(password.charAt(i) == alphabetChar[j])
				{
					
					passwordEncrypted[i] = decryptionChar[j];
					j=50;
				}
			
			}
			
		}
		
				System.out.print("password encrypted: ");
				System.out.println(passwordEncrypted);
				
				System.out.println("Please enter the name you would like to save the file as");
				String newName = input.nextLine();
				FileWriter output = new FileWriter(newName);
				output.write(passwordEncrypted);
		
		}
	}



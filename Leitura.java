//João Roberto Savini Merante RA 1886525

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura
{
	public String entDados(String rotulo)
	{
		System.out.println(rotulo);
		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(teclado);
		String string = "";
		try
		{
			string = buffer.readLine();
		}
		catch(IOException ioe)
		{
			System.out.println("\n 404 not found");
		}
		return string;
	}
}
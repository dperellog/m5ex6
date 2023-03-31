import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IniciBasicRefact {
	public static void main(String[] args) throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader teclat = new BufferedReader(entrada);
		String respostaCorrecte = "8";
		String inputUsuari = "";
		int resultat = 0;
		
		System.out.println("Comen�a el test!!!\n Per superar els test has de contestar la pregunta correctament.\n");
		System.out.println("2+6=?");
		inputUsuari = teclat.readLine();
		
		if (inputUsuari.equals(respostaCorrecte)) {
			resultat = 10;
			System.out.println("\nPunts totals: " + resultat);
			System.out.println("Ho sento no has superat el test!!!");
		} else {
			resultat = 0;
			System.out.println("\nPunts totals: " + resultat);
			System.out.println("Felcitats, resposta correcta!!!");
		}

	}

}
package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	private static String FileName = "TXT.txt";
	private static DAOHelloWorld instance = null;
	private final String helloWorldMessage = null;

	private DAOHelloWorld(){

	}

	public static DAOHelloWorld getInstance() {
		return instance;
	}

	private static void setInstance(final DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}

	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}

	public void setHelloWorldMessage(final String helloWorldMessage){
		return;
	}

	private void readFile(final String FileName) throws IOException{
		BufferedReader lecteurAvecBuffer = null;
		String ligne;

		try
		{
			lecteurAvecBuffer = new BufferedReader(new FileReader(FileName));
		}
		catch(final FileNotFoundException exc)
		{
			System.out.println("Erreur d'ouverture");
		}

		while ((ligne = lecteurAvecBuffer.readLine())!=null) {
			System.out.println(ligne);
		}

		lecteurAvecBuffer.close();
	}

}

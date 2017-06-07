package org.helloworldmvc.main;

import java.io.IOException;

import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;

import fr.exia.helloworldmvc.Controller;

public class Main {

	public static void main(final String[] args) throws IOException {
		//final DAOHelloWorld hello = DAOHelloWorld.getInstance();
		final View view = new View();
		final Model model = new Model();
		final Controller controller = new Controller(view, model);
		controller.run();
		//hello.readFile();

	}

}

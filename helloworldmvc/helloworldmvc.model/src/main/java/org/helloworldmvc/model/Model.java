package org.helloworldmvc.model;

import java.io.IOException;

import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {

	public String getHelloWorld() {
		try{
			return DAOHelloWorld.getInstance().getHelloWorldMessage();
		}
		catch (final IOException e){
			e.printStackTrace();
		}

		return null;
	}


}

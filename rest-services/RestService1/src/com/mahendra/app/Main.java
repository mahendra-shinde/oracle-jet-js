package com.mahendra.app;

import java.io.IOException;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.net.httpserver.HttpServer;

public class Main {

	public static void main(String[] args) {
		PackagesResourceConfig rc = 
				new PackagesResourceConfig("com.mahendra.rest");
		try {
			HttpServer server = HttpServerFactory.create
						("http://localhost:8000/api", rc);
			server.start();
		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

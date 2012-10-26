package org.boxhacks;

import org.eclipse.jetty.server.Server;

/**
 * Launcher for embedded jetty
 * @author bubba
 *
 */
public class JettyLauncher {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new SampleHandler());
		server.start();
		server.join();
	}
}

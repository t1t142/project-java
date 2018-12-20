package socketDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class Accepter_clients implements Runnable {

	private ServerSocket socketserver=null;

	private Socket socket=null;

	private int nbrclient = 1;

	public Accepter_clients(ServerSocket s) {

		socketserver = s;

	}

	public void run() {

		try {

			while (true) {

				socket = socketserver.accept(); // Un client se connecte on
												// l'accepte

				System.out.println("Le client numéro " + nbrclient
						+ " est connecté !");

				nbrclient++;

				socket.close();

			}

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}

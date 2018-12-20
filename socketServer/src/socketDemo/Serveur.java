package socketDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static ServerSocket ss = null;
	public static Thread t;

	public static void main(String[] zero) {

		/**
		 * ServerSocket socketserver;
		 * 
		 * Socket socketduserveur; BufferedReader in;
		 * 
		 * PrintWriter out; try {
		 * 
		 * socketserver = new ServerSocket(2009);
		 * System.out.println("Le serveur est � l'�coute du port " +
		 * socketserver.getLocalPort()); socketduserveur =
		 * socketserver.accept();
		 * 
		 * 
		 * System.out.println("Un z�ro s'est connect�");
		 * 
		 * out = new PrintWriter(socketduserveur.getOutputStream());
		 * 
		 * out.println("Vous �tes connect� z�ro !");
		 * 
		 * out.flush(); socketduserveur.close(); socketserver.close();
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 */
		/**
		 * ServerSocket socket;
		 * 
		 * try {
		 * 
		 * socket = new ServerSocket(2009);
		 * 
		 * Thread t = new Thread(new Accepter_clients(socket));
		 * 
		 * t.start();
		 * 
		 * System.out.println("Mes employeurs sont pr�ts !");
		 * 
		 * } catch (IOException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 */
		try {

			ss = new ServerSocket(2009);

			System.out.println("Le serveur est � l'�coute du port "
					+ ss.getLocalPort());

			t = new Thread(new Accepter_connexion(ss));

			t.start();

		} catch (IOException e) {

			System.err.println("Le port " + ss.getLocalPort()
					+ " est d�j� utilis� !");

		}
	}
}
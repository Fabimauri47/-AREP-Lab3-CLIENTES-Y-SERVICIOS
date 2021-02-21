package edu.escuelaing.arep;

import sun.net.ext.ExtendedSocketOptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
class Main {
    private static ExtendedSocketOptions Interprete;

    public static void main(String[] args) throws IOException {
        ServicioSocket servicioScoket = null;
        try {
            servicioScoket = new ServicioSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }

        try {
            System.out.println("Listo para recibir ...");
            while (true) {
                Socket clientSocket;
                clientSocket = servicioScoket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                String recurso;
                while ((inputLine = in.readLine()) != null) {

                    if (inputLine.contains("GET")) {
                        recurso = inputLine.split(" ")[1];
                        recurso = recurso.substring(1);
                        System.out.println(recurso);
                        Interprete.getInstance().recursoToString(recurso, clientSocket);
                    }
                    if(!in.ready()){
                        break;
                    }
                }
                in.close();
                clientSocket.close();
            }
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
    }
}

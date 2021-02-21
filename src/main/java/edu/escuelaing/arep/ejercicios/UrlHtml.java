package edu.escuelaing.arep.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*public class UrlHtml {

    import java.io.*;
    import java.net.*;

    public class EchoClient {
5 public static void main(String[] args) throws IOException {
            Socket echoSocket = null;
            PrintWriter out = null;
            BufferedReader in = null;
            try {
                echoSocket = new Socket("127.0.0.1", 35000);
                out = new PrintWriter(echoSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(
                        echoSocket.getInputStream()));
            } catch (UnknownHostException e) {
                System.err.println("Don’t know about host!.");
                System.exit(1); }
            catch (IOException e) {
                System.err.println("Couldn’t get I/O for "
                        21 + "the connection to: localhost.");
                System.exit(1);
                23 }
            25 BufferedReader stdIn = new BufferedReader(
                    new InputStreamReader(System.in));
            27 String userInput;
            29 while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                31 System.out.println("echo: " + in.readLine());
            }
            33
            out.close();
            35 in.close();
            stdIn.close();
            37 echoSocket.close();
        }
39 }
*/

package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Reader {


    private static class helper {

        private static final Reader INSTANCE = new Reader();
    }

    public static Reader getInstance() {
        return helper.INSTANCE;
    }


    public void fieldCadena(String url, Socket clientSocket) throws IOException {
        Reader r = new Reader();
        String type = getType(url);

        if ("css".equals(type) || "js".equals(type) || "html".equals(type)) {
            PrintWriter out;
            String pagina = "HTTP/1.1 200 OK\r\n";
            pagina += "Content-Type: text/" + type + "\n";
            pagina += "\r\n";
            BufferedReader br = r.read(url);
            if (br == null) {
                pagina = "HTTP/1.1 200 OK\r\n";
                pagina += "Content-Type: text/" + "html" + "\n";
                pagina += "\r\n";
                pagina += "<html><h1> No encontrado </h1></html>";
            } else {
                pagina = pagina + r.toHtml(br);
            }
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            out.println(pagina);
            out.close();

        } else if ("jpg".equals(type) || "png".equals(type) || "jpeg".equals(type)) {

            byte[] bytes = r.readImagen(url);
            DataOutputStream binaryOut;
            binaryOut = new DataOutputStream(clientSocket.getOutputStream());
            binaryOut.writeBytes("HTTP/1.1 200 OK \r\n");
            binaryOut.writeBytes("Content-Type: image/" + type + "\r\n");
            binaryOut.writeBytes("Content-Length: " + bytes.length);
            binaryOut.writeBytes("\r\n\r\n");
            binaryOut.write(bytes);
            binaryOut.close();

        } else {
            PrintWriter out;
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            String pagina = "HTTP/1.1 200 OK\r\n";
            pagina += "Content-Type: text/" + "html" + "\n";
            pagina += "\r\n";
            pagina += "<html><h1> No encontrado </h1></html>";

            out.println(pagina);
            out.close();
        }

    }

    private String toHtml(BufferedReader br) {
    }

    private byte[] readImagen(String url) {
    }

    private BufferedReader read(String url) {
    }

    /**
     * Obtiene el tipo del archivo dada su url
     *
     * @param url dirección del archivo
     * @return String con el tipo del archivo
     */
    public String getType(String url) {
        String type = null;
        if (url.contains("css")) {
            type = "css";
        } else if (url.contains("js")) {
            type = "js";
        } else if (url.contains("html")) {
            type = "html";
        } else if (url.contains("jpg")) {
            type = "jpg";
        } else if (url.contains("png")) {
            type = "png";
        } else if (url.contains("jpeg")) {
            type = "jpeg";
        }
        return type;
    }

}

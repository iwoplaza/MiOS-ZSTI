package com.iwoplaza.testapp;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static String ROOT = "C:\\Users\\QNT\\Documents\\MiOS ZSTI\\";

    public static void main(String[] args) {
        int port = 80;
        try {
            HttpServer httpServer = HttpServer.create(new InetSocketAddress(port),0);
            httpServer.createContext("/", new RootHandler());
            httpServer.createContext("/static/", new StaticHandler());
            httpServer.setExecutor(null);
            httpServer.start();
            System.out.println("Starting server at port " + port);
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}

package com.example.back.client;

import com.example.back.service.CordinateurRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientRMI {
    public static void main(String [] args) throws MalformedURLException, NotBoundException, RemoteException {
        CordinateurRemote stub = (CordinateurRemote) Naming.lookup("rmi://localhost:1099/CO");
        System.out.println(stub.consulterEtudiants());
    }
}

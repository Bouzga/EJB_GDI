package com.example.back.server;

import com.example.back.service.CordinateurRemote;
import com.example.back.service.imp.CordinateurRemoteImp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    public static void main(String[] args)  {
        try {
            LocateRegistry.createRegistry(1099);
            CordinateurRemoteImp cor=new CordinateurRemoteImp();
            System.out.println(cor.toString());
            Naming.rebind("rmi://localhost:1099/CO",cor);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

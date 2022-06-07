package com.company.device;

import com.company.creatures.Human;
import jdk.jshell.spi.ExecutionControl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Rechargeable {
    static final String DEFAULT_APP_VERSION = "latest";
    static final String DEFAULT_SERVER_ADDRESS = "play.store.com";
    private static final Integer DEFAULT_PORT_NUMBER = 443;
    private static final String DEFAULT_PROTOCOL = "https";

    public Double screenSize;
    public String os;

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o! jest logo, jednak działa");
    }

    @Override
    public void recharge() {
        System.out.println("znajdź ładowarkę");
        System.out.println("znajdź wolne gniazdko");
        System.out.println("podłącz");
        System.out.println("czekaj");
        System.out.println("czekaj nadal");
        System.out.println("czekaj ");
        System.out.println("tak, ciągle czekaj");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }

    public void installAnApp(List<String> appNames) {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        try {
            URL url = new URL(DEFAULT_PROTOCOL, server, DEFAULT_PORT_NUMBER, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {
        System.out.println("sprawdź czy jest miejsce");
        System.out.println("sprawdź blokadę rodzicielską");
        System.out.println("sprawdź czy jest płatna");
        System.out.println("jeżeli tak obsłuż płatność");
        System.out.println("pobierz");
        System.out.println("rozpakuj (unzip)");
        System.out.println("zainstaluj");
        System.out.println("udało zainstalować " + url.getFile() + " z serwera " + url.getHost());

    }
}

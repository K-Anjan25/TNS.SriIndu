package com.tnsif.java;

public class NetworkConnection {
    public static void main(String[] args) {
        Network network = null;
        try {
            network = new Network();
            network.connect();
            // Simulate a network issue
            throw new Exception("Network connection lost");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (network != null) {
                network.disconnect();
                System.out.println("Network connection closed.");
            }
        }
    }
}

class Network {
    public void connect() {
        System.out.println("Connecting to network...");
    }

    public void disconnect() {
        System.out.println("Disconnecting from network...");
    }
}

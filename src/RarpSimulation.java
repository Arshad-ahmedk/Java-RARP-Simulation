public class RarpSimulation {
    public static void main(String[] args) {
        // Create a RARP server
        RarpServer server = new RarpServer();

        // Add some MAC-to-IP mappings to the RARP server
        server.addMapping("00:1A:2B:3C:4D:5E", "192.168.0.2");
        server.addMapping("00:1A:2B:3C:4D:5F", "192.168.0.3");

        // Create some devices with MAC addresses
        Device device1 = new Device("00:1A:2B:3C:4D:5E");
        Device device2 = new Device("00:1A:2B:3C:4D:5F");

        // Devices request IP addresses from the RARP server
        device1.requestIpAddress(server);
        device2.requestIpAddress(server);

        // Print the IP addresses assigned to the devices
        System.out.println(device1);
        System.out.println(device2);
    }
}

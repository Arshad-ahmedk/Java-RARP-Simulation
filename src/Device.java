public class Device {
    private String macAddress;
    private String ipAddress;

    public Device(String macAddress) {
        this.macAddress = macAddress;
        this.ipAddress = null;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void requestIpAddress(RarpServer server) {
        this.ipAddress = server.resolveIpAddress(macAddress);
    }

    @Override
    public String toString() {
        return "Device(MAC: " + macAddress + ", IP: " + ipAddress + ")";
    }
}

import java.util.HashMap;
import java.util.Map;

public class RarpServer {
    private Map<String, String> macToIpMap;

    public RarpServer() {
        macToIpMap = new HashMap<>();
    }

    public void addMapping(String macAddress, String ipAddress) {
        macToIpMap.put(macAddress, ipAddress);
    }

    public String resolveIpAddress(String macAddress) {
        return macToIpMap.getOrDefault(macAddress, "Unknown MAC Address");
    }

    @Override
    public String toString() {
        return "RARP Server Mappings: " + macToIpMap.toString();
    }
}

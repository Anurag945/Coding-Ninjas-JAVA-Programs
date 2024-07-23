
import java.net.UnknownHostException;

public class FindIPAddress {

  public static void main(String[] args) {
    try {
      // Get the local host information
      InetAddress localhost = InetAddress.getLocalHost();

      // Get the IP address as a string
      String ipAddress = localhost.getHostAddress();

      // Print the IP address
      System.out.println("Your machine IP address: " + ipAddress);
    } catch (UnknownHostException e) {
      System.out.println("Error: Unable to find the IP address.");
      e.printStackTrace();
    }
  }
}

package connectionOCI;
import java.sql.*;

public class ATPExample {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Set up the JDBC URL
            String url = "jdbc:oracle:thin:@(description=(retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.sa-vinhedo-1.oraclecloud.com))(connect_data=(service_name=gaa68fa422a6ee1_solarcleaning_low.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes))";
            		 ////(ssl_cert=/C:/Wallet_solarCleaning/ADBsaVinhedo1_root.pem)(ssl_key=/C:/Wallet_solarCleaning/ADBsaVinhedo1_client.pem)(ssl_server_cert=/C:/Wallet_solarCleaning/ADBsaVinhedo1_server.pem)";

            // Set up the database credentials
            String user = "ADMIN";
            String password = "Urbanavicius101010!";

            // Create a connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Perform database operations here

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

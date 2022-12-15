import java.sql.ResultSet;
import java.sql.SQLException;

public class DataTransferObject {
	
	public static BankDetails getBankDetails(String username, String password) {
		
		JDBCGateway gateway = new JDBCGateway("driver", "dbms", "dbase", username, password);
		
		try {
			ResultSet rs = gateway.execute("sql to get bank details for a username passed as input parameter");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		BankDetails bankDetails = new BankDetails();
		
		// copy data from "rs" object to "bankDetails" object.
		
		return bankDetails;
		
	}

}

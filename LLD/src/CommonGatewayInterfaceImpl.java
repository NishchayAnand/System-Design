
public class CommonGatewayInterfaceImpl {
	
	public static void main(String args[]) {
		
		// sample code to access the command-line parameters (CGI environment variables) passed using
		// the -D command-line parameter on the Java interpreter.
		String username = System.getProperty("cgi.db_username");
		
		String password = System.getProperty("db_password");
		
		// generating the response HTML page.		
		
		// 1. setting the header to tell the browser that the response is an HTML page.		
		System.out.println("Content-type: text/html\n\n");
		
		//2. fetching the requested details dynamically from a database and appending it to the 
		//   body of the response.
		System.out.println("<HTML><HEAD><TITLE>690 JAVA CGI EXAMPLE</TITLE></HEAD><BODY>");
		
		BankDetails details = DataTransferObject.getBankDetails(username, password);
		System.out.println("<H1 ALIGN=CENTER>BANK DETAILS</H1><br><br>");		
		System.out.println("Holder Name: "+details.getHolderName()+"<br>");
		System.out.println("Bank Name: "+details.getBankName()+"<br>");
		System.out.println("Account Number: "+details.getBankName()+"<br>");
		System.out.println("Credit Amount: "+details.getCredit()+"<br>");
		
		System.out.println("</BODY></HTML>");
		
	}

}

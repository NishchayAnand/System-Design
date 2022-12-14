import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebClient {
	
//	NOTE: All three of these method calls are potentially blocking:
//			1. The client process will block until the user types something at the console and 
//			   presses Enter. 
//			2. Then it will send it to the server with println(), but if the server?s buffer happens 
//			   to be full, this println() call will block until it can fit the message into the 
//             buffer.
//			3. Then the process will block until the server has sent its reply.
	
	public static void main(String args[]) {
		
		String hostname = "localhost";
		int port = 4589;
		Socket socket = null;
		
		try {
			socket = new Socket(hostname, port);
			
			// sender for request.
			OutputStream outToServer = socket.getOutputStream();
			PrintWriter writeToServer = new PrintWriter(new OutputStreamWriter(outToServer, 
					StandardCharsets.UTF_8));
			
			// reader for response.
			InputStream inFromServer = socket.getInputStream();
			BufferedReader readFromServer = new BufferedReader(new InputStreamReader(inFromServer, 
					StandardCharsets.UTF_8));
			
			// reader for request.
			BufferedReader readFromUser = new BufferedReader(new InputStreamReader(System.in, 
					StandardCharsets.UTF_8));

			while (true) {
				String message = readFromUser.readLine();
				writeToServer.println(message);
				writeToServer.flush(); // important! otherwise the line may just sit in a buffer, unsent
				String reply = readFromServer.readLine();
				if (reply == null) break; // server closed the connection
			}
			
			readFromServer.close();
			writeToServer.close();
				
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}		
		
	}

}

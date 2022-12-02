
public class WebServer {
	
	private int port;
	private int maxConnections;

	protected void setPort(int port) { 
		this.port = port; 
	}
	
	public int getPort() { 
		return port; 
	}
	
	protected void setMaxConnections(int max) {
		maxConnections = max;
	}
	
	public int getMaxConnections() { 
		return maxConnections; 
	}
	
	public WebServer(int port, int maxConnections) {
		setPort(port);
		setMaxConnections(maxConnections);
	}




//// Wait for a connections until maxConnections.
//// On each connection call handleConnection() passing
//// the socket. If maxConnections == 0 loop forever
// public void listen() {
// int i = 0;
// try {
// ServerSocket listener = new ServerSocket(port);
// Socket server ;
// while((i++ < maxConnections) || (maxConnections == 0)) {
// server = listener.accept(); // wait for connection
// handleConnection(server);
// }
// } catch (IOException ioe) {
// System.out.println("IOException : " + ioe);
// ioe.printStackTrace();
// }
// }
//
//
//// Open readers and writers to socket.
//// Display client's host name to console.
//// Read a line from the client and display it on the console.
//// Send "Generic network server" to the client.
//// Override this method.
//protected void handleConnection(Socket server)
// throws IOException {
// BufferedReader in = new BufferedReader(
// new InputStreamReader(
// server.getInputStream() ));
// PrintWriter out = new PrintWriter(
// server.getOutputStream(),true);
//
//
//
//
//System.out.println("Generic network server: got connection from "+
// server.getInetAddress().getHostName() + "\n" +
// "with first line '" + in.readLine() + "'");
// out.println("Generic network server");
// server.close();
// }
// public static void main(String args[]) {
// WebServer test = new WebServer(6502, 5);
// test.listen();
// }
 
}
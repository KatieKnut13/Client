import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConnectedServer 
{
	private Socket theSocket;
	
	public ConnectedServer(Socket theSocket) throws Exception
	{
		this.theSocket = theSocket;
		this.output = new PrintWriter(this.theSocket.getOutputStream());
		
	}
	
	public void sendMessage(String msg)
	{
		this.output.println(msg);
	}
	
	public String getMessage()
	{
		return this.input.nextLine();
	}
	
	public int readByte() throws Exception
	{
		return this.theSocket.getInputStream().read();
	}
}

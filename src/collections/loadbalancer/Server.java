package collections.loadbalancer;

public class Server {
	String name;
	
	public Server(String name) {
		this.name=name;
	}
	
	public void handleRequest(int requestId) {
		// Request Handling logics..
		System.out.println("Request Id :"+requestId);
		System.out.println("Handled by server: "+this.name+".");
	}
}

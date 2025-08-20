package collections.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class LoadBalancer {
	private List<Server> servers=new ArrayList<>();
	private int currentServer;
	
	public LoadBalancer(List<Server> servers) {
		this.servers=servers;
	}
	
	//Round Robin Approach
	public void distributeLoad(int requestId) {
		if (servers.isEmpty()) {
		    throw new IllegalStateException("No servers available.");
		}
		else {
			Server s=servers.get(currentServer);
			s.handleRequest(requestId);
			currentServer=(currentServer+1)%servers.size(); //Server index reset
		}
	}
}

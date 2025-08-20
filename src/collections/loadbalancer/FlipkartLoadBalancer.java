package collections.loadbalancer;

import java.util.ArrayList;
import java.util.List;

public class FlipkartLoadBalancer {

	public static void main(String[] args) {
		Server server1 = new Server("East");
		Server server2 = new Server("West");
		Server server3 = new Server("North");
		Server server4 = new Server("South");
		
		
		//Now add these servers to one list and Pass to the Load Balancer
		List<Server> servers=new ArrayList<Server>();
		servers.add(server1);
		servers.add(server2);
		servers.add(server3);
		servers.add(server4);
		
		//Now handle the requests : Let's say our server get's 9 user requests
		
		LoadBalancer lb=new LoadBalancer(servers);//Taking the server list
		for(int i=1;i<=9;i++) {
			int requestId=i;
			lb.distributeLoad(requestId);
		}
		
	}

}

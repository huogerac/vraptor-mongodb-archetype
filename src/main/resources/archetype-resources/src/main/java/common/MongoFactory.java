package ${packageName}.common;

import java.net.UnknownHostException;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoException;

@Component
@ApplicationScoped
public class MongoFactory implements ComponentFactory<Mongo> {
	
	private String server_name = "localhost";
	private int server_port = 27017;
			
	public Mongo getInstance() {
		
		Mongo mongo = null;
		try {
			
			mongo = new Mongo(server_name, server_port);
			
		} catch (UnknownHostException e) {
			throw new RuntimeException(e);			
		} catch (MongoException e) {
			throw new RuntimeException(e);
		}
		return mongo;
	}

}

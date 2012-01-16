package ${packageName}.common;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
@ApplicationScoped
public class MongoConfigurationFactory implements ComponentFactory<MongoConfiguration> {
	
	public MongoConfiguration getInstance() {
		
		MongoConfiguration mc = new MongoConfiguration();
		mc.setDbName("test-vraptorDB");
		
		return mc;
	}

}

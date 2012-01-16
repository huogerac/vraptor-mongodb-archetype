package ${packageName}.common;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

import com.google.code.morphia.Morphia;

@Component
@ApplicationScoped
public class MorphiaFactory implements ComponentFactory<Morphia> {
	
	public Morphia getInstance() {
		
		Morphia morphia = new Morphia();
		//morphia.map(model.class);
		
		return morphia;
	}

}

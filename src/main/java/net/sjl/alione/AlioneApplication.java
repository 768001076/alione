package net.sjl.alione;

import net.sjl.alione.hession.HessionProviderTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class AlioneApplication {

	/*@Autowired
	private HessionProviderTestService hessionProviderTestService;*/

	public static void main(String[] args) {
		SpringApplication.run(AlioneApplication.class, args);
	}

	/*@Bean(name = "/hessionProviderTestService")
	public HessianServiceExporter releaseHessionTestService(){
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(hessionProviderTestService);
		exporter.setServiceInterface(HessionProviderTestService.class);
		return exporter;
	}*/
}

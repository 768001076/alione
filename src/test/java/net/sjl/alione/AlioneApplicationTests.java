package net.sjl.alione;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ImportResource(locations = {"classpath:application.yml"})
public class AlioneApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(132);
	}

}

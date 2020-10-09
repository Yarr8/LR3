package SUT.IST012m.Tarasenko.LR3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Lr3Application {

	public static void main(String[] args) {
		SpringApplication.run(Lr3Application.class, args);

		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext_old.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/java/SUT/IST012m/Tarasenko/LR3/AppContext.xml");
		Bird bird = ctx.getBean(Bird.class);
		bird.sound();
		bird.isFlying();
		bird.isSwimming();
	}

}

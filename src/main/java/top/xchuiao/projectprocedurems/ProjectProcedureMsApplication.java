package top.xchuiao.projectprocedurems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"top.xchuiao.projectprocedurems"})
@MapperScan(basePackages = "top.xchuiao.projectprocedurems.dao")
@SpringBootApplication
public class ProjectProcedureMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectProcedureMsApplication.class, args);
	}

}

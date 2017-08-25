package cn.hnedu.zxjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.hnedu.zxjy.module.*.mapper*")
@SpringBootApplication
public class ZxjyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZxjyApplication.class, args);
	}

	// @Bean
	// public PaginationInterceptor paginationInterceptor() {
	// return new PaginationInterceptor();
	// }
}

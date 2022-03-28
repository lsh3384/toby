package springbook.user.toby;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// spring반영중
@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}

	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
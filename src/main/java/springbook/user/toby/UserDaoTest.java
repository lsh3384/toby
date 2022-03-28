package springbook.user.toby;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class UserDaoTest {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		SpringApplication.run(UserDaoTest.class, args);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);

		UserDao dao = context.getBean("userDao", UserDao.class);

		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPassword("married");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());

		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
	}

}
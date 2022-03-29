package toby.springbook.user.toby;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException;
}

package presentationLayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import datalayer.UserRepository;
import entity.User;

public class UserController {
	private UserRepository userRepository;

	public UserController() {
		// TODO Auto-generated constructor stub
		userRepository = new UserRepository();
	}

	public List<User> getListUser() throws SQLException, ClassNotFoundException, IOException {
		return userRepository.getListUsers();

	}
}

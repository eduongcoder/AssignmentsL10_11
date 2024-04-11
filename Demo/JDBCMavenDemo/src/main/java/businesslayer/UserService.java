package businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import datalayer.UserRepository;
import entity.User;

public class UserService {

	private UserRepository userRepository;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		userRepository= new UserRepository();
	}
	public List<User> getListUser() throws SQLException,ClassNotFoundException,IOException{
		return userRepository.getListUsers();
		
	}
	
}

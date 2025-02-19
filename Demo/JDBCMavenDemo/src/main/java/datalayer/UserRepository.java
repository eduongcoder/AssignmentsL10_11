package datalayer;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import utils.connect;

public class UserRepository {

	private connect conn;
	
	
	public UserRepository() {
		conn= new connect();
	}


	public List<User> getListUsers() throws IOException,SQLException,ClassNotFoundException{
		List<User> users= new ArrayList<>();
		
		Connection connection=conn.getConnection();
	
		String sql ="select id,username,email,password,firstName,lastName from `user`";
		Statement statement =connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String username = resultSet.getString("username");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String firstName = resultSet.getString("firstName");
			String lastName = resultSet.getString("lastName");


			// Khởi tạo đối tượng User với các giá trị đã trích xuất từ resultSet
			User user1 = new User(id, username, email, password, firstName, lastName);
			
			users.add(user1);
		}
		conn.disconnect();
		return users;
	}
}

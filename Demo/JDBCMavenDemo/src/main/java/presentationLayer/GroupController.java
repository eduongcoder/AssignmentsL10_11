package presentationLayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import businesslayer.GroupService;
import datalayer.GroupRepository;
import datalayer.UserRepository;
import entity.Group;
import entity.User;

public class GroupController {
	private GroupRepository groupRepository;

	public GroupController() {
		// TODO Auto-generated constructor stub
		groupRepository = new GroupRepository();
	}

	public List<Group> getListGroup() throws SQLException, ClassNotFoundException, IOException {
		return groupRepository.getListGroup();

	}
}

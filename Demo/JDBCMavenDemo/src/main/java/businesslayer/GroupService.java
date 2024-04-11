package businesslayer;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import datalayer.GroupRepository;
import entity.Group;

public class GroupService {
	private GroupRepository groupRepository;

	public GroupService() {
		groupRepository= new GroupRepository();
	}
	
	public List<Group> getListGroups() throws SQLException,IOException,ClassNotFoundException{
		return groupRepository.getListGroup();
	}
	
}

package day48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<String>membersName= new ArrayList<>();
    public Group(String name ){
    this.groupName= name;
    }
    public Group(List<String>addAllNames){
        this.membersName=addAllNames;
    }
    public void AddMember(String newMember){
        membersName.add(newMember);

    }
    public void removeMember(String name){
        membersName.remove(name);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", membersName=" + membersName +
                '}';
    }

    public List<String> getMembersName() {
        return membersName;
    }

    public void setMembersName(List<String> membersName) {
        this.membersName = membersName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}

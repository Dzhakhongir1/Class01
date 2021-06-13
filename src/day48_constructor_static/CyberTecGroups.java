package day48_constructor_static;

import java.util.Arrays;

public class CyberTecGroups {
    public static void main(String[] args) {
        Group group = new Group("group 7");
        group.AddMember("Jahongir");
        group.AddMember("Elif");
        group.AddMember("Dilshod");
        group.AddMember("Tomaz");
        group.AddMember("Safaru");
        group.AddMember("Seyfi");
        group.AddMember("Gayrat");
        group.AddMember("Usuf");
        System.out.println(group.getGroupName());
        group.getMembersName().forEach(each-> System.out.println(each));
        Group group2= new Group(Arrays.asList("Usuf","Gayrat","Seyfi","Safaru","Elif","Dilshod","me"));
        group2.setGroupName("007");
        System.out.println(group2.getGroupName());
        System.out.println(group2);
        if (group2.getGroupName().contains("Elif")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

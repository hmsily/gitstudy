package testProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.lh.entity.Person;

public class ArrayListRemoveTest {
public static void main(String[] args) {
	List<Person> list = new ArrayList<Person>(5);
	Person p1 = new Person(1, "����");
	Person p2 = new Person(1, "��һ");
	Person p3 = new Person(1, "�Ŷ�");
	Person p4 = new Person(1, "����");
	Person p5 = new Person(1, "����");
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
    Iterator<Person> iterator = list.iterator();
    while(iterator.hasNext()) {
    	Person p = iterator.next();
    	if(p.getName().equals("����")) {
    		iterator.remove();
    	}
    }
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getName());
	}
}
	
	
}

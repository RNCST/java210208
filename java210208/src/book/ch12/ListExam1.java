package book.ch12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExam1 {
	
	public void methodA(List<String> list) {
		System.out.println("method01 methodA(List<String>)");
		System.out.println(list);
	}
	public void methodB(List list) {
		System.out.println("method02 methodB(List)");
		System.out.println(list);
	}
	public void methodA(Collection<String> list) {
		System.out.println("method03 methodA(Collection<String>)");
		System.out.println(list);
	}
	public void methodA(ArrayList<String> list) {
		System.out.println("method04 methodA(ArrayList<String>");
		System.out.println(list);
	}
	public static void main(String[] args) {
		ListExam1 le = new ListExam1();
		ArrayList<String>  al = new ArrayList();
		Collection<String> al2 = new ArrayList();
		List<String>       al3 = new ArrayList();
		System.out.println(al.size());
		al.add("al");
		al2.add("al2");
		al3.add("al3");
		System.out.println(al.size());
		le.methodA(al);
		le.methodB(al);
		le.methodA(al2);
		le.methodA(al3);
	}
}

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Book> a1=new ArrayList<Book>();
//public Book(int bookId, String bookName, String authName, int prise) {
Book b1=new Book(101,"C","Dennis",200);
Book b2=new Book(102,"python","pp",250);
Book b3=new Book(103,"C#","Microsoft",300);
Book b4=new Book(104,"Angular","Google",1000);
Book b5=new Book(105,"React","Facebook",1500);

a1.add(b1);
a1.add(b2);
a1.add(b3);
a1.add(b4);
a1.add(b5);

a1.forEach(i->{System.out.println(i);});

	}

}

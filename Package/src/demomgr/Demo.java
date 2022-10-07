package demomgr;
import utility.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();      
		e.display();
		Manager m=new Manager();
		m.diplay();
		Manager m1=new Manager(101,"sandeep",5055.45,746,233);
		m1.diplay();


	}

}

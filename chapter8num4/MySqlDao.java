package chapter8num4;

public class MySqlDao implements DataAccessObject {
	public void select(){
		System.out.println("MySqlDao DB���� �˻�");
	}
	public void insert(){
		System.out.println("MySqlDao DB�� tkqdlq");
	}
	public void update(){
		System.out.println("MySqlDao DB�� ����");
	}
	public void delete(){
		System.out.println("MySqlDao DB���� ����");
	}
}

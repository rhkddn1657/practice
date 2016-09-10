package chapter8num4;

public class OracleDao implements DataAccessObject{
	
	public void select(){
		System.out.println("Oracle DB에서 검색");
	}
	public void insert(){
		System.out.println("Oracle DB에 tkqdlq");
	}
	public void update(){
		System.out.println("Oracle DB룰 수정");
	}
	public void delete(){
		System.out.println("Oracle DB에서 삭제");
	}
}

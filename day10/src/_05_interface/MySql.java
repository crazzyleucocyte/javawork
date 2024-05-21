package _05_interface;

public class MySql implements DataAccess {

	@Override
	public void select() {
System.out.println("Mysql의 정보를 검색합니다");
	}

	@Override
	public void insert() {
		System.out.println("Mysql의 정보를 입력합니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		System.out.println("Mysql의 정보를 수정합니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		System.out.println("Mysql의 정보를 삭제합니다.");
		// TODO Auto-generated method stub

	}

}

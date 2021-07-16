package PKG_Car;

public class Member implements Callback
{
	
	private String memName;
	private Gender memGender;
	//has a ����
	private Car car;
	private Carpet carpet;
	//has a ����
	
	public Member(String memName, Gender memGender) {
		this.memName = memName;
		this.memGender = memGender;
	}
	
	public void rideCar(Car car) {
		//29�� �ҳడ �̻� Ʈ���� �����
		this.car = car;
		System.out.println(this.memName + "��" + car.getCarName() + "�� �����");
	}
	
	public void driveCar() {
		this.car.carRun();
		//Ÿ�� ���� has a ����� ������ش�.
	}
	
	public void flyCar() {
		/*
		//Ȥ�� this.car�� flycarŸ���̸� carFly()�� ���������
		if(this.car instanceof FlyCar) {
			((FlyCar)car).carFly();
		}
		else if(this.car instanceof AirCar) {
			((AirCar)car).airCarFly();
		}
		else {
			System.out.println("�� ���ƿ�");
		}
		*///�������̽��� ������ �ʴ´ٸ�, if�ȿ� fly�� �ִ� �ֵ鸶�� ���������Ѵ�.
		//�������̽��� ����� ������ �Ʒ�ó�� �������� ��.
		
		//Ȥ�� this.car�� ���󰡰� �����Ѵٴ� ����� ���� �������̽��� �����ߴ�?
		if(this.car instanceof Fly) {
			((Fly)this.car).fly();
		}
		else if(this.car instanceof Fly) {
			((Fly)this.car).land();
		}
		else {
			System.out.println("�� ���ƿ�");
		}
	}
	
	public void hasObject(/*Object obj*/ Carpet carpet) {
		//this.carpet = (Carpet)obj;
		//obj�� ī���� �ƴϾ �޾����Ƿ� ������ �������� ����?
		this.carpet = carpet;
	}
	//�ڵ��� �̿��� ������ ��ǰ�� ���ؼ��� ��� Ư���Ѱ� ���ٰ� ���� ��,
	//Object�� �޾ƿ��� ��. �߻�ȭ�� ������ �ٵ� ���� �ڵ��� �ƴϴ�

	
	public void carpetFly() {
		this.carpet.carPetFly();
	} //�̷��� �ڵ��ϸ� �ڵ��� �� �� ó�� ��������
	
	public void returnMsg(String methoName) {
		System.out.println(methoName + "������ �Ϸ�Ǿ�����");
	}
	
	public void getMoney() {
		((FlyCar)this.car).getMoney();
	}
	
	
}

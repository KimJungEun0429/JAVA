package PKG_Sale;

public abstract class Product {
//abstract�� Product��� Ŭ������ ������ �߻�ȭ�� �������� ���� �߻�Ŭ������� �ǹ��̴�.
//�̷��� ������� �߻�Ŭ������ ����� �ν��Ͻ�ȭ �� �� ����.
//�츮�� product�� ����� ���� �ƴ϶� computer�� bookŬ������ ����� ���̱� ����.
//�߻�Ŭ������ �߻����� ���� �� �ִ�.
	private String bName;
	private	int bPrice;
	
	public Product(String bName, int bPrice) {
		this.bName = bName;
		this.bPrice = bPrice;
	}
	
	/*
	public abstract double setRealPrice(double offRate){
		double realPrice = (double)this.bPrice * (1- offRate);
		
		return realPrice;}*/
	//abstract��� �ϸ� ��� �߻��ٰ� �ȴ�.
	
	public String getName() {
	
		return this.bName;
	
	}
	
	//�߻� ��� - ������ ���� �޽��- ������ ����. ������ �߻�ȭ
	public abstract double setRealPrice(double offRate);
	
	//abstract��� �ϸ� ��� �߻��ٰ� �ȴ�. ��� �����ϴ����� ������
	//�̷� ������ �ϸ� �ʸ� product��� �������ְڴ�
	//����� �޴� Ŭ�������� �ݵ�� �ݵ�� ������(override)�ؾ߸� �Ѵ�.
	

	protected int getPrice() {
		return this.bPrice;
	}//computer���� bPrice�� ����ϰ� ������ private�� �Ǿ� ������ �������
	
}

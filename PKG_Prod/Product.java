package PKG_Prod;

//�߻�ȭ - �߻�Ŭ���� - main �޽�忡�� instanceȭ �� �� ����.
public abstract class Product {

	private String pNAME;
	private int pPrice;//����
	private double sPrice;//�ǸŰ���
	
	public Product(String pName) {
	}
	
	public Product(String pName, int pPrice) {
		this.pNAME = pName;
		this.pPrice = pPrice;
	}
	
	public int getProPrice() {
		return this.pPrice;
	}//protected�� �����ָ� �ȵǴ���? - �׷��� ���� ��ĥ �� �����ϱ�
	
	//���� �ǸŰ���
	public abstract double getPrice(double offRate);
	//�߻�޽��, �߻���(���ϰ�,�ŰԺ���,�̸��� �ִµ� ������ ����.)
	//�߻�Ŭ������ ��ӹ޴� Ŭ�������� '�ݵ��' �Ž�� �������ؾ��Ѵ�. 
	
	
}//end

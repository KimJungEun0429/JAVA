package PKG_Prod;

public class prodExample {

	public static void main(String[] args) {
	
		double[] salePrices = new double[4];
		
		
		Computer[] computers = new Computer[2];
		computers[0] = new Computer("��ǻ��", 50000, "����");
		salePrices[0] = computers[0].getPrice(0.25);
		
		computers[1] = new Computer("��ǻ��", 10000, "��Ƽ��");
		salePrices[1] = computers[1].getPrice(0.25);
		
		Toy[] toys = new Toy[2];
		toys[0] = new Toy("�峭��",1000,"Ʈ��");
		toys[1] = new Toy("�峭��",500,"����");
		
	//Computer C = new Computer("��ǻ��", 50000, "����");
	//salePrices[0] = C.getPrice(0.25);
	//double salePrice = C.getPrice(0.25);
	
	//Toy T = new Toy("�峭��",10000,"Ʈ��");
	//salePrices[1] = T.getPrice(0.25);
	
	//�迭�� �ȸ������ �� �ڵ�
	//System.out.println(salePrice);
	
	//Toy T = new Toy("�峭��",10000,"Ʈ��");
	//double salePrice2 = T.getPrice(0.5);
	
	
	for(int i =0; i<salePrices.length; i++) {
		System.out.println(salePrices[i]);
	}
	
	
	//casting
	Product c1 = new Computer("��ǻ��",1000,"��Ƽ��");
	Product t1 = new Toy("�峭��",500,"Ʈ��");
	//���ɽ��� ������ ���� �������� ������ ���ɽ���
	//�̷��� ���� ���� �� MemberŬ�������� purchase�� Product������ �ҷ��� �Ͱ� ������ 
	//���� �ڵ��������� ����� ���� ����. �ϼ����� 
	//Computer c11 = new Computer();��� �س��� Product p�� �޾Ƽ� �־��ִ� ��
	//��ӳ����� ������.
	
	System.out.println();
	
	Computer c11 = new Computer("��Ʈ��",100,"����");
	Toy t11 = new Toy("�峭��",100,"����");
	
	Member m = new Member(); 
	m.purchase(t11);
	m.purchase(c11);
	

	}
}

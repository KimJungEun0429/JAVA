
public class ExceptionTest {
	
	public static void main(String[] args) {
		//String str = 12345;
		//������ ����
		String[] strs = null;
		
		//strs = new String[4]; ������ �̷��� �ؾ��ϴµ�
		
		//strs[0] = "1234";
		//��԰� �̷��� �߾�. �������� �����ѵ� ���� ��Ű��
//		Exception in thread "main" java.lang.NullPointerException: Cannot store to object array because "strs" is null
//		at ExceptionTest.main(ExceptionTest.java:11)
		//��� ������ �ߴµ� cpu�� �˾ƸԴ� ����(java�� class�� �ٲٴ� ��) �ٲ㼭 cpu�� �����Ű��(�ϸ� ��Ÿ��) �������� �Ͼ�� ����
		//������, ��Ÿ�ӵ� �� �� �Ǿ����� ����� ����¡���� ��� = ������ ������ ������ ����¡���� ��� => ��������
		
		//����ó���� ��Ÿ�ӿ��� ������ ���� ��츦 �����.
		
		//int i = 0;
		//int j = 12 /i;
		//��¼�ٰ� 0�� ���ö��� �ִ�
		//�����ڴ� �� ����� ������
		//�� ���� ������ �ߴµ� �̷���찡 ����� �����޼����� �߸鼭 â�� ���������� = ����ó���� �س����� ���α׷��� ����������
		
		//����ó�� : ���α׷��� �����ϰ� '��Ÿ��'���� ������ �߻��ϸ� �ڿ������� ������ ó���ϱ� ���ؼ� ���.
		//c#�� c++ ����ó���� �����ڰ� ���� ������ �׳� ����
		//java�� ������ �Ǵ����� �� ������ �߻��� ������ �ִٸ� ������ ����ó���� ��Ų��.
		
		//����ó�� ����
		try {
			int i2 = 0;
			
			int j2 = 12 / i2;
			
			System.out.println(j2);//������� ���� § �ڵ��� ����
			
//			String[] strs3 = null;
//			strs3[0] = "1222";
		}
		catch(Exception e /*RuntimeException�̶�� �൵ ����.*/) {
			//class Exception���� �޾Ƶ��δ�.
			//Exception����ٰ� ������ �� ������ java�� �����ش�
			//String strMsg = e.getMessage();//ó������ �޼��带 ���� ����Ÿ���� �����Ѵ�.
			//System.out.println(strMsg);
				//���� �ܿ� �� �����Ƿ� https://docs.oracle.com/javase/8/docs/api/ ���⸦ ���� �Ĵٺ��� �ȴ�,,,��
			
			e.printStackTrace();
			//�����ڰ� �����ϰ� ���� �� ���� ���. �޼����� ��������� �������� �� ����ش�. ������ �� ���� �ȵ� �����Ҷ���
			//String strMsg2 = e.toString();//e.getMessage()���ؼ� �� �� ���� ���� ���� �޼����� ������
			//System.out.println(strMsg2);
			}
		finally {
			System.out.println("finally");
		}
		
		//NullPointerException�� ArithmeticException��� �ΰ��� ������ �ߴµ� exception�� �ΰ��� ��ӹް� �ִ� ��.
	}
}

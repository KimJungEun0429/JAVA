package PKG_Game;

//charaterŬ������. 
public class Fighter extends Character
{
		private String wName = "";//�����縸�� ���� �̸�
		//���� private���� ����� ���� ������ �Ʒ� get,set �Ž�带 �������´�.
		
		public Fighter(String cName) {
			super(cName);//super�� character���� �����Ѵٴ� �̾ӽ�
		}
		
		public Fighter(String cName,String wName) {
			super(cName);
			this.wName = wName;
		}
		
		public void setWName(String wName) {
			this.wName = wName;
		}//�̸��� ��ġ�� ���� �� �θ��� �Ž��
		
		public String getWName() {
			return this.wName;
		}//�̸��� �˻��ϰ� ���� �� �θ��� �Ž��
		
		public void fight() {
			System.out.println(cName+ "��(��) " + wName + "�� ������ �ο��.");
		}//cName�� ���� ������ private�� ���������� ����� ������� protected�� �ϴ� ��������
}


public class TestClass {

	public static void main(String[] args) {

		//1�����迭
		int[] a = new int[4];
		
		//2�����迭 -  for���� �������� ������ �����͸� ���� ��, �����ϰ� ���
		int[][] arr = new int[3][2];//�� (3 * 2)6���� �����͸� ���� �� ����.
		arr[0][0] = 12;
		arr[0][1] = 30;
		arr[1][0] = 27;
		arr[1][1] = 36;
		arr[2][0] = 11;
		arr[2][1] = 78;
        
		//���� �迭�� ��½�Ű��.
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println("arr[" + i + "][" + j +"]=" + arr[i][j]);
				
				//a[i][j] = i + j;
			}
		}
		
		String[][] strs = new String[2][3];
		strs[0][0] = "";
		strs[0][1] = "";
		strs[0][2] = "";
		strs[1][0] = "";
		strs[1][1] = "";
		strs[1][2] = "";
		
		//1.
		long[][] ln = new long[3][1];
		ln[0][0] = 1234;
		ln[1][0] = 1234;
		ln[2][0] = 1234;
		//2.
		long[] ln2 = new long[3];//1�����迭
		//ln[0] = 1234;
		//ln[1] = 1234;
		//ln[2] = 1234;
		
		//------------------------------
		//1���̶� 2�� �Ȱ��� �� �ƴϳ� �� �� ������ 2���� �迭�� 1�� �ڸ��� ���� ���ɼ��� �ֱ� ������ �ٸ� ������
		int rec_rowCount = 3;
		int rec_colCount = 1;
		
		/*
		long[][] ln = new long[rec_rowCount][rec_colCount];
			for(int i = 0; i<rec_rowCount; i++) {
				for(int j = 0; j<rec_colCount; j++) {
					str_students[i][j] = "";
				}
			}
		//-------------------------------���߿��� �̷��� �� ���̱� �x����
		
		//cammel ���
			
		String[][] strProducts = new String[2][3];
		
		strProducts[0][0] = "1";
		strProducts[0][1] = "2";
		strProducts[0][2] = "3";
		
		strProducts[1][0] = "300";
		strProducts[1][1] = "400";
		strProducts[1][2] = "500";

*/

	}

}

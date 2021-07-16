package PKG_Static;

public class People {

	public String gender;
	public String name;
	public int age;
	
		public People(String a, int b) {
			this.name = a;
			this.age = b;
		}
	
		private int memberCount = 0;
	
		
		public int getCount() {
		for(int i=1;i<=100;i++) {
		memberCount += i;
		}
		return memberCount;
	
		}

	}

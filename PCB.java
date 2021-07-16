
public class PCB {
	
	private String pcbName;
	private int volume = 0;
	private CallBack callback;
	//return으로 불가능한 코딩이 생겼을 때, callback라는 인터페이스를 사용한다
	
	
	public PCB(String pcbName) {
		this.pcbName = pcbName;
	}//생성자 END
	
	public void setTVBox(CallBack tvbox) {
		this.callback = tvbox;
	}//setTVBox
	
	public void realTurnOn() {
		
		try{
			double dValue = Math.random();
			int t = (int)(dValue * 10000);
			Thread.sleep(t);
			System.out.println("전원을 키기 위한 회로가 동작" + t);
			callback.RecieveMsg(pcbName);
		}//try
		catch (InterruptedException e) {
			e.printStackTrace();
		}//catch
	}//realTurnOn

	
	public void realVolumeUp() {
		volume++;
		System.out.println("볼륨" + volume);
	}//realVolumeUp()
	
	public void realVolumeDown(){
		volume--;
		System.out.println("볼륨" + volume);
	}//realVolumeDown()
	
}//PCB

	​​




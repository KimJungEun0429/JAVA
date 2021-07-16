
public class TVbox {

	private PCB pcb;
	
	public TVbox(String pcbName) {
		pcb = new PCB(pcbName);
	}
	
	public PCB getPCB() {
		return this.pcb;
	}
	
		public void TurnOn() {
			//������ư�� ������ Ű�� ����
			//PCB�� ������ư�� �����ٴ� ����� ����
			pcb.realTurnOn();
			//���������� -- ������ �������� �˷���
		}
		
		@Override
		public void RecieveMsg(String str) {
			System.out.println(str + "�� �������");
		}
		
		public void volumeUp() {
			pcb.realVolumeUp();
		}
		
		public void volumeDown() {
			pcb.realVolumeDown();
		}

}

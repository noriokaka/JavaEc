
public class PCApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		PC pc=new PC();
		pc.executeUSB(new UsbMemory());
		pc.executeUSB(new IUsb() {

			@Override
			public void execute() {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println("扇風機を回します");

			}});

	}

}
interface IUsb{
	void execute();
}
class PC{
	void executeUSB(IUsb usb) {
		usb.execute();
	}
}
class UsbMemory implements IUsb{
	@Override
	public void execute() {
		System.out.println("メモリに書き込みます");
	}
}

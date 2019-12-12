package Workbook;

public class MobileOtab extends Mobile {
	
	public MobileOtab() {
		
	}
	public MobileOtab(String mobileName, int batterySize, String osType ) {
		super(mobileName,batterySize,osType);
	}
	
	public int operate(int time) {
		int btsz = getBatterySize();
		btsz = getBatterySize() - (time*12);
		setBatterySize(btsz);
		return getBatterySize();
	}
	
	public int charge(int time) {
		int btsz = getBatterySize();
		btsz = getBatterySize() + (time*8);
		setBatterySize(btsz);
		return getBatterySize();
	}
	
}

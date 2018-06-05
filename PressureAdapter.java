/*
 * Beverly ACKAH
 * This is the PressureAdapter class.
 * It implements the SensorInterface.
 */
public class PressureAdapter implements SensorInterface{

	PressureSensor pa;
	
	PressureAdapter(){
		
		pa = new PressureSensor();
	}
	
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return pa.readValue();
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return pa.getReport();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return pa.getSensorName();
	}

}

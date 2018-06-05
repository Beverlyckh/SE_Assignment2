/*
 * Beverly ACKAH
 * This is the TemperatureAdapter class.
 * It implements the SensorInterface.
 */
public class TemperatureAdapter implements SensorInterface{
	
	TemperatureSensor ta;
	
	TemperatureAdapter(){
		
		ta = new TemperatureSensor();
	}
	

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return ta.senseTemperature();
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return ta.getTempReport();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return ta.getSensorType();
	}

}

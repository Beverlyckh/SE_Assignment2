/*
 * Beverly ACKAH
 * This is the RadiationAdapter class.
 * It implements the SensorInterface.
 */
public class RadiationAdapter implements SensorInterface {
	RadiationSensor	ra;
	
	RadiationAdapter(){
		ra = new RadiationSensor();
		
	}
	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		
		return ra.getRadiationValue();
	}

	@Override
	public String getReport() {
		// TODO Auto-generated method stub
		return ra.getStatusInfo();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return ra.getName();
	}

}

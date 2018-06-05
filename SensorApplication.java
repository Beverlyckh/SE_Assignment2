/*
 * Beverly ACKAH
 * This is the SensorApplication which contains the GUI to display.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class SensorApplication extends JFrame{
	
	public static void main(String[] args) {
		SensorApplication app = new SensorApplication() ;
		}
		
	  SensorApplication(){
		
		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3,1));

		RadiationAdapter ra = new RadiationAdapter();
		SensorView  sensorPanel = new SensorView(ra.getReport());
		sensorPanel.setBorder(new TitledBorder("Radiation"));
		JLabel labelRad = new JLabel(" " + ra.getType()+"("+ra.getReport()+")" + "-->" + ra.getValue());
		sensorPanel.add(labelRad);
		add(sensorPanel);
	
		TemperatureAdapter ta = new TemperatureAdapter();
		SensorView  temperaturePanel = new SensorView(ta.getReport());
		temperaturePanel.setBorder(new TitledBorder("Temperature"));
		JLabel labelTemp = new JLabel(" " + ta. getType() +"("+ta.getReport()+")"+ "-->" + ta.getValue());
		temperaturePanel.add(labelTemp);
		add(temperaturePanel);		

		
		PressureAdapter pa = new PressureAdapter();
		SensorView  PressurePanel = new SensorView(ta.getReport());
		PressurePanel.setBorder(new TitledBorder("Pressure"));
		JLabel labelPres = new JLabel(" " + ta.getType()+"("+ta.getReport()+")" + "-->" + ta.getValue());
		PressurePanel.add(labelPres);
		add(PressurePanel);
		
		setPreferredSize(new Dimension(600,600));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

	}

	public class SensorView extends JPanel{
	
		String status;

		public SensorView(String status) {
		
			this.status = status;
		}

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);  
			drawStatus(g);
		}

		public void drawStatus(Graphics g) {
			g.drawRect(100,30,90,50); 
			if(status.equals("OK")) {

				g.setColor(Color.GREEN);  

			}
			else {
				g.setColor(Color.RED);
			}
			g.fillRect(100,30,90,50); 

		}


	}



}

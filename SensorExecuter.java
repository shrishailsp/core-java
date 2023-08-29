class SensorExecuter{
public static void main (String args[]){
 Sensor sensor=new Sensor();
 sensor.type="Motion";
 sensor.price=250;
 sensor.usage="Motion detection";

 sensor.range="2 meter";
 sensor.sensing();
 
 Sensor sensor1=new Sensor();
 sensor1.type="fire";
 sensor1.price=350;
 sensor1.usage="Fire detection";
 sensor1.range="10 meter";
 sensor1.sensing();
 
 Sensor sensor2=new Sensor();
 sensor2.type="water";
 sensor2.price=150;
 sensor2.usage="water detection";
 sensor2.range="5 meter";
 sensor2.range="5 meter";
 sensor2.sensing();
 
 Sensor sensor3=new Sensor();
 sensor3.type="moisture";
 sensor3.price=250;
 sensor3.usage="moisture detection";
 sensor3.range="2 meter";
 sensor3.sensing();
 
 
 System.out.println("Type of the sensor is "+sensor.type);
 System.out.println("Price of the sensor is "+sensor.price);
 System.out.println("Used for "+sensor.usage);
 System.out.println("Range of the sensor is "+sensor.range);
 System.out.println("\n");
 
 System.out.println("Type of the sensor is "+sensor1.type);
 System.out.println("Price of the sensor is "+sensor1.price);
 System.out.println("Used for "+sensor1.usage);
 System.out.println("Range of the sensor is "+sensor1.range);
 System.out.println("\n");
 
 System.out.println("Type of the sensor is "+sensor2.type);
 System.out.println("Price of the sensor is "+sensor2.price);
 System.out.println("Used for "+sensor2.usage);
 System.out.println("Range of the sensor is "+sensor2.range);
 System.out.println("\n");
 
 System.out.println("Type of the sensor is "+sensor3.type);
 System.out.println("Price of the sensor is "+sensor3.price);
 System.out.println("Used for "+sensor3.usage);
 System.out.println("Range of the sensor is "+sensor3.range);
 System.out.println("\n");
}
}
 
package inheritanceassignment;

public class Laptop {
int noOfUSBPort,processorSpeed;

	public int getNoOfUSBPort() {
	return noOfUSBPort;
}

public void setNoOfUSBPort(int noOfUSBPort) {
	this.noOfUSBPort = noOfUSBPort;
}

public int getProcessorSpeed() {
	return processorSpeed;
}

public void setProcessorSpeed(int processorSpeed) {
	this.processorSpeed = processorSpeed;
}

	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.setNoOfUSBPort(4);
		l1.setProcessorSpeed(5);
		System.out.println(l1.getNoOfUSBPort()+" "+l1.getProcessorSpeed());

	}

}

public class Customer {

	private int tTime;
	private int aTime;
	private static int cNum;
	private int customerNumber;
	private int time;
	public Customer(int time,int tTime, int aTime) {
		
		 	this.time = time;
			this.aTime = aTime;
			this.tTime = tTime;
			customerNumber = ++cNum;
		
	}
	
	public int getTransactionTime() {
		return tTime;
	}
	public int getArrivalTime(){
		return aTime;
	}
	public int getCustomerNumber(){
		return customerNumber;
	}

}
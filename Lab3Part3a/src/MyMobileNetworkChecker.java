
public class MyMobileNetworkChecker {
	
	/**
	 * 
	 * @param args main method
	 */
	public static void main(String[] args) {
		
		String s = "vodafone";
		
		try {
			checkMyMobileNetwork(s);
		} catch (NotMyNetworkException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param inputNetwork string to be tested 
	 * @throws NotMyNetworkException exception thrown if network is wrong 
	 */
	public static void checkMyMobileNetwork(String inputNetwork) throws NotMyNetworkException {
		if(inputNetwork == "three") {
			System.out.println("Success!");
		} else {
			throw new NotMyNetworkException("Wrong Network! The network you tried is : " + inputNetwork);
		}
	}

}

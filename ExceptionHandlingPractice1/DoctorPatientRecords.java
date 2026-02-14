package ExceptionHandlingPractice1;

class PatientIdNotFoundException extends Exception{
	PatientIdNotFoundException(String msg){
		super(msg);
	}
}

class DatabaseConnectionException extends Exception{
	DatabaseConnectionException(String msg){
		super(msg);
	}
}

public class DoctorPatientRecords {
	
	static void checkPatientId(int[] arr, int searchId) throws PatientIdNotFoundException{
		boolean found = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == searchId) {
				System.out.println("Id found");
				found = true;
			}
			if(i == arr.length-1 && found == false) {
				throw new PatientIdNotFoundException("Id not found exception created");
			}
		}
	}
	
	static void checkDatabaseConnection(boolean a) throws DatabaseConnectionException{
		if(a) {
			System.out.println("Database connected successfully");
		}
		else {
			throw new DatabaseConnectionException("Database connection failure, exception created");
		}
	}
	public static void main(String[] args) {
		int[] patientIds = {101, 102, 103, 104, 105, 106, 107, 108};
		
		try {
			checkPatientId(patientIds, 108);
			checkDatabaseConnection(false);
		}
		catch(PatientIdNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(DatabaseConnectionException e) {
			System.out.println(e.getMessage());
		}
	}
}

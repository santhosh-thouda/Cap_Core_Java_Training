package MOnePractice;

import java.util.ArrayList;
import java.util.List;

class Train{
	String trainId;
	String trainName;
	String routeName;
	double punctualityScore;
	
	public Train(String trainId, String trainName, String routeName, double punctualityScore) {
		this.trainId = trainId;
		this.trainName = trainName;
		this.routeName = routeName;
		this.punctualityScore = punctualityScore;
	}
	
	void setTrainId(String trainId) {
		this.trainId = trainId;
	}
	
	String getTrainId() {
		return trainId;
	}
	
	void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	
	String getTrainName() {
		return trainName;
	}
	
	void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
	String getRouteName() {
		return routeName;
	}
	
	void setPunctualityScore(double punctualityScore) {
		this.punctualityScore = punctualityScore;
	}
	
	double getPunctualityScore() {
		return punctualityScore;
	}
	
	void Model(){};
	
	void Model(String trainId, String trainName, String routeName, double punctualityScore){
		this.trainId = trainId;
		this.trainName = trainName;
		this.routeName = routeName;
		this.punctualityScore = punctualityScore;
	}
}

class TrainUtil{
	List<Train> trainList = new ArrayList<>();
	
	
	
	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}
	
	public List<Train> getTrainList(){
		return trainList;
	}
	
	public void addTrainPerformance(Train train) {
		trainList.add(train);
	}
	
	public Train getTrainById(String trainId) {
		for(Train t : trainList) {
			if(t.getTrainId().equals(trainId)) {
				return t;
			}
		}
		return null;
	}
	
	
	public List<Train> getHighlyPunctualTrains(){
		List<Train> result = new ArrayList<>();
		double max = 0;
		
		for(Train t : trainList) {
			if(t.getPunctualityScore() > 0) {
				max = t.getPunctualityScore();
			}
		}
		
		for(Train t : trainList) {
			if(t.getPunctualityScore() == max) {
				result.add(t);
			}
		}
		
		return result;
	}
}

public class MetroTransit {
	 public static void main(String[] args) {
//		 Train t = new Train();
		 TrainUtil tu = new TrainUtil();
		 tu.addTrainPerformance(new Train("T101", "Blue Line Express", "Central-North", 92.5));
		 tu.addTrainPerformance(new Train("T102", "Green Corridor", "East-West", 88.0));
	     tu.addTrainPerformance(new Train("T103", "Rapid Metro", "Airport Line", 92.5));
	     
	     Train t = tu.getTrainById("T101");
	     if(t != null) {
	    	 System.out.println(t.getTrainId() + " | " + t.getTrainName() + " | " +
	                    t.getRouteName() + " | " + t.getPunctualityScore() + " %");
	     }
	     
	     System.out.println("Highly punctual trains are");
	     for(Train train : tu.getHighlyPunctualTrains()) {
	    	 System.out.println(train.getTrainId() + " | " + train.getTrainName() + " | " +
	                    train.getRouteName() + " | " + train.getPunctualityScore() + " %");
	     }
	 }
}

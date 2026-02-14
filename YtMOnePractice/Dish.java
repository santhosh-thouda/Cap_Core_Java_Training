package YtMOnePractice;

public class Dish {
	private String dishName;
	
	Dish(String dishName){
		this.dishName = dishName;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	public String toString() {
		return "Dish {dishName= " + dishName + "}";
	}
}

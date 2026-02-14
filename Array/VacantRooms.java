package Array;

public class VacantRooms {
	public static void main(String[]args) {
		int[] rooms = {4,5,6,7,9,8,2,1,3};
		boolean[] cancellations = {true, true, false, true, false, true, true, false, false};
		
		for(int i = 0; i<cancellations.length; i++){
			if(cancellations[i]) {
				rooms[i] = 0;
			}
		}
		
		int k = 0;
		int[] temp = new int[rooms.length];
		for(int i = 0; i<rooms.length; i++) {
			if(rooms[i] == 0) {
				temp[k++] = rooms[i];
			}
		}
		for(int i = 0; i<rooms.length; i++) {
			if(rooms[i] != 0) {
				temp[k++] = rooms[i];
			}
		}
		
		for(int i = 0; i<rooms.length; i++) {
			System.out.print(temp[i]+ " ");
		}
	}
}
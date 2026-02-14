package practice2;

import java.util.*;
import java.util.stream.Collectors;

public class EnrollmentService {
	List<Student> slist = new ArrayList<>();
	
	void addStudent(Student s) {
		slist.add(s);
	}
	
	Map<String, Integer> calculateAverageScores() {
		return slist.stream()
				.flatMap(s -> s.getCourseScores().entrySet().stream())
				.collect(Collectors.groupingBy(
						
				))
	}
}

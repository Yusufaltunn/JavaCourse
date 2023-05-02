
public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"c#+angular ","Engin demirog ");
		
		Course course2 = new Course(2,"java+reacct","engin demirog ");

		
		
		
Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			
			System.out.println(course.name);
		}
		
		System.out.println(courses.length);
		
		
	}

}

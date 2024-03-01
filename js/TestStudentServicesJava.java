import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestStudentServicesJava {
	List<Student> studentList = new ArrayList<Student>();
	StudentServicesJava studentServicesJavaObject = new StudentServicesJava();

	@DisplayName("Test check for adding/inserting/filtering by coursewise or gpawise/removing students ")
	@Test
	public void testCheckForAdditionAndDeletion() {
		
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 0);
		
		// creating a student object
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Rachel");
		student.setCourseName("Java");
		student.setGpa(9.2);
		studentServicesJavaObject.appendStudent(student, studentList);
		
		// After appending the data
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 1);
		Student monica = new Student("Monica", 2, "Java", 8.5);
		studentServicesJavaObject.insertStudent(monica, studentList, 0);
		
		// After inserting the data
		assertEquals(true, studentServicesJavaObject.getStudentName(studentList,0).equalsIgnoreCase("Monica"));
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 2);
		Student phoebe = new Student("Phoebe", 3, "Python", 8.5);
		studentServicesJavaObject.appendStudent(phoebe, studentList);
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 3);
		assertEquals(true, studentServicesJavaObject.getStudentName(studentList,1).equalsIgnoreCase("Rachel"));
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == studentList.size());
		
		// checking according to coursewise, first check for java
		List<Student> javaCourseWiseStudentList = new ArrayList<Student>();
		javaCourseWiseStudentList = studentServicesJavaObject.getStudentsByCourseWise(studentList, "java");
		
		// As for java, only 2 students are entered and checking like below
		assertEquals(true, studentServicesJavaObject.getStudents(javaCourseWiseStudentList) == 2);
		assertEquals(true, studentServicesJavaObject.getStudentName(javaCourseWiseStudentList,1).equalsIgnoreCase("Rachel"));
		
		List<Student> pythonCourseWiseStudentList = new ArrayList<Student>();
		pythonCourseWiseStudentList = studentServicesJavaObject.getStudentsByCourseWise(studentList, "python");
		
		// As for python, only 1 student is entered and checking like below
		assertEquals(true, studentServicesJavaObject.getStudents(pythonCourseWiseStudentList) == 1);
		assertEquals(true, studentServicesJavaObject.getStudentName(pythonCourseWiseStudentList,0).equalsIgnoreCase("phoebe"));
		
		// php course check
		List<Student> phpCourseWiseStudentList = new ArrayList<Student>();
		phpCourseWiseStudentList = studentServicesJavaObject.getStudentsByCourseWise(studentList, "unknown");
		
		// As for php, no students are there, we need to check like below
		assertEquals(true, studentServicesJavaObject.getStudents(phpCourseWiseStudentList) == 0);
		
		// Now with gpa check
		List<Student> gpaWiseStudentList = new ArrayList<Student>();
		gpaWiseStudentList = studentServicesJavaObject.getStudentsByGPA(studentList, 9.0);
		
		// Above 9.0, only 1 student is having
		assertEquals(true, studentServicesJavaObject.getStudents(gpaWiseStudentList) == 1);
		assertEquals(true, studentServicesJavaObject.getStudentName(gpaWiseStudentList,0).equalsIgnoreCase("rachel"));
		
		List<Student> higherGpaWiseStudentList = new ArrayList<Student>();
		higherGpaWiseStudentList = studentServicesJavaObject.getStudentsByGPA(studentList, 9.5);
		
		// Above 9.5, no students are there
		assertEquals(true, studentServicesJavaObject.getStudents(higherGpaWiseStudentList) == 0);
		
		// let us remove the students
		studentServicesJavaObject.removeStudent(studentList, 0);
		
		// As 0th index student got removed, only 2 students remain
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 2);
		
		// As 0th index got removed, rachel will be at 0th index
		assertEquals(true, studentServicesJavaObject.getStudentName(studentList,0).equalsIgnoreCase("Rachel"));
		
		studentServicesJavaObject.removeStudent(studentList, 1);
		
		// As 1st index student got removed, only 1 student remain
		assertEquals(true, studentServicesJavaObject.getStudents(studentList) == 1);
		
		// As 1st index got removed, like before rachel will be at 0th index
		assertEquals(true, studentServicesJavaObject.getStudentName(studentList,0).equalsIgnoreCase("Rachel"));
		
	}

}

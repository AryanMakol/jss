import java.util.ArrayList;
import java.util.List;

public class StudentServicesJava {
	// Appending i.e. adding students at the end of the
	// list and returning the studentlist size
	public int appendStudent(Student student,List<Student> studentList)
	{
		studentList.add(studen);
		return studentList.size();
	}

	// Inserting i.e. inserting students at the middle
	// of the list and returning the studentlist size
	public int insertStudent(Student student,List<Student> studentList,int index)
	{
		studentList.add(index,student);
		return studentList.size();
	}

	// Removing students from the list and
	// returning the studentlist size
	public int removeStudent(List<Student> studentList,int index)
	{
		studentList.remove(index); 
		return studentList.size();
	}

	// Returning the studentlist size
	public int getStudents(List<Student> studentList) {
		return studentList.size();
	}

	// Retrieving the student name at the specified index
	public String getStudentName(List<Student> studentList,int index) {
		return studentList.get(index).getStudentName();
	}

	// Returning the student list who matches for a specific course
	public List<Student> getStudentsByCourseWise(List<Student> studentList,String courseName) {
		List<Student> courseWiseStudents = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getCourseName().equalsIgnoreCase(courseName)) {
				courseWiseStudents.add(studentList.get(i));
			}
		}
		return courseWiseStudents;
	}

	// Returning the student list who matches for a specific gpa and more
	public List<Student> getStudentsByGPA(List<Student> studentList,double gpa) {
		List<Student> gpaWiseStudents = new ArrayList<Student>();
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getGpa() >= gpa) {
				gpaWiseStudents.add(studentList.get(i));
			}
		}
		return gpaWiseStudents;
	}

}

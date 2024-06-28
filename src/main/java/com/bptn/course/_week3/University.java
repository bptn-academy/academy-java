package com.bptn.course._week3;
import java.util.*;
import java.util.stream.Collectors;

class University extends Student {

	List<Student> students;
	
    // property - get inspired by the UML diagram
	

    public University() {
        this.students = new ArrayList<>(); // Initialize the students list in the constructor
    }


    public void addStudent(Student s) {
        // add a student to the "university" arraylist
    	students.add(s);
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
      for(int i=0; i<students.size();i++) {
    	  if (students.get(i).getStudentId() == studentId ) {
    		  return students.get(i);
    	  }
    	  
      }
      return null;
    }
    

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
    	List<Student> matchStudent = new ArrayList<>();
    			for (Student student:students) {
    		if( student.getUserName().startsWith(userNamePrefix)) {
    			matchStudent.add(student);
    		}
    			
    	}
    	return matchStudent;
    
    }

   /** public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
    	for(Student student: students) {
    	if ( student.getStudentId() == studentId ) {
    		students.remove(student);
    		return true;
    	}
    	return false;
    }
    }*/

    public boolean deleteStudent(long studentId) {
        // return if a successful deletion happened
    	Iterator<Student> studentIt = students.iterator();
    	while(studentIt.hasNext()) {
    		Student student = studentIt.next();
    		if ( student.getStudentId() == studentId ) {
         		students.remove(student);
         		return true;
         	}
    	}
     	
     	return false;
     }
    @Override
    public String toString() {
        if (students.isEmpty()) {
            return "No students in the university.";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Students in the university:\n");
            for (Student student : students) {
                sb.append(student.toString()).append("\n");
            }
            return sb.toString();
        }
    }
}



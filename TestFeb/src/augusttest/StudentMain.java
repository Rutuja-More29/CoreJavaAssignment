package augusttest;
/*consider an Arraylist<Test>test has (tid,sid,mark).create a Set<Student>student(sid,totalmarks) from list and sort the set in 
 * descending order of totalmarks
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

 class Teststud {
	    int tid;
	    int sid;
	    int marks;
	    
	     Teststud(int tid, int sid, int marks) {
	        this.tid = tid;
	        this.sid = sid;
	        this.marks = marks;
	    }
	    
	    public int getSid() {
	        return sid;
	    }
	    
	    public int getMarks() {
	        return marks;
	    }
	}

	 class Student implements Comparable<Student> {
	    int sid;
	    int totalMarks;
	    
	    public Student(int sid, int totalMarks) {
	        this.sid = sid;
	        this.totalMarks = totalMarks;
	    }
	    
	    public int compareTo(Student s) {
	    	
	    	if(this.totalMarks>s.totalMarks)
	    		return -1;
	    	else if(this.totalMarks<s.totalMarks)
	    		return 1;
	    	else
	    		return 0;
	    }
	}

	public class StudentMain {
	    public static void main(String[] args) {
	        ArrayList<Teststud> testList = new ArrayList<>();
	        testList.add(new Teststud(1, 1, 50));
	        testList.add(new Teststud(2, 1, 60));
	        testList.add(new Teststud(3, 2, 70));
	        testList.add(new Teststud(4, 3, 80));
	        testList.add(new Teststud(5, 4, 90));
	        testList.add(new Teststud(6, 4, 95));

	        Map<Integer, Integer> studentTotalMarksMap = new HashMap<>();
	        for (Teststud test : testList) {
	            studentTotalMarksMap.putIfAbsent(test.getSid(), 0);
	            studentTotalMarksMap.put(test.getSid(), studentTotalMarksMap.get(test.getSid()) + test.getMarks());
	        }

	        Set<Student> studentsSet = new TreeSet<>();
	        for (Map.Entry<Integer, Integer> entry : studentTotalMarksMap.entrySet()) {
	            studentsSet.add(new Student(entry.getKey(), entry.getValue()));
	        }

	        System.out.println(studentsSet);
	    }
	}



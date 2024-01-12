//Ядогальвис 8 группа 2 курс Вариант-1//Был изменён входной файл по причине не соответствия его условию
import java.util.List;import java.util.Map;
import java.io.*;import java.util.*;
import static java.lang.CharSequence.compare;
class Student implements Comparable<Student> 
{
    private String id;  
  private String lastName;
    private String firstName;  
  private String birthDate;
    private double averageGrade;  
  private List<Integer> subjectNumbers;

    public Student()
  {}
    public Student(String  id, String lastName, String firstName, String birthDate, double averageGrade, List<Integer> subjectNumbers) {        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;        
      this.birthDate = birthDate;
        this.averageGrade = averageGrade;          
         this.subjectNumbers = subjectNumbers;
    }
    public String getId()
  {       
    return id;
    }
    public void setId(String id)
  {     
    this.id = id;
    }
    public String getLastName()
  {      
    return lastName;
    }
    public void setLastName(String lastName) 
  {      
    this.lastName = lastName;
    }
    public String getFirstName() 
  {      
    return firstName;
    }
    public void setFirstName(String firstName)
  {
    this.firstName = firstName;   
  }
    public String getBirthDate() 
  {
        return birthDate;   
  }
    public void setBirthDate(String birthDate) 
  {
        this.birthDate = birthDate;  
  }
    public double getAverageGrade()
  {
        return averageGrade; 
  }
    public void setAverageGrade(double averageGrade) 
  {
        this.averageGrade = averageGrade; 
  }
    public List<Integer> getSubjectNumbers()
  {
        return subjectNumbers;  
  }
    public void setSubjectNumbers(List<Integer> subjectNumbers)
  {
        this.subjectNumbers = subjectNumbers;   
  }
    @Override
    public String toString() 
  {        return
                "id = " + id +                ", lastName= " + lastName  +
                ", firstName=и" + firstName  +                ", birthDate= " + birthDate  +
                ", averageGrade= " + averageGrade +                ", subjectNumbers= " + subjectNumbers;
    }
    @Override
    public int compareTo(Student other) 
  {       
    return compare(this.id, other.id);
    }
}
class ClassBD 
{
    private List<Student> students;    private Map<String, Integer> teacherMap;
    public ClassBD()
  {
    }
    public ClassBD(List<Student> students, Map<String, Integer> teacherMap) 
  {        
    this.students = students;
        this.teacherMap = teacherMap;
    }
    public List<Student> getStudents()
  {      
    return students;
    }
    public void setStudents(List<Student> students) 
  {      
    this.students = students;
    }
    public Map<String, Integer> getTeacherMap() 
  {       
    return teacherMap;
    }
    public void setTeacherMap(Map<String, Integer> teacherMap)
  {      
    this.teacherMap = teacherMap;
    }
    public void readStudentsFromFile(String fileName) 
  {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
          {            students = new ArrayList<>();
            String line;            while ((line = reader.readLine()) != null)
              {
                String[] parts = line.split("[!\\s_;,]+");               
                Student student = new Student();
                student.setId(parts[0]);              
                student.setLastName(parts[1]);
                student.setFirstName(parts[2]);         
                student.setBirthDate(parts[3]);
                student.setAverageGrade(Double.parseDouble(parts[4]));         
                List<Integer> subjectNumbers = new ArrayList<>();
                for (int i = 5; i < parts.length; i++) {         
                  subjectNumbers.add(Integer.parseInt(parts[i]));
                }               
                student.setSubjectNumbers(subjectNumbers);
                students.add(student);
            }       
          } catch (IOException e)
          {
            e.printStackTrace();      
          }
    }
    public void writeTeachersToMap(String fileName)
  {        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rezultmap.txt")))
    {
            teacherMap = new HashMap<>();
    }

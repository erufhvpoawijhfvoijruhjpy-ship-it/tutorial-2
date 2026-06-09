// Attributes
class Student {
    String name;
    int age;
    double gpa;



// Contructor
Student(String studentName,int studentAge, double studentGpa){
    name= studentName;
    age=studentAge;
    gpa = studentGpa;
}
//Methods 
public void displayInfo(){
    System.out.println("Name:" + name );
     System.out.println("Age:" + age);
     System.out.println("GPA:" + gpa);

}
//Anothor M
public void study (){
    System.out.println(name + " is studying.");

}
//ASnother
public void takeExam(){
    System.out.println(name + "is taking exam.");
}



}
class Student {
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Likhith";
        s1.marks = 85;

        s2.name = "Rahul";
        s2.marks = 90;

        s1.display();
        s2.display();
    }
}

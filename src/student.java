public class student {
    public class Student {
        String stuName;
        int age;
        String Adress;

        public Student(String stuName, int age, String Adress) {
            this.stuName = stuName;
            this.age = age;
            this.Adress = Adress;
        }

        public void SetName(String stuName) {
            this.stuName = stuName;
        }

        public void SetAge(int age) {
            this.age = age;
        }

        public void SetAdress(String Adress) {
            this.Adress = Adress;
        }

        public String getName() {
            return stuName;
        }

        public int getAge() {
            return age;
        }

        public String getAdress() {
            return Adress;
        }
    }

    public static void main(String[] args) {
        student outer = new student(); // Instance of the outer class
        Student John = outer.new Student("John", 12, "kigali");
        System.out.println(John.getName());
    }
}

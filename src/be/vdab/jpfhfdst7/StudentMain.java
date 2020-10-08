package be.vdab.jpfhfdst7;

public class StudentMain {
    public static void main(String[] args) {
        Student studentA = new Student("Kevin");
        Student studentB = new Student("Peter", 7);
        System.out.println(studentA.getNaam() + " " + studentA.getScore());
        System.out.println(studentB.getNaam() + " " + studentB.getScore());

        studentA.setScore(9);

        System.out.println(studentA.getNaam() + " " + studentA.getScore());
        System.out.println(studentB.getNaam() + " " + studentB.getScore());
    }
}

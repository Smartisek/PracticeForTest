public class MainApp {
    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Dominik", 1);
        StudentClass student2 = new StudentClass("Dominik", 1);
        boolean same = student1 == student2;
        boolean sameEquals = student1.equals(student2);

        System.out.println(student1);
        System.out.println("Shallow compare: " + same);
        System.out.println("Deep compare: " + sameEquals);
    }
}

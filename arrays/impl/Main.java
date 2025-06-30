public class Main {
    public static void main(String[] args) {
        Array grades = new Array();

        grades.push(90);
        grades.push(85);
        grades.insert(96, 1);
        grades.print();
        grades.remove(85);
        grades.prepend(100);
        grades.print();
    }
}

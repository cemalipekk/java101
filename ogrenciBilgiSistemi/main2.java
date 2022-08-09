public class main2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Cemal Hoca","FZK","0538");
        Teacher t2 = new Teacher("Zeynep Hoca","KMY","0537");
        Teacher t3 = new Teacher("Beyza Hoca","BIO","536");

        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t1);

        Course kimya = new Course("Kimya","102","KMY");
        kimya.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("cemal ipek","123","5",fizik,kimya,biyoloji,fizik,kimya,biyoloji);
        s1.addBulkExamNote(90,80,70);
        s1.addBulksozluNote(100,100,100);
        s1.isPass();


    }
}

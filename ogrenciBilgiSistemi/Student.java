public class Student {
    Course c1;
    Course c2;
    Course c3;

    Course so1;

    Course so2;

    Course so3;

    String name;
    String stuNo;
    String classes;

    double average;
    double courseAverage;
    boolean isPass;

    Student(String name, String stuNo, String classes,
            Course c1, Course c2, Course c3, Course so1, Course so2, Course so3){

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;

        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

        this.so1 = so1;
        this.so2 = so2;
        this.so3 = so3;

        this.courseAverage = 0.0;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;

        }

        }
        void addBulksozluNote(int sozlu1,int sozlu2, int sozlu3){
            if (sozlu1 >= 0 && sozlu1 <= 100) {
                this.so1.sozluNotu = sozlu1;
            }
            if (sozlu2 >= 0 && sozlu2 <= 100) {
                this.so2.sozluNotu = sozlu2;
            }
            if (sozlu3 >= 0 && sozlu3 <= 100) {
                this.so3.sozluNotu = sozlu3;

            }
        }

    void isPass(){
        this.average = ((this.c1.note*0.8+this.so1.sozluNotu*0.2) + (this.c2.note*0.8+this.so2.sozluNotu*0.2) +
                (this.c3.note*0.8+this.so3.sozluNotu*0.2))/3.00;
            if (this.average >= 55){
                System.out.println("Sinifi Gecti :)");
            }else{
                System.out.println("Sinifta Kaldi :(");
            }
        printNote();
        }



    void printNote() {
        System.out.printf(this.c1.name + " Notu : " + this.c1.note + " , ");
        System.out.println(this.so1.name + " Sozlu Notu : " + this.so1.sozluNotu);


        System.out.print(this.c2.name + " Notu : " + this.c2.note + " , ");
        System.out.println(this.so2.name + " Sozlu Notu : " + this.so2.sozluNotu );

        
        System.out.print(this.c3.name + " Notu : " + this.c3.note + " , ");
        System.out.println(this.so3.name + " Sozlu Notu : " + this.so3.sozluNotu);

        System.out.println("Not Ortalamasi : " + this.average);



    }
}

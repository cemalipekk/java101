public class Employe {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employe(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary>1000){
            return (this.salary* 0.03);
        }else{
            return 0;
        }
    }
    double bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }
    double raiseSalary(){
        int year = 2021;
        int workYear = year - this.hireYear;
        if (workYear<=10){
            return (this.salary * 0.05);

        }else if (workYear > 9 && workYear < 20){
            return this.salary * 0.10;

        } else {
            return this.salary * 0.15;
        }
    }



    public String toString(){

        double netSalary= this.salary+this.bonus()+this.raiseSalary()-this.tax();

        System.out.println("Adı : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maas Artisi : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + (netSalary-this.raiseSalary()) );
        System.out.println("Toplam Maas : " + netSalary);


        return null;
    }

}

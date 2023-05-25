package OOP_Seminar_7_Task4;

public class program {
    public static void main(String[] args) {
        jobAgency jobAgency = new jobAgency();

        company Caterpillar = new company("Caterpillar","QA engineer", 70000.0, jobAgency);
        company Komatsu = new company("Komatsu", "Department chief", 90000.0, jobAgency);
        company Liebherr = new company("Liebherr", "Junior mechanics ",100000.0, jobAgency);

        master Qwentine = new master("Qwentine");
        master Barbara = new master("Barbara");
        student Vespucci = new student("Vespucci");
        engineer Leonardo =  new engineer("Leonardo");

        jobAgency.registerObserver(Vespucci);
        jobAgency.registerObserver(Barbara);
        jobAgency.registerObserver(Qwentine);
        jobAgency.registerObserver(Leonardo);

        for (int index = 0; index < 3; index++) {
             Caterpillar.needEmployee();
             Komatsu.needEmployee();
             Liebherr.needEmployee();
        }
    }
}
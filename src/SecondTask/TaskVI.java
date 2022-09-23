package SecondTask;

import java.util.ArrayList;

public class TaskVI {
    static class Entrant {
        String surname;
        ArrayList<Integer> marks;
        int midMark;

        public Entrant(String surname) {
            this.surname = surname;
            this.marks = new ArrayList<>();
        }

        public void registrationToFaculty(Faculty faculty) {
            faculty.addNoStudents(this);
        }

        public void registrationToExam(Exam exam) {
            exam.addStudents(this);
        }

        public void getAnEstimate(int m) {
            marks.add(m);
        }

        public void getMidMark(int m) {
            this.midMark = m;
        }
    }

    static class Faculty {
        String name;
        ArrayList<Entrant> entrantsNotStudents;
        ArrayList<Entrant> entrantsStudents;

        public Faculty(String name) {
            this.name = name;
            this.entrantsNotStudents = new ArrayList<>();
            this.entrantsStudents = new ArrayList<>();
        }

        public void addNoStudents(Entrant entrant) {
            entrantsNotStudents.add(entrant);
        }

        public void addStudent(Entrant entrant) {
            entrantsStudents.add(entrant);
        }
    }

    static class Teacher {
        String surname;

        public Teacher(String surname) {
            this.surname = surname;
        }

        public void giveAGrade(Entrant entrant, int m) {
            entrant.getAnEstimate(m);
        }
    }

    static class Exam {
        String subject;
        ArrayList<Entrant> entrants;

        public Exam(String subject) {
            this.subject = subject;
            this.entrants = new ArrayList<>();
        }

        public void addStudents(Entrant entrant) {
            entrants.add(entrant);
        }
    }

    public static void calcMidMark(Entrant entrant) {
        int mark = 0;
        int length = entrant.marks.size();
        for (int i = 0; i < length; i++) {
            mark += entrant.marks.get(i);
        }
        entrant.getMidMark(mark / length);
    }

    public static void admissionToTheUniversity(Entrant entrant, Faculty faculty) {
        if (entrant.midMark > 3) {
            faculty.addStudent(entrant);
        }
    }

    public static void start() {
        Faculty FIST = new Faculty("FIST");

        Entrant Ivan = new Entrant("Petrov");
        Entrant Semen = new Entrant("Sidorov");

        Teacher Kirill = new Teacher("Ivanov");

        Exam exam = new Exam("Programming");
        Exam exam1 = new Exam("Math");

        Ivan.registrationToFaculty(FIST);
        Ivan.registrationToExam(exam);
        Ivan.registrationToExam(exam1);

        Semen.registrationToFaculty(FIST);
        Semen.registrationToExam(exam);
        Semen.registrationToExam(exam1);

        Kirill.giveAGrade(Ivan, 5);
        Kirill.giveAGrade(Ivan, 4);
        Kirill.giveAGrade(Semen, 3);
        Kirill.giveAGrade(Semen, 3);

        TaskVI.calcMidMark(Ivan);
        TaskVI.calcMidMark(Semen);

        TaskVI.admissionToTheUniversity(Ivan, FIST);
        TaskVI.admissionToTheUniversity(Semen, FIST);
    }
}

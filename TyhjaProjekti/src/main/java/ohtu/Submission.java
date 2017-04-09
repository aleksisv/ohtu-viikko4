package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    private String student_number;
    private String week;
    private String hours;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13;
    
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getA4() {
        return a4;
    }

    public String getA5() {
        return a5;
    }

    public String getA6() {
        return a6;
    }

    public String getA7() {
        return a7;
    }

    public String getA8() {
        return a8;
    }

    public String getA9() {
        return a9;
    }

    public String getA10() {
        return a10;
    }

    public String getA11() {
        return a11;
    }

    public String getA12() {
        return a12;
    }

    public String getA13() {
        return a13;
    }
    
    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }
    
    
    public List<String> getThemPoints() {
        ArrayList<String> lista = new ArrayList();
        if(this.getA1() == "true") {
            lista.add("1");
        }
        if(this.getA2() == "true") {
            lista.add("2");
        }
        if(this.getA3() == "true") {
            lista.add("3");
        }
        if(this.getA4() == "true") {
            lista.add("4");
        }
        if(this.getA5() == "true") {
            lista.add("5");
        }
        if(this.getA6() == "true") {
            lista.add("6");
        }
        if(this.getA7() == "true") {
            lista.add("7");
        }
        if(this.getA8() == "true") {
            lista.add("8");
        }
        if(this.getA9() == "true") {
            lista.add("9");
        }
        if(this.getA10() == "true") {
            lista.add("10");
        }
        if(this.getA11() == "true") {
            lista.add("11");
        }
        if(this.getA12() == "true") {
            lista.add("12");
        }
        if(this.getA13() == "true") {
            lista.add("13");
        }
        
        return lista;
    }
    
    public int getMaxPoints() {
        int max = 0;
        if(this.getA1() != null) {
            max++;
        }
        if(this.getA2() != null) {
            max++;
        }
        if(this.getA3() != null) {
            max++;
        }
        if(this.getA4() != null) {
            max++;
        }
        if(this.getA5() != null) {
            max++;
        }
        if(this.getA6() != null) {
            max++;
        }
        if(this.getA7() != null) {
            max++;
        }
        if(this.getA8() != null) {
            max++;
        }
        if(this.getA9() != null) {
            max++;
        }
        if(this.getA10() != null) {
            max++;
        }
        if(this.getA11() != null) {
            max++;
        }
        if(this.getA12() != null) {
            max++;
        }
        if(this.getA13() != null) {
            max++;
        }
        
        return max;
    }
    
    public String stringifyExercises() {
        List<String> l = this.getThemPoints();
        String valmis = "";
        for (int i = 0; i < l.size(); i++) {
            valmis += l.get(i) + " ";
        }
        return valmis;
    }
    
    
   
    @Override
    public String toString() {
        return "Viikko " + week + ": tehtyjä tehtäviä yhteensä: " 
                + this.getThemPoints().size() + ", aikaa kului " + hours 
                + " tuntia, tehdyt tehtävät: " + stringifyExercises()    ;
    }

    
}
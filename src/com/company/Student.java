package com.company;

public class Student {
    private int year;
    private String kod;
    private String dvz;
    private int zamestnanci;





    public Student (int year, String kod, String dvz, int zamestnanci){
        this.year = year;
        this.kod = kod;
        this.dvz = dvz;
        this.zamestnanci = zamestnanci;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getDvz() {
        return dvz;
    }

    public void setDvz(String dvz) {
        this.dvz = dvz;
    }

    public int getZamestnanci() {
        return zamestnanci;
    }

    public void setZamestnanci(int zamestnanci) {
        this.zamestnanci = zamestnanci;
    }
}

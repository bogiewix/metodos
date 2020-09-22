package co.edu.unipiloto;

public class NameHandler {

    private String name;
    private int semestre, dianacimiento, mesnacimiento, anonaciemiento, anoingreso, mesingreso,resultado;

    public NameHandler() {
        name = null;
        //anoingreso = 0;
        semestre = 0;
        dianacimiento = 0;
        mesnacimiento = 0;
        anonaciemiento = 0;
        mesingreso = 0;
        resultado=0;
    }

    public int semestres() {
        if (semestre==1){
            resultado=(2020-anoingreso)*2+1;
        }
        else{
            resultado=(2020-anoingreso)*2;
        }
        return resultado;
    }
     public int edad() {
        anonaciemiento=2020-anonaciemiento;
        return anonaciemiento;
    }
    

    public String getName() {
        return name;
    }


    public int getMesingreso() {
        return mesingreso;
    }

    public int getAnoingreso() {
        return anoingreso;
    }

    public int getSemestre() {
        return semestres();
    }

    public int getDianacimiento() {
        return dianacimiento;
    }

    public int getMesnacimiento() {
        return mesnacimiento;
    }

    public int getAnonaciemiento() {
        return edad();
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setDianacimiento(int dianacimiento) {
        this.dianacimiento = dianacimiento;
    }

    public void setMesnacimiento(int mesnacimiento) {
        this.mesnacimiento = mesnacimiento;
    }

    public void setAnonaciemiento(int anonaciemiento) {
        this.anonaciemiento = anonaciemiento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnoingreso(int anoingreso) {
        this.anoingreso = anoingreso;
    }

    public void setMesingreso(int mesingreso) {
        this.mesingreso = mesingreso;
    }

}
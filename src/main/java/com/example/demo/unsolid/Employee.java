package com.example.demo.unsolid;

public class Employee implements GeneralEmployee {

    public ReportGenerator reportGenerator;

    public Employee(ReportGenerator reportGenerator){
        this.reportGenerator = reportGenerator;
    }

    public void generarReporte(){
        System.out.println("Generando reporte");
        reportGenerator.report();
    }

    String name;
    String departament;

    public String getName() {
        return name;
    }

    @Override
    public String getDepartament() {
        return departament;
    }
}
package com.example.demo.unsolid;

public class PartTimeEmployee implements GeneralEmployee {
    public ReportGenerator reportGenerator;

    public PartTimeEmployee(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    @Override
    public String getDepartament() {
        return "PartTime";
    }
}
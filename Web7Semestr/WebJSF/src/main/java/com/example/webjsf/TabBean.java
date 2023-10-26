package com.example.webjsf;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped

public class TabBean implements Serializable {

    Calculation calculation = new Calculation();



    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public String tabulate(){
        calculation.calculate();
        return "response";
    }

}

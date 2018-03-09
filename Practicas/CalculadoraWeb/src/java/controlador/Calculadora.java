package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Angelo
 */
public class Calculadora {
    

    private double res;
    private double op1, op2;

    /**
     * @return the res
     */
    public double getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(double res) {
        this.res = res;
    }

    public void getSuma() {
        res = op1 + op2;
    }

    public void getResta() {
        res = op1 - op2;
    }

    public void getMultiplicacion() {
        res = op1 * op2;
    }

    public void division() {
        res = op1 / op2;
    }

    /**
     * @return the op1
     */
    public double getOp1() {
        return op1;
    }

    /**
     * @param op1 the op1 to set
     */
    public void setOp1(double op1) {
        this.op1 = op1;
    }

    /**
     * @return the op2
     */
    public double getOp2() {
        return op2;
    }

    /**
     * @param op2 the op2 to set
     */
    public void setOp2(double op2) {
        this.op2 = op2;
    }

}

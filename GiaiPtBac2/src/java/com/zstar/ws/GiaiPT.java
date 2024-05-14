/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zstar.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "GiaiPT")
public class GiaiPT {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "GiaiPTB2")
    public String GiaiPTB2(@WebParam(name = "a") double a, @WebParam(name = "b") double b, @WebParam(name = "c") double c) {
        String kq = "";
        double delta = b*b - 4*a*c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    kq = "Vo so nghiem";
                } else {
                    kq = "Vo nghiem";
                }
            } else {
                kq = "Co 1 nghiem x = " + (-c / b);
            }
        } else {
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                kq = "Co 2 nghiem phan biet x1 = " + x1 + ", x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2*a);
                kq = "Co nghiem kep x = " + x;
            } else {
                kq = "Vo nghiem";
            }
        }
        return kq;
    }

}

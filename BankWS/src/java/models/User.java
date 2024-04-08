/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class User {
    String username,password, fullname;
    float totalMoney;

    List<Transferhistory> transferhistory;
    List<Drawmoneyhistory> draw_money_history;
    public User() {
        transferhistory = new ArrayList();
        draw_money_history = new ArrayList();
    }

    public User(String username, String password, String fullname, float totalMoney) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.totalMoney = totalMoney;
        
        transferhistory = new ArrayList();
        draw_money_history = new ArrayList();
    }

    public List<Transferhistory> getTransferhistory() {
        return transferhistory;
    }

    public void setTransferhistory(List<Transferhistory> transferhistory) {
        this.transferhistory = transferhistory;
    }

    public List<Drawmoneyhistory> getDraw_money_history() {
        return draw_money_history;
    }

    public void setDraw_money_history(List<Drawmoneyhistory> draw_money_history) {
        this.draw_money_history = draw_money_history;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }
    
    
}

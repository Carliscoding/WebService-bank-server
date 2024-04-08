/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Drawmoneyhistory {
    int id;
    String username;
    float totalDraw;
    Date drawDate;

    public Drawmoneyhistory() {
    }

    public Drawmoneyhistory(int id, String username, float totalDraw, Date drawDate) {
        this.id = id;
        this.username = username;
        this.totalDraw = totalDraw;
        this.drawDate = drawDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getTotalDraw() {
        return totalDraw;
    }

    public void setTotalDraw(float totalDraw) {
        this.totalDraw = totalDraw;
    }

    public Date getDrawDate() {
        return drawDate;
    }

    public void setDrawDate(Date drawDate) {
        this.drawDate = drawDate;
    }
    
    
}

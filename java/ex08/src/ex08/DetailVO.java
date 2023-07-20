package ex08;

import java.util.*;

public class DetailVO {
    private int dno;
    private int ano;
    private int amount;
    private String type;
    private Date ddate;

    public int getDno() {
        return this.dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDdate() {
        return this.ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    @Override
    public String toString() {
        return "DetailVO [dno=" + dno + ", ano=" + ano + ", amount=" + amount + ", type=" + type + ", ddate=" + ddate
                + "]";
    }

}

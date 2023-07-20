package ex07;

import java.util.*;

public class SaleVO extends ProductVO {
    private int scode;
    private int pcode;
    private int qnt;
    private int sprice;
    private Date sdate;

    public int getScode() {
        return this.scode;
    }

    public void setScode(int scode) {
        this.scode = scode;
    }

    public int getPcode() {
        return this.pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public int getQnt() {
        return this.qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public int getSprice() {
        return this.sprice;
    }

    public void setSprice(int sprice) {
        this.sprice = sprice;
    }

    public Date getSdate() {
        return this.sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    @Override
    public String toString() {
        return "SaleVO [scode=" + scode + ", pcode=" + pcode + ", qnt=" + qnt + ", sprice=" + sprice + ", sdate="
                + sdate + "]";
    }

}

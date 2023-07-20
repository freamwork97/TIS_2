package ex10;

import java.util.*;

public class EnrolVO {
    private String scode;
    private String sname;
    private String ccode;
    private String cname;
    private int grade;
    private Date edate;

    public String getScode() {
        return this.scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCcode() {
        return this.ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getEdate() {
        return this.edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    @Override
    public String toString() {
        return "EnrolVO [scode=" + scode + ", sname=" + sname + ", ccode=" + ccode + ", cname=" + cname + ", grade="
                + grade + ", edate=" + edate + "]";
    }

}

package ex01;

public class Student {
    // 필드
    private String sno;
    private String sname;
    private String address;
    private String dept = "컴정과";

    public Student() {

    }

    public Student(String sno, String sname, String address) {
        super();
        this.sno = sno;
        this.sname = sname;
        this.address = address;
    }

    public String getSno() {
        return this.sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return this.sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + ", dept=" + dept + "]";
    }

}

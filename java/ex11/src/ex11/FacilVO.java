package ex11;

public class FacilVO {
    private int fno;
    private String fname;

    public int getFno() {
        return this.fno;
    }

    public void setFno(int fno) {
        this.fno = fno;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "FacilVO [fno=" + fno + ", fname=" + fname + "]";
    }

}

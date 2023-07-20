package ex11;

public class CampfacilVO extends FacilVO {
    private String cno;
    private int fno;

    public String getCno() {
        return this.cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public int getFno() {
        return this.fno;
    }

    public void setFno(int fno) {
        this.fno = fno;
    }

    @Override
    public String toString() {
        return "CampfacilVO [cno=" + cno + ", fno=" + fno + "]";
    }

}

package ex11;

public class CampVO {
    private String cno;
    private String cname;
    private String juso;
    private String tel;

    public String getCno() {
        return this.cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getJuso() {
        return this.juso;
    }

    public void setJuso(String juso) {
        this.juso = juso;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "CampVO [cno=" + cno + ", cname=" + cname + ", juso=" + juso + ", tel=" + tel + "]";
    }

}

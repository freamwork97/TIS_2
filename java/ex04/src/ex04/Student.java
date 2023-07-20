package ex04;

public class Student {
    // 필드
    private int no;
    private String name;
    private String juso;
    private String phone;

    // 생성자
    public Student() {

    }

    public Student(int no, String name, String juso, String phone) {
        super();
        this.no = no;
        this.name = name;
        this.juso = juso;
        this.phone = phone;
    }

    // 메서드
    public int getNo() {
        return this.no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJuso() {
        return this.juso;
    }

    public void setJuso(String juso) {
        this.juso = juso;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + ", juso=" + juso + ", phone=" + phone + "]";
    }
}

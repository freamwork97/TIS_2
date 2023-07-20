package ex05;

public class StudentVO {
	private String sno;
	private String sname;
	private String dept;
	private String birthday;
	private int year;

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

	public String getDept() {
		return this.dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname + ", dept=" + dept + ", birthday=" + birthday + ", year="
				+ year + "]";
	}

}

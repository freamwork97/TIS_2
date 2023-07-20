package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    // 필드
    private String name;
    private String id;
    private String pw;
    private String joinDate;

    // 기본생성자 모든 필드 매개변수로 받는 생성자
    public User() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        joinDate = dtf.format(LocalDateTime.now());
    }

    public User(String name, String id, String pw) {
        this();
        this.name = name;
        this.id = id;
        this.pw = pw;
    }

    // 메서드(get/set)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    // 메서드 print
    public void print() {
        System.out.printf("%s\t%s\t%s\t%s\n", name, id, pw, joinDate);
    }
}

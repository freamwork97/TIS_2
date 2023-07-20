package ex09;

import java.util.*;

public class MessageVO extends UserVO {
    private int mid;
    private String sender;
    private String receiver;
    private Date sdate;
    private String message;

    public int getMid() {
        return this.mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Date getSdate() {
        return this.sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageVO [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", sdate=" + sdate
                + ", message=" + message + "]";
    }

}

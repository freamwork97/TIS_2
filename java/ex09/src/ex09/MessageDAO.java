package ex09;

import java.sql.*;
import java.util.*;

public class MessageDAO {
    Connection con = Database.connect();

    // 보낸메시지 삭제
    public void sendDel(int mid) {
        try {
            String sql = "update message set rdel=1 where mid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mid);
            ps.execute();
        } catch (Exception e) {
            System.out.println("보낼메시지삭제 오류 : " + e.toString());
        }
    }

    // 받은메시지 삭제
    public void receiveDel(int mid) {
        try {
            String sql = "update message set sdel=1 where mid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, mid);
            ps.execute();
        } catch (Exception e) {
            System.out.println("받은메시지삭제 오류 : " + e.toString());
        }
    }

    // 포인트증가
    public void updatePoint(String id) {
        try {
            String sql = "update users set point=point+10 where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
        } catch (Exception e) {
            System.out.println("포인트증가 오류 : " + e.toString());

        }
    }

    // 메시지전송
    public void insert(MessageVO vo) {
        try {
            String sql = "INSERT INTO message(mid,sender,receiver,sdate,message)";
            sql += " values(SEQ_MID.nextval,?,?,sysdate,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, vo.getSender());
            ps.setString(2, vo.getReceiver());
            ps.setString(3, vo.getMessage());
            ps.execute();
        } catch (Exception e) {
            System.out.println("메시지전송 오류 : " + e.toString());
        }
    }

    // 받은메시지
    public List<MessageVO> receiveList(String id) {
        List<MessageVO> array = new ArrayList<>();
        try {
            String sql = "select m.*, u.UNAME FROM message m, users u";
            sql += " WHERE receiver = ? and sender=id and sdel=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MessageVO vo = new MessageVO();
                vo.setMid(rs.getInt("mid"));
                vo.setSender(rs.getString("sender"));
                vo.setUname(rs.getString("uname"));
                vo.setMessage(rs.getString("message"));
                vo.setSdate(rs.getTimestamp("sdate"));
                array.add(vo);
            }
        } catch (Exception e) {
            System.out.println("보낸메시지 오류 : " + e.toString());
        }
        return array;
    }

    // 보낸메시지
    public List<MessageVO> sendList(String id) {
        List<MessageVO> array = new ArrayList<>();
        try {
            String sql = "SELECT m.*, uname FROM message m, users u";
            sql += " where sender=? and receiver=id and rdel=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MessageVO vo = new MessageVO();
                vo.setMid(rs.getInt("mid"));
                vo.setReceiver(rs.getString("receiver"));
                vo.setUname(rs.getString("uname"));
                vo.setMessage(rs.getString("message"));
                vo.setSdate(rs.getTimestamp("sdate"));
                array.add(vo);
            }
        } catch (Exception e) {
            System.out.println("받은메시지 오류 : " + e.toString());
        }
        return array;
    }
}

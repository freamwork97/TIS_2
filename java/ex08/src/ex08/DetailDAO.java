package ex08;

import java.sql.*;
import java.util.*;

public class DetailDAO {
    Connection con = Database.connect();

    // 거래내역 등록
    public void insert(DetailVO vo) {
        try {
            String sql = "INSERT INTO DETAIL(DNO, ANO, AMOUNT, TYPE, DDATE) ";
            sql += "VALUES(seq_dno.nextval,?,?,?,sysdate)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vo.getAno());
            ps.setInt(2, vo.getAmount());
            ps.setString(3, vo.getType());
            ps.execute();
        } catch (Exception e) {
            System.out.println("거래내역 등록 오류 : " + e.toString());
        }
    }

    // 특정계좌의 거래내역
    public List<DetailVO> list(int ano) {
        List<DetailVO> array = new ArrayList<>();
        try {
            String sql = "SELECT * FROM DETAIL where ano=? ORDER BY dno desc";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ano);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetailVO vo = new DetailVO();
                vo.setDno(rs.getInt("dno"));
                vo.setAno(rs.getInt("ano"));
                vo.setAmount(rs.getInt("amount"));
                vo.setType(rs.getString("type"));
                vo.setDdate(rs.getTimestamp("ddate"));
                array.add(vo);
            }

        } catch (Exception e) {
            System.out.println("거래내역오류 : " + e.toString());
        }
        return array;
    }
}

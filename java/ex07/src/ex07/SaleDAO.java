package ex07;

import java.sql.*;
import java.util.*;

public class SaleDAO {
    Connection con = Database.connect();

    // 상품별 판매현황
    public List<SaleVO> sum_list() {
        List<SaleVO> array = new ArrayList<>();
        try {
            String sql = "SELECT PCODE, PNAME, SUM(qnt) sum_qnt, SUM(SPRICE*qnt) sum_price ";
            sql += "FROM VIEW_SALE GROUP BY PCODE, PNAME ORDER by PCODE";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SaleVO vo = new SaleVO();
                vo.setPcode(rs.getInt("pcode"));
                vo.setPname(rs.getString("pname"));
                vo.setQnt(rs.getInt("sum_qnt"));
                vo.setSprice(rs.getInt("sum_price"));
                array.add(vo);
            }
        } catch (Exception e) {
            System.out.println("상품별 판매현황 : " + e.toString());
        }
        return array;
    }

    // 판매등록
    public void insert(SaleVO vo) throws Exception {
        String sql = "INSERT INTO SALE(SCODE, PCODE, QNT, SPRICE) VALUES(CODE_SEQ.NEXTVAL,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, vo.getPcode());
        ps.setInt(2, vo.getQnt());
        ps.setInt(3, vo.getSprice());
        ps.execute();
    }
    // 상품별 판매목록 조회

    public List<SaleVO> list(int pcode) throws Exception {
        List<SaleVO> array = new ArrayList<SaleVO>();
        String sql = "SELECT * FROM SALE WHERE PCODE = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, pcode);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            SaleVO vo = new SaleVO();
            vo.setScode(rs.getInt("scode"));
            vo.setPcode(rs.getInt("pcode"));
            vo.setQnt(rs.getInt("qnt"));
            vo.setSprice(rs.getInt("sprice"));
            vo.setSdate(rs.getTimestamp("sdate"));
            array.add(vo);
        }
        return array;
    }
}

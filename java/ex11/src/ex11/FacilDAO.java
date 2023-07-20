package ex11;

import java.sql.*;
import java.util.*;

public class FacilDAO {
    Connection con = Database.connect();

    // 캠핑장에 시설물등록
    public void insert(String cno, int fno) {
        try {
            String sql = "insert into camp_facil(cno,fno) values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cno);
            ps.setInt(2, fno);
            ps.execute();
        } catch (Exception e) {
            System.out.println("캠핑장에 시설물등록 오류 : " + e.toString());
        }
    }

    // 캠핑장별 시설물목록
    public List<CampfacilVO> list(String cno) {
        List<CampfacilVO> array = new ArrayList<>();
        try {
            String sql = "SELECT * from view_facil where cno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CampfacilVO vo = new CampfacilVO();
                vo.setFno(rs.getInt("fno"));
                vo.setFname(rs.getString("fname"));
                array.add(vo);
            }
        } catch (Exception e) {
            System.out.println("시설물목록 오류 : " + e.toString());
        }
        return array;
    }

    // 시설물목록
    public List<FacilVO> list() {
        List<FacilVO> array = new ArrayList<>();
        try {
            String sql = "SELECT * from facil order by fno";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FacilVO vo = new FacilVO();
                vo.setFno(rs.getInt("fno"));
                vo.setFname(rs.getString("fname"));
                array.add(vo);
            }
        } catch (Exception e) {
            System.out.println("시설물목록 오류 : " + e.toString());
        }
        return array;
    }
}

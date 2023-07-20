package ex11;

import java.util.*;

public class Facil { // 시설물관리 서브메뉴
    public static void run() {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        FacilDAO fdao = new FacilDAO();
        CampDAO cdao = new CampDAO();
        while (run) {
            System.out.println("\n\n******* 시설물관리 *******************************************");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.시설물목록 |2.캠핑장시설물등록 |3.캠핑장시설물삭제|0.메인메뉴");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("메인메뉴로 돌아갑니다.");
                    break;
                case "1":
                    List<FacilVO> farray = fdao.list();
                    System.out.println("번호\t시설물");
                    for (FacilVO vo : farray) {
                        System.out.printf("%d\t%s\n",
                                vo.getFno(), vo.getFname());
                    }
                    break;
                case "2":
                    System.out.print("캠핑장번호 : ");
                    String cno = sc.nextLine();
                    if (cno == "") {
                        System.out.println("시설물등록 취소");
                        break;
                    } else {
                        CampVO cvo = cdao.read(cno);
                        if (cvo.getCname() == null) {
                            System.out.println("캠핑장 X");
                        } else {
                            while (true) {
                                // 캠핑장에 등록된 시설물
                                System.out.println("캠핑장 이름 : " + cvo.getCname());
                                System.out.println("등록시설물----------------------------------------------------");
                                List<CampfacilVO> array = fdao.list(cno);
                                if (array.size() == 0) {
                                    System.out.println("시설물 X");
                                } else {
                                    for (CampfacilVO vo : array) {
                                        System.out.printf("%d:%s | ", vo.getFno(), vo.getFname());
                                    }
                                    System.out.println("\n전체시설물----------------------------------------------------");
                                }
                                // 전체시설물
                                List<FacilVO> aarray = fdao.list();
                                for (FacilVO vo : aarray) {
                                    System.out.printf("%d:%s | ", vo.getFno(), vo.getFname());
                                }
                                System.out.println("\n--------------------------------------------------------------");
                                System.out.print("시설물번호 : ");
                                String fno = sc.nextLine();
                                if (fno == "") {
                                    System.out.println("시설물등록 취소");
                                    break;
                                } else {
                                    int error = checkFno(fno, array, aarray);
                                    // System.out.println(error);
                                    if (error == 0) {
                                        fdao.insert(cno, Integer.parseInt(fno));
                                        System.out.println("시설물등록완료");
                                    }
                                }

                            }
                        }
                    }
                    break;
                case "3":
                    break;
                default:
                    System.out.println("다시 선택");
                    break;
            }
        }
    }

    // 시설물번호 체크 메서드
    public static int checkFno(String fno, List<CampfacilVO> array, List<FacilVO> aarray) {
        int error = 0;
        try {
            int no = Integer.parseInt(fno);
            boolean find = false;
            for (CampfacilVO vo : array) {
                if (vo.getFno() == no)
                    find = true;
            }
            if (find) {
                error = 1;
                System.out.println("이미 등록된 시설물");
            }
            find = false;
            for (FacilVO vo : aarray) {
                if (vo.getFno() == no)
                    find = true;
            }
            if (find == false) {
                error = 2;
                System.out.println("등록된 시설물X");
            }
        } catch (Exception e) {
            error = 3;
            System.out.println("숫자로 입력");
        }
        return error;
    }
}

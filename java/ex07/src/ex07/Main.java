package ex07;

import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAOImpl();
        SaleDAO sdao = new SaleDAO();
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###원");
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        boolean run = true;
        while (run) {
            System.out.println("\n\n******* 상품관리 *****************************");
            System.out.println("--------------------------------------------");
            System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
            System.out.println("6.상품별매출조회 |7.매출등록 |8.매출현황");
            System.out.println("--------------------------------------------");
            System.out.print("선택>");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case "1":
                    ProductVO pro = new ProductVO();

                    System.out.print("상품이름 : ");
                    pro.setPname(sc.nextLine());
                    pro.setPprice(input("상품가격"));
                    try {

                        dao.insert(pro);
                        System.out.println("상품 등록완료");
                    } catch (Exception e) {
                        System.out.println("상품등록 오류" + e.toString());
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.print("\n상품코드 : ");
                        String pcode = sc.nextLine();
                        if (pcode == "")
                            break;
                        try {
                            ProductVO vo = dao.read(Integer.parseInt(pcode));
                            if (vo.getPname() == null) {
                                System.out.println("해당 상품X");
                            } else {
                                System.out.println("상품 이름 : " + vo.getPname());
                                System.out.println("상품 가격 : " + df.format(vo.getPprice()));
                            }
                        } catch (Exception e) {
                            System.out.println("상품조회 오류");
                        }

                    }
                    break;
                case "3":
                    try {
                        for (ProductVO vo : dao.list()) {
                            System.out.printf("%d\t%-23s\t%s\n",
                                    vo.getPcode(),
                                    vo.getPname(),
                                    df.format(vo.getPprice()));
                        }
                        System.out.println(dao.list().size() + "개 상품있음");
                    } catch (Exception e) {
                        System.out.println("목록출력 오류");
                    }
                    break;
                case "4":
                    System.out.print("수정할상품코드 : ");
                    String pcode = sc.nextLine();
                    if (pcode == "")
                        break;
                    try {
                        ProductVO pro3 = dao.read(Integer.parseInt(pcode));
                        if (pro3.getPname() == null) {
                            System.out.println("수정할 상품X");
                        } else {
                            System.out.println("상품 이름 : " + pro3.getPname());
                            System.out.print("새로운 상품 이름 : ");
                            String pname = sc.nextLine();
                            if (pname != "")
                                pro3.setPname(pname);

                            System.out.println("상품 가격 : " + df.format(pro3.getPprice()));
                            int price = input("새로운상품가격");
                            if (price != 0)
                                pro3.setPprice(price);

                            System.out.print("수정(Y/y)?");
                            String sel = sc.nextLine();
                            if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
                                dao.update(pro3);
                                System.out.println("수정완료");
                            }

                        }
                    } catch (Exception e) {
                        System.out.println("상품정보 수정실패" + e.toString());
                    }
                    break;
                case "5":
                    int code = input("삭제할상품코드");
                    if (code == 0) {
                        System.out.println("삭제 종료");
                        break;
                    } else {
                        try {
                            ProductVO pro2 = dao.read(code);
                            if (pro2.getPname() == null) {
                                System.out.println("삭제할 상품 X");
                            } else {
                                System.out.println("상품 이름 : " + pro2.getPname());
                                System.out.println("상품 가격 : " + df.format(pro2.getPprice()));
                                System.out.print("삭제(Y/y)?");
                                String sel = sc.nextLine();
                                if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
                                    dao.delete(code);
                                    System.out.println("삭제완료");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("상품삭제 오류" + e.toString());
                        }
                    }

                    break;
                case "6":
                    code = input("조회할상품코드");
                    if (code == 0) {
                        System.out.println("조회 종료");
                        break;
                    } else {
                        try {
                            ProductVO pro4 = dao.read(code);
                            if (pro4.getPname() == null) {
                                System.out.println("조회할 상품 X");
                            } else {
                                System.out.println("상품이름 : " + pro4.getPname());
                                System.out.println("상품가격 : " + df.format(pro4.getPprice()));
                                System.out.println("===========================================");
                                for (SaleVO vo : sdao.list(code)) {
                                    System.out.printf("%d\t%d\t%s\t%s\t%s\n",
                                            vo.getScode(), // 판매코드
                                            vo.getQnt(), // 판매갯수
                                            df.format(vo.getSprice()), // 판매가격
                                            df.format(vo.getQnt() * vo.getSprice()), // 전체가격
                                            sdf.format(vo.getSdate())); // 판매날짜
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("상품별 판매목록오류");
                        }
                    }
                    break;
                case "7":
                    code = input("등록할 상품코드");
                    if (code == 0) {
                        System.out.println("등록 종료");
                        break;
                    } else {
                        try {
                            ProductVO pro4 = dao.read(code);
                            if (pro4.getPname() == null) {
                                System.out.println("등록할 상품X");
                            } else {
                                System.out.println("상품이름 : " + pro4.getPname());
                                System.out.println("상품가격 : " + df.format(pro4.getPprice()));
                                System.out.println("===========================================");
                                int qnt = input("상품수량");
                                SaleVO svo = new SaleVO();
                                svo.setPcode(code);
                                svo.setQnt(qnt);
                                int sprice = input("판매가격");
                                if (sprice == 0)
                                    svo.setSprice(pro4.getPprice());
                                else
                                    svo.setSprice(sprice);
                                sdao.insert(svo);
                                System.out.println("판매등록완료");
                            }
                        } catch (Exception e) {
                            System.out.println("매출 등록오류" + e.toString());

                        }
                    }
                    break;
                case "8":
                    int sum_price = 0, sum_qnt = 0;

                    for (SaleVO vo : sdao.sum_list()) {
                        System.out.printf("%d\t%-20s\t%d\t%s\n",
                                vo.getPcode(),
                                vo.getPname(),
                                vo.getQnt(),
                                df.format(vo.getSprice()));
                        sum_price += vo.getSprice();
                        sum_qnt += vo.getQnt();
                    }
                    System.out.println("============================================");
                    System.out.printf("총판매수:%d\t총판매금액:%s\n",
                            sum_qnt, df.format(sum_price));
                    break;
                default:
                    System.out.println("메뉴를 다시 선택하세요!");
            }// switch
        } // while
    }// main

    public static int input(String title) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(title + "->");
            try {
                String str = sc.nextLine();
                if (str == "") {

                    return 0;
                } else {
                    return Integer.parseInt(str);
                }
            } catch (Exception e) {
                System.out.println("숫자로 입력해주세요");
            }
        }
    } // 가격입력메서드
}// Main
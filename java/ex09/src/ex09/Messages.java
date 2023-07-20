package ex09;

import java.util.*;
import java.text.*;

public class Messages {
    public static void run(UserVO uvo) {
        Scanner sc = new Scanner(System.in);
        MessageDAO ddao = new MessageDAO();
        UserDAO udao = new UserDAO();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean run = true;
        while (run) {
            System.out.println("\n**메시지관리**");
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.받은메시지 |2.보낸메시지 |3.메시지전송 |0.메인");
            System.out.println("--------------------------------------------------------------");
            uvo = udao.read(uvo.getId());

            System.out.printf("이름 : %s(%s)\t 포인트 : %d\n", uvo.getUname(), uvo.getId(), uvo.getPoint());
            System.out.print("선택 : ");
            String menu = sc.nextLine();
            switch (menu) {
                case "0":
                    System.out.println("메인으로 돌아갑니다");
                    run = false;
                    break;
                case "1":
                    System.out.println("***받은메시지***");
                    System.out.println("-------------------------------------------");
                    for (MessageVO vo : ddao.receiveList(uvo.getId())) {
                        System.out.printf("%d\t%s(%s)\t%s\t%s\n",
                                vo.getMid(), vo.getSender(),
                                vo.getUname(), sdf.format(vo.getSdate()),
                                vo.getMessage());
                        System.out.println("-------------------------------------------");
                    }
                    while (true) {
                        System.out.print("삭제할 받은 메시지 번호 : ");
                        String mid = sc.nextLine();
                        if (mid == "")
                            break;
                        System.out.print("삭제?(Y/y)");
                        String sel = sc.nextLine();
                        if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
                            ddao.receiveDel(Integer.parseInt(mid));
                            System.out.println("메시지 삭제완료");
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("***보낸메시지***");
                    System.out.println("-------------------------------------------");
                    for (MessageVO vo : ddao.sendList(uvo.getId())) {
                        System.out.printf("%d\t%s(%s)\t%s\t%s\n",
                                vo.getMid(), vo.getReceiver(),
                                vo.getUname(), sdf.format(vo.getSdate()),
                                vo.getMessage());
                        System.out.println("-------------------------------------------");
                    }
                    while (true) {
                        System.out.print("삭제할 보낸 메시지 번호 : ");
                        String mid = sc.nextLine();
                        if (mid == "")
                            break;
                        System.out.print("삭제?(Y/y)");
                        String sel = sc.nextLine();
                        if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
                            ddao.sendDel(Integer.parseInt(mid));
                            System.out.println("메시지 삭제완료");
                            break;
                        }
                    }
                    break;
                case "3":
                    while (true) {
                        System.out.println("***메시지전송***");
                        System.out.print("받을아이디 : ");
                        String receiver = sc.nextLine();
                        if (receiver == "") {
                            System.out.println("전송 취소");
                            break;
                        } else {
                            UserVO vo = udao.read(receiver);
                            if (vo.getUname() == null) {
                                System.out.println("아이디X");
                            } else {
                                MessageVO mvo = new MessageVO();
                                mvo.setSender(uvo.getId());
                                mvo.setReceiver(receiver);
                                System.out.print("메시지 : ");
                                String message = sc.nextLine();
                                if (message == "")
                                    System.out.println("전송 취소");
                                else {
                                    mvo.setMessage(message);
                                    ddao.insert(mvo);
                                    ddao.updatePoint(uvo.getId());
                                    System.out.println("메시지가 전송되었습니다.");
                                }
                                break;
                            }
                        }
                    }
                    break;

                default:
                    System.out.println("다시 선택");
                    break;
            }
        }
    }
}

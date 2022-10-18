package me.project.menu;

import me.project.exception.NumberRangeException;

import java.util.Scanner;

public abstract class Menu {
    public static Scanner  sc = new Scanner(System.in);
    public Menu() {
    }
    public static int displayMainMenu() {
        while(true) {
            try {
                System.out.println("==============================");
                System.out.println("1. 분류기준 설정 및 조회");
                System.out.println("2. 고객 정보");
                System.out.println("3. 고객 분류");
                System.out.println("4. EXIT");
                System.out.println("==============================");
                System.out.print("메뉴를 선택하시오 : ");
                int choice = Integer.parseInt(sc.next());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
                throw new NumberRangeException();
            } catch (NumberFormatException e) {
                System.out.println("잘못입력하셨습니다. 다시 입력하시오.");
                sc.next();
            } catch (NumberRangeException e) {
                System.out.println("유효하지 않은 번호입니다. 다시 입력하시오.");
                sc.next();
            }
        }

    }
}

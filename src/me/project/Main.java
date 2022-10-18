package me.project;



import me.project.customers.Customer;
import me.project.customers.Customers;
import me.project.groups.Grade;
import me.project.groups.Group;
import me.project.groups.Groups;
import me.project.groups.Parameter;
import me.project.menu.CustomerMenu;
import me.project.menu.ParameterMenu;
import me.project.menu.Menu;
import me.project.menu.SummaryMenu;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Customers.getInstance().add(new Customer("XXXX","je0000",5,50000));
        Customers.getInstance().add(new Customer("CCCC","je1111",10,100000));
        Customers.getInstance().add(new Customer("BBBB","je2222",15,150000));
        Customers.getInstance().add(new Customer("FFFF","je3333",20,200000));
        Customers.getInstance().add(new Customer("AAAA","je4444",25,250000));
        Customers.getInstance().add(new Customer("HHHH","je5555",30,300000));
        Customers.getInstance().add(new Customer("AAAA","je6666",35,350000));
        Customers.getInstance().add(new Customer("CCCC","je7777",40,400000));

        Group group1 = Groups.getInstance().find(Grade.GENERAL);
        Group group2 = Groups.getInstance().find(Grade.VIP);
        Group group3 = Groups.getInstance().find(Grade.VVIP);

        group1.setParameter(new Parameter(10,100000));
        group2.setParameter(new Parameter(20,200000));
        group3.setParameter(new Parameter(30, 300000));

        System.out.println("\n" + "==============================================================================================================================\n" +
                "     ██╗███████╗    ██╗    ██╗ ██████╗ ███╗   ██╗    ███████╗███████╗ ██████╗ ██╗  ██╗                                        \n" +
                "     ██║██╔════╝    ██║    ██║██╔═══██╗████╗  ██║    ██╔════╝██╔════╝██╔═══██╗██║ ██╔╝                                        \n" +
                "     ██║█████╗      ██║ █╗ ██║██║   ██║██╔██╗ ██║    ███████╗█████╗  ██║   ██║█████╔╝                                         \n" +
                "██   ██║██╔══╝      ██║███╗██║██║   ██║██║╚██╗██║    ╚════██║██╔══╝  ██║   ██║██╔═██╗                                         \n" +
                "╚█████╔╝███████╗    ╚███╔███╔╝╚██████╔╝██║ ╚████║    ███████║███████╗╚██████╔╝██║  ██╗                                        \n" +
                " ╚════╝ ╚══════╝     ╚══╝╚══╝  ╚═════╝ ╚═╝  ╚═══╝    ╚══════╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝                                        \n" +
                "                                                                                                                              \n" +
                "     ██╗ █████╗ ██╗   ██╗ █████╗     ████████╗ ██████╗ ██╗   ██╗    ██████╗ ██████╗  ██████╗      ██╗███████╗ ██████╗████████╗\n" +
                "     ██║██╔══██╗██║   ██║██╔══██╗    ╚══██╔══╝██╔═══██╗╚██╗ ██╔╝    ██╔══██╗██╔══██╗██╔═══██╗     ██║██╔════╝██╔════╝╚══██╔══╝\n" +
                "     ██║███████║██║   ██║███████║       ██║   ██║   ██║ ╚████╔╝     ██████╔╝██████╔╝██║   ██║     ██║█████╗  ██║        ██║   \n" +
                "██   ██║██╔══██║╚██╗ ██╔╝██╔══██║       ██║   ██║   ██║  ╚██╔╝      ██╔═══╝ ██╔══██╗██║   ██║██   ██║██╔══╝  ██║        ██║   \n" +
                "╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║       ██║   ╚██████╔╝   ██║       ██║     ██║  ██║╚██████╔╝╚█████╔╝███████╗╚██████╗   ██║   \n" +
                " ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝       ╚═╝    ╚═════╝    ╚═╝       ╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚════╝ ╚══════╝ ╚═════╝   ╚═╝   \n" +
                "                                                                                                                              \n" +
                "███████╗███╗   ███╗ █████╗ ██████╗ ████████╗    ███████╗████████╗ ██████╗ ██████╗ ███████╗                                    \n" +
                "██╔════╝████╗ ████║██╔══██╗██╔══██╗╚══██╔══╝    ██╔════╝╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝                                    \n" +
                "███████╗██╔████╔██║███████║██████╔╝   ██║       ███████╗   ██║   ██║   ██║██████╔╝█████╗                                      \n" +
                "╚════██║██║╚██╔╝██║██╔══██║██╔══██╗   ██║       ╚════██║   ██║   ██║   ██║██╔══██╗██╔══╝                                      \n" +
                "███████║██║ ╚═╝ ██║██║  ██║██║  ██║   ██║       ███████║   ██║   ╚██████╔╝██║  ██║███████╗                                    \n" +
                "╚══════╝╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚══════╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝                                    \n" +
                "==============================================================================================================================\n");
        while(true) {
            try {
                int choice = Menu.displayMainMenu();
                if (choice == 1) {
                    ParameterMenu.choiceParameterMenu();
                } else if (choice == 2) {
                    CustomerMenu.choiceCustomerMenu();
                } else if (choice == 3) {
                    SummaryMenu.choiceSummaryMenu();
                } else {
                    if(choice == 4) {
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
                    else {
                        System.out.println("올바른 번호를 입력해주세요.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.print("유효하지 않은 입력입니다. 다시 입력하세요.\n");
                Menu.sc.next();
            }
        }

    }
}

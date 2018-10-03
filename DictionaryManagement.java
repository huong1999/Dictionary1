package com.company;

import java.util.Scanner;

public class DictionaryManagement {
    public void insertFromCommandline(Word nhapTu) {
        Dictionary add = new Dictionary();

        Scanner scan = new Scanner(System.in);
        int i;
        System.out.print("So luong tu can nhap : ");
        int size = scan.nextInt();
        scan.nextLine();
        for(i=0;i<size;i++) {
            System.out.print("Nhap tu moi : ");

            String target = scan.nextLine();            //nhap tu tieng Anh
            nhapTu.setWord_target(target);

            System.out.print("Nhap nghia : ");

            String explain = scan.nextLine();           //nhap nghĩa tieng Viet
            nhapTu.setWord_explain(explain);
            //scan.close();
        }

    }
}

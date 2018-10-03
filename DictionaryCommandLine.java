package com.company;

public class DictionaryCommandLine extends Dictionary {
    public void showAllWord() {
        int i;
        System.out.println(" No         |English    |Vietnamese");
        for (i = 1; i <= this.list.size(); i++) {

            System.out.print(" " + (i));
            System.out.print("          |");
            System.out.print(list.get(i-1).getWord_target());
            System.out.print("         |");
            System.out.println(list.get(i-1).getWord_explain());

        }
    }

    public void dictionaryBasic() {

        Word keyword1 = new Word();

        DictionaryManagement input = new DictionaryManagement();
        
        input.insertFromCommandline(keyword1);      //goi ham nhap trong class DictionaryManagement
        addWord(keyword1);

        this.showAllWord();         //in ra tat ca cac tu da nhap
    }
}

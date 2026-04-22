package com.xworkx.methods;

public class Join {
    public static void main(String[] args) {
        String statement=String.join("--","we","are","doing","task");
        System.out.println(statement);
        String name="Romario";
        int position=6;

        String statement2=String.format(" batsman  %s comes at  position %d ",name,position);
        System.out.println(statement2);
    }
}

package org.suz;

public class TestStringBuilderBuffer {

    public static void main(String[] args) {
        // obj need
        String st = "suzanna"; // not modified and would print
        st.concat(" mizina"); // creat new obj and print st
        System.out.println(st);

        // no obj need it, not synchronize
        StringBuilder stb = new StringBuilder("java");
        stb.append(" suzanna");
        System.out.println(stb);

        // synchronise, no obj needs it
        StringBuffer stbf = new StringBuffer("java");
        stbf.append(" developer");
        System.out.println(stbf);
    }
}

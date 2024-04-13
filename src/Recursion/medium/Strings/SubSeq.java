package Recursion.medium.Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // subseq("", "abc");
        // subseqAscii("", "abc");
        // System.out.println(SubSeqRet("", "abc"));
        System.out.println(SubSeqAsciiRet("","abc"));
    } 
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
}

    static ArrayList<String> SubSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSeqRet(p+ch, up.substring(1));
        ArrayList<String> right = SubSeqRet(p, up.substring(1));

        left.addAll(right);
        return left;
}

static void subseqAscii(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    subseq(p+ch, up.substring(1));
    subseq(p, up.substring(1));    
    subseq(p + (ch+0), up.substring(1));

}


static ArrayList<String> SubSeqAsciiRet(String p, String up){
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> first = SubSeqRet(p+ch, up.substring(1));
    ArrayList<String> second = SubSeqRet(p, up.substring(1));
    ArrayList<String> third = SubSeqRet(p + (ch + 0 ), up.substring(1));


    first.addAll(second);
    first.addAll(third);
    return first;
}

}
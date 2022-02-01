class GFG {
    static void check(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch + "is upper case character");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch + "is lower case character");
        else
            System.out.println("\n" + ch + "is not alphabetic character");
    }

    public static void main(String[] args) {
        char ch;
        ch = 'A';
        check(ch);
        ch = 'a';
        check(ch);
        ch = '0';
        check(ch);
    }
}
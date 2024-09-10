class swapworld{
    public static void main(String[] args) {
        System.out.println("before swaping");
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping");
        System.out.println(a);
        System.out.println(b);
    }
}
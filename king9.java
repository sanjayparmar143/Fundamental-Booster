class king9{
    public static void main(String[] args) {

        int num = 20;
        int i, fact = 1;

        for (i = 1; i <= num; i++) {
            fact = i * fact;
        }
        System.out.println("Ans=" + fact);
    }
}
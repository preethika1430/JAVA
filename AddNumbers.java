class AddNumbers {

    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide two command line arguments.");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        add(x, y);
    }
}



class FloatAddition {
    static float getFirst() {
        return 2.5f;
    }

    static float getSecond() {
        return 3.5f;
    }

    public static void main(String[] args) {
        double sum = getFirst() + getSecond();
        System.out.println("Sum: " + sum);
    }
}

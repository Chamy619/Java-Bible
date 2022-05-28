class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            max = score[i] > max ? score[i] : max;
            min = score[i] < min ? score[i] : min;
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
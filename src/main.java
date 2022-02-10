public class main {
    public static void main(String[] args) {
        int[] array = new int[10000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)Math.floor(Math.random() * 1001);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        for (int i = 0; i < array.length; i++) {
            int indexMin = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}

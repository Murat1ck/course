public class Main {
    public static void main(String[] args) {
// напишите программу которая переворачивает массив
        int[] reverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = reverse.length - 1; i >= 0; i--){
            System.out.print(reverse[i]);
        }

    }
}
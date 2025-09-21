public class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        // Xóa phần tử đầu
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Chèn phần tử
        int x = 0;
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

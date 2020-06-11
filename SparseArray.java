public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11*11
        // 0：表示没有妻子，1表示黑子，2表示蓝子
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        for (int[] row : chessArr) {
            for (int num : row) {
                System.out.printf("%d\t", num);
            }
            System.out.println();
        }
    }
}
public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11*11
        // 0：表示没有妻子，1表示黑子，2表示蓝子
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[2][5] = 1;
        chessArr[3][3] = 2;
        for (int[] row : chessArr) {
            for (int num : row) {
                System.out.printf("%d\t", num);
            }
            System.out.println();
        }
        // 将二维数组转为稀疏数组
        int sum = 0;
        for (int[] row : chessArr) {
            for (int num : row) {
                if (num != 0) {
                    sum++;
                }
            }
        }
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr[0].length;
        sparseArr[0][2] = sum;
        int count = 1;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                    count++;
                }
            }
        }
        for (int[] row : sparseArr) {
            for (int num : row) {
                System.out.printf("%d\t", num);
            }
            System.out.println();
        }
        // 将稀疏数组恢复成原始数组
        // 根据稀疏数组创建原始数组
        int[][] oArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        // 遍历稀疏数组
        for (int i = 1; i < sparseArr.length; i++) {
            oArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println("原始数组：");
        for (int[] row : chessArr) {
            for (int num : row) {
                System.out.printf("%d\t", num);
            }
            System.out.println();
        }
    }
}
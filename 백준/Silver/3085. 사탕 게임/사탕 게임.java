import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int N, maxCount;
    static char[][] board;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }
        maxCount = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N && board[i][j] != board[i][j + 1]) {
                    swap(i, j, i, j + 1);
                    checkBoard();
                    swap(i, j, i, j + 1);
                }
                if (i + 1 < N && board[i][j] != board[i + 1][j]) {
                    swap(i, j, i + 1, j);
                    checkBoard();
                    swap(i, j, i + 1, j);
                }
            }
        }
        System.out.println(maxCount);
    }
    
    static void swap(int i1, int j1, int i2, int j2) {
        char temp = board[i1][j1];
        board[i1][j1] = board[i2][j2];
        board[i2][j2] = temp;
    }
    
    static void checkBoard() {
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (board[i][j] == board[i][j - 1]) count++;
                else {
                    if (count > maxCount) maxCount = count;
                    count = 1;
                }
            }
            if (count > maxCount) maxCount = count;
        }
        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (board[i][j] == board[i - 1][j]) count++;
                else {
                    if (count > maxCount) maxCount = count;
                    count = 1;
                }
            }
            if (count > maxCount) maxCount = count;
        }
    }
}

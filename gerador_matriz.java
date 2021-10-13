import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int greattest = 0, getPillar = 0, getLine = 0;
        Scanner getScan = new Scanner(System.in);
        
        System.out.print("Digite o valor de m: ");
        int pillar = getScan.nextInt();

        System.out.print("Digite o valor de n: ");
        int line = getScan.nextInt();

        if(pillar > 0 && line > 0) {
            int[][] matrix = new int[pillar][line];

            for(int setPillar = 0; setPillar < pillar; ++setPillar)
                for(int setline = 0; setline < line; ++setline) {
                    System.out.printf("Digite o valor na posição [%d][%d]: ", setPillar + 1, setline + 1);
                    matrix[setPillar][setline] = getScan.nextInt();
                    if((setPillar == 0 && setline == 0) || greattest < matrix[setPillar][setline]) {
                        greattest = matrix[setPillar][setline];
                        getPillar = setPillar + 1;
                        getLine = setline + 1;
                    }
                }
        }
        System.out.printf("O maior valor está na posicao [%d][%d] e é %d", getPillar, getLine, greattest);
        
        getScan.close();
    }
}

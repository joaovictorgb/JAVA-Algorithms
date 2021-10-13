import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String nome;
		Scanner getScan = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = getScan.next();
		System.out.printf("A palavra %s tem o total de %d vogais", nome, retornarVogais(nome));
		getScan.close();
	}

public static int retornarVogais(String nome) {
int num = 0;
for(char c : nome.toCharArray()) {a
if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
++num;
}
return num;
}
}

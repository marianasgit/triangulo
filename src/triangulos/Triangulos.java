package triangulos;

import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int ladoA, ladoB, ladoC;
		
		System.out.print("Qual a medida do lado A?");
		ladoA = leitor.nextInt();
		System.out.print("Qual a medida do lado B?");
		ladoB = leitor.nextInt();
		System.out.print("Qual a medida do lado C?");
		ladoC = leitor.nextInt();
		
		leitor.close();
		
		if (ladoA + ladoB < ladoC || ladoB + ladoC < ladoA || ladoA + ladoC < ladoB){
			System.out.println("As medidas inseridas n�o caracterizam um triangulo");
		} else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Os n�meros representam um triangulo equil�tero!");
		} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			System.out.println("Os n�meros representam um triangulo is�sceles!");
		}else {
			System.out.println("Os n�meros representam um triagulo escaleno!");
		}
		
		
	}

}

public class TESTE2 {

public static void main(String args[]) {
    String[] cursos;
    cursos = new String[2];
    cursos[0] = "Sistemas";
    cursos[1] = "Internet";

    double[][] notas = new double[2][4];
    notas[0][0] = 8.0;
    notas[0][1] = 7.5;
    notas[0][2] = 9.0;
    notas[0][3] = 8.5;
    notas[1][0] = 9.5;
    notas[1][1] = 8.5;
    notas[1][2] = 8.0;
    notas[1][3] = 9.0;

    double media = 0.0;

    System.out.println("\n");
    System.out.println("MEDIAS:");

    for(int l=0; l<notas.length; l++) {
		for(int c=0; c<notas[l].length; c++) {
			   media = media + notas[l][c];
		   }

		   media = media/4;

		   System.out.println(cursos[l] + " = " + media);
		   media = 0;
	   }
	   System.out.println("\n");
    }
}
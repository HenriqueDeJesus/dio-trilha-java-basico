// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        // Condição Ternária
        int notaDois = 6;
        String resultado = notaDois >=7 ? "Aprovado" : notaDois >=5 && notaDois <7 ? "Recuperação" : "Reprovado";
        System.out.println("Operação Dois: " + resultado);
    }
}
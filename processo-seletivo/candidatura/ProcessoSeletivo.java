package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;


public class ProcessoSeletivo {
    public static void main(String[] args){
        System.out.println("Processo Seletivo");
        System.out.println("-- Seleção de Candidatos --");
        selecaoCandidatos();

        System.out.println("-- Imprimir Candidatos --");
        imprimirCandidatos();

        String [] candidatos = {"FELIPE", "MIRELA", "JOÃO", "MÁRCIA", "AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }  
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu;
        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if (continuarTentando = true){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
            }
        }while (continuarTentando && tentativasRealizadas<3); {}
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA" + tentativasRealizadas);
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS REALIZADAS.");
        }
    }

    static void imprimirCandidatos(){
        String [] candidatos = {"FELIPE", "MIRELA", "JOÃO", "MÁRCIA", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MIRELA", "JOÃO", "MÁRCIA", "AUGUSTO", "DANIELA", "FABIANA", "PAULO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            double salarioBase = 2000.0;

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

}

import java.util.Scanner;

public class GestaoSubmarino{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double repasse;
        String acesso, pais;
        int erro = 0;
        
        //situação 1
        
        System.out.println("Insira o valor de repasse anual em bilhões");
        repasse = sc.nextDouble();

        if(repasse < 0.5){
            System.out.println("ALERTA: Risco de paralisação total. Data estimada: 2045");
        }else if(repasse <= 1.0 && repasse >= 0.5 ){
            System.out.println("Ritmo lento: Finalização prevista para 2037");
        }else{
            System.out.println("Projeto acelerado: Possibilidade de antecipação da entrega");
        }

        //situação 2

        System.out.println("seu nível de acesso é TOTAL? [sim ou não]");
        acesso = sc.next();
        
        System.out.println("seu código de país é Brasil? [sim ou não");
        pais = sc.next();

        if(!acesso.equalsIgnoreCase("sim") && !pais.equalsIgnoreCase("sim") ){
            System.out.println("ACESSO NEGADO: Soberania Nacional preservada. Dados criptografados");
             erro++;
        }
        
        //situação 3

        if(erro == 0){
         System.out.println("Qual a temperatura do reator?");
         double temp = sc.nextDouble();
         if(temp < 280){
            System.out.println("Aumentar potência do reator");
         }else if(temp >= 280 && temp <= 350){
            System.out.println("Operação Normal - Cruzeiro");
         }else{
            System.out.println("EMERGÊNCIA: Acionar sistema de resfriamento e emergência");
         }

        }else{
            System.out.println("");
        }

        

        



      sc.close();
         


        

    }
}
package flamingo.java.aprendendo.basico;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrimeiroExercicios {
    public static void main(String[] args) {
        /*Eu <nome>, morando no endereço <endereço>, confirmo o salário de <salario> na data de Hoje <data> */

        String nome = "Gabriel";
        String municipio = "São Paulo";

        float salario = 9445.5f;

        LocalDate hoje = LocalDate.now();

//Formatar a data para o padrão Brasileiro
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = hoje.format(formatoBr);
        System.out.printf("Eu %s, morando no endereço %s, confirmo o salário de R$ %.2f na data de Hoje %s%n",
                nome, municipio, salario, dataFormatada);




    }
}

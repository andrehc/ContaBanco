import Banco.Agencia;
import Banco.Conta;
import Cliente.Cliente;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta = new Conta();
        Agencia agencia = new Agencia();
        Cliente cliente = new Cliente();
        Random random = new Random();
        System.out.print("Bem vindo ao Dio Bank\nDigita aqui o seu nome aqui: ");
        String nomeCliente = entrada.nextLine();

        cliente.setNome(nomeCliente);

        int numeroAgenciaRandom = random.nextInt(10000);
        int digitoAgenciaRandom = random.nextInt(9);

        agencia.setAgencia(String.format("%4d-%d", numeroAgenciaRandom, digitoAgenciaRandom));

        int numeroConta = random.nextInt(100000);

        conta.setNumeroConta(numeroConta);

        int digitoConta = random.nextInt(9);

        conta.setDigitoConta(digitoConta);


        float saldoConta  = (random.nextFloat(10000000) * 100) / 100.0f;

        conta.setSaldo(saldoConta);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco!\n" +
            "Sua agência é %s, conta %03d-%d e seu saldo $%s já está disponível para saque! ",
            cliente.getNome(), agencia.getAgencia(), conta.getNumeroConta(), conta.getDigitoConta(), conta.getSaldo()
        );

    }
}
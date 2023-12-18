public class Programa {
    public static void main(String args[]) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Misael");
        pessoaFisica.setSobrenome("Campos");
        pessoaFisica.setCpf("451.123.568-79");
        System.out.println("Cliente " + pessoaFisica.getNome() + " é portador do CPF: " + pessoaFisica.getCpf() + ".");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Auto Elétrica Brasil");
        pessoaJuridica.setCnpj("12.345.678/0001-00");
        System.out.println("Cliente " + pessoaJuridica.getNome() + " é portador do CNPJ: " + pessoaJuridica.getCnpj() + ".");
    }
}

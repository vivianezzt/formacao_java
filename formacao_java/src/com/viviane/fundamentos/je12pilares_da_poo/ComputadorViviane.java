package com.viviane.fundamentos.je12pilares_da_poo;

public class ComputadorViviane {
    public static void main(String[] args) {
        SistemaDeMensagemInstantanea smi = null;
        String appEscolhido = "tlg"; // msn, fbm, ou tlg

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessager();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();
        else {
            System.out.println("⚠️ Nenhum aplicativo válido foi selecionado.");
            return;
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}

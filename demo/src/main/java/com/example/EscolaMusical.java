package com.example;


public class EscolaMusical {
    public static void main(String[] args) {

        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new bateria("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new saxofone("Saxofone", "Latão", "Alto");

        EscolaMusical escola = new EscolaMusical();
        escola.apresentar(banda);
    }

    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("=== A ORQUESTRA VAI COMEÇAR! ===");
        System.out.println("--- Afinando os instrumentos ---");

        // Afinar todos
        for (InstrumentoMusical inst : banda) {
            inst.afinar();
            System.out.println();
        }

        System.out.println("\n--- Instrumentos começaram a tocar ---");
        for (InstrumentoMusical inst : banda) {
            inst.tocar();
            System.out.println();
        }

        System.out.println("\n----- Mostrando informações dos Instrumentos -----");
        for (int i = 0; i < banda.length; i++) {
            System.out.println("\nInstrumento musical " + (i + 1) + " :");
            banda[i].mostrarInformaçoes();
        }
    }
}

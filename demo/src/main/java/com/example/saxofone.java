package com.example;

public class saxofone extends InstrumentoMusical {
    private String tipo;
    
    public saxofone(String nome, String material, String tipo) {
            super(nome, material);
            this.tipo = tipo;
        }

    @Override
    public void tocar(){
        System.out.println("Tocando jazz suave no " + super.getNome() + " " + tipo + "...");
        System.out.println("Melodia envolvente de saxofone");
    }

    @Override
    public  void afinar()
    {
        super.afinar();
        System.out.println("Ajustando a embocadura e as chaves do saxofone...");
    }

    @Override
    public void mostrarInformaçoes() {
        super.mostrarInformaçoes();
        System.out.println("Tipo: " + tipo);
    }
}
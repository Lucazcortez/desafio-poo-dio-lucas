package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargahoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }
    public Curso(){
            }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    
}


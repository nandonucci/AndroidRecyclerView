package fiap.com.br.recyclerview;

/**
 * Created by logonrm on 24/04/2018.
 */

public class Contato {
    private String nome;
    private String telefone;
    private String status;
    private int imagem;

    public Contato() {
    }

    public Contato(String nome, String telefone, String status, int imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

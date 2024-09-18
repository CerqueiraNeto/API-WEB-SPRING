package jose.web.api.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

public class Usuario {
    private Long cpf;
    private String nome;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate data_nascimento;

    public Usuario() {}
    public Usuario(Long cpf, String nome, LocalDate data_nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
    }
    @Override
    public String toString(){
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", data de nascimento='" + data_nascimento + '\'' +
                '}';
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}

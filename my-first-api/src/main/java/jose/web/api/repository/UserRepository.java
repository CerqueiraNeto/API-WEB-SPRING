package jose.web.api.repository;

import jose.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    // Lista persistente de usuários
    private List<Usuario> usuarios = new ArrayList<>();

    public void save(Usuario usuario) {
        if (usuario.getCpf() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        usuarios.add(usuario);
        System.out.println("Usuário adicionado à lista: " + usuario);
    }

    public List<Usuario> findAll() {
        return usuarios;
    }
}

package br.com.pratica.login.controller;

import br.com.pratica.login.entity.Usuario;
import br.com.pratica.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping()
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        System.out.println(usuario.getNome()+"------------------------------------------------");
        return usuarioRepository.save(usuario);
    }
}

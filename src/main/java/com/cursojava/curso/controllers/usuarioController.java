package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class usuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value =  "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("De Palma");
        usuario.setEmail("juancarlos@gmail.com");
        usuario.setTelefono("1139342314");
        usuario.setPassword("tumama");
        usuario.setId(id);
        return usuario;
    }

    @RequestMapping(value =  "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value =  "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario) {


        usuario.getPassword();
        
        usuarioDao.registrar(usuario);

    }

    @RequestMapping(value =  "usuario/112312312")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("De Palma");
        usuario.setEmail("juancarlos@gmail.com");
        usuario.setTelefono("1139342314");
        usuario.setPassword("tumama");
        return usuario;
    }

    @RequestMapping(value =  "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
    }

    @RequestMapping(value =  "usuario/0120")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("De Palma");
        usuario.setEmail("juancarlos@gmail.com");
        usuario.setTelefono("1139342314");
        usuario.setPassword("tumama");
        return usuario;
    }

}

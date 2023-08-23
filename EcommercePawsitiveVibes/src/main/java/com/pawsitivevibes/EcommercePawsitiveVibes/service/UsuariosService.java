package com.pawsitivevibes.EcommercePawsitiveVibes.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsitivevibes.EcommercePawsitiveVibes.model.Productos;
import com.pawsitivevibes.EcommercePawsitiveVibes.model.Usuarios;

@Service
public class UsuariosService {
	
		public final ArrayList<Usuarios> lista = new ArrayList<>();
		@Autowired
		public UsuariosService() {
			lista.add(new Usuarios("Diego", "3321092647", "diego@gmail.com", "Hola123@", "imagen1.png"));
			lista.add(new Usuarios("Mariel", "5558587454", "mariel@gmail.com", "Mariel123", "imagen2.png"));
			lista.add(new Usuarios("Adonis", "3515484874", "adonis@gmail.com", "Adonis123", "imagen3.png"));

		}
		
		public List<Usuarios> getAllUsuarios() {
			return this.lista;
		}
		
		public Usuarios getUsuario(Long id) {
			Usuarios tmp = null;
			for(Usuarios usuario : lista) {
				if(usuario.getId().equals(id)) {
					tmp=usuario;
					break;
				}
			}
			return tmp;
		}
		public Usuarios deleteUsuario(Long id) {
		 Usuarios tmp = null;
			for (Usuarios usuario : lista) {
				if(usuario.getId().equals(id)) {
					tmp=lista.remove(lista.indexOf(usuario));
					break;
				}
			}
			return tmp;
		}
		
		public Usuarios addUsuario(Usuarios usuario) {
			lista.add(usuario);
			return usuario;
		}
		
		
		public  Usuarios updateUsuario(Long id, String nombre, String telefono, String correo, String contrasena,
				String imagen) {
			Usuarios tmp = null;
			for(Usuarios usuario : lista) {
				if(usuario.getId().equals(id)) {
					if(nombre!=null) usuario.setNombre(nombre);
					if(telefono!=null) usuario.setTelefono(telefono);
					if(correo!=null) usuario.setCorreo(correo);
					if(contrasena!=null) usuario.setContrasena(contrasena);
	
					tmp=usuario;
					break;
				}
			}
			return tmp;
		}
	}



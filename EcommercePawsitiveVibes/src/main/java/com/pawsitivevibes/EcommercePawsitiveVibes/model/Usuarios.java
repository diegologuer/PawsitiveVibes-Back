package com.pawsitivevibes.EcommercePawsitiveVibes.model;

public class Usuarios {
	
	private Long id;
	private String nombre;
	private String telefono;
	private String correo;
	private String contrasena;
	private String imagen;
	
	private static long total= 0;

	public Usuarios(String nombre, String telefono, String correo, String contrasena, String imagen) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.contrasena = contrasena;
		this.imagen = imagen;
		Usuarios.total++;
		this.id = Usuarios.total;
	}
	
	public Usuarios() {
		Usuarios.total++;
		this.id = Usuarios.total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		Usuarios.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo
				+ ", contrasena=" + contrasena + ", imagen=" + imagen + "]";
	}
	
	
	
	
	

}

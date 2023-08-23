package com.pawsitivevibes.EcommercePawsitiveVibes.model;



public class Productos {

	private Long id;
	private String titulo;
	private String categoria;
	private Integer numStock;
	private String marca;
	private String descripcion;
	private String seccion;
	private Integer descuento;
	private Double precio;
	private String imagen;
	
	private static long total= 0;

	public Productos(String titulo, String categoria, Integer numStock, String marca, String descripcion,
			String seccion, Integer descuento, Double precio, String imagen) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.numStock = numStock;
		this.marca = marca;
		this.descripcion = descripcion;
		this.seccion = seccion;
		this.descuento = descuento;
		this.precio = precio;
		this.imagen = imagen;
		Productos.total++;
		this.id = Productos.total;
		}
	
	public Productos() {
		Productos.total++;
		this.id = Productos.total;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getNumStock() {
		return numStock;
	}

	public void setNumStock(Integer numStock) {
		this.numStock = numStock;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
		Productos.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", numStock=" + numStock
				+ ", marca=" + marca + ", descripcion=" + descripcion + ", seccion=" + seccion + ", descuento="
				+ descuento + ", precio=" + precio + ", imagen=" + imagen + "]";
	}
	
	
	
	
	
	
	
}

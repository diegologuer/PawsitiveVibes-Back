package com.pawsitivevibes.EcommercePawsitiveVibes.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pawsitivevibes.EcommercePawsitiveVibes.model.Productos;

@Service
public class ProductoService {
	
		public final ArrayList<Productos> lista = new ArrayList<>();
		@Autowired
		public ProductoService() {
			lista.add(new Productos("Comida de Perro", "Alimento", 50, "Pedigree", "Comida para perro mediano", "Perros", 10, 500.00, "croquetas.png" ));			
			lista.add(new Productos("Comida de gato", "Alimento", 48, "Wiskas", "Comida para gato adulto", "Gatos", 20, 150.00, "comidaGato.png" ));			
			lista.add(new Productos("Juguete para gato", "Juguete", 20, "Nupec", "Juguete en forma de ratón para gato", "Gatos", 30, 350.00, "jugueteGato.png" ));			
			
		}
		public List<Productos> getAllProductos() {
			return this.lista;
		}
		public Productos getProducto(Long id) {
			Productos tmp = null;
			for(Productos producto : lista) {
				if(producto.getId().equals(id)) {
					tmp=producto;
					break;
				}
			}
			return tmp;
		}
		public Productos deleteProducto(Long id) {
			Productos tmp = null;
			for(Productos producto : lista) {
				if(producto.getId().equals(id)) {
					tmp=lista.remove(lista.indexOf(producto));
					break;
				}
			}
			return tmp;
		}
		
		public Productos addProducto(Productos producto) {
			lista.add(producto);
			return producto;
		}
		
		public Productos updateProduct(Long id, String titulo, String categoria, Integer numStock, String marca,
				String descripcion, String seccion, Integer descuento, Double precio, String imagen) {
			Productos tmp = null;
			for(Productos producto : lista) {
				if(producto.getId().equals(id)) {
					if(titulo!=null) producto.setTitulo(titulo);
					if(categoria!=null) producto.setCategoria(categoria);
					if(numStock!=null) producto.setNumStock(numStock);
					if(marca!=null) producto.setMarca(marca);
					if(descripcion!=null) producto.setDescripcion(descripcion);
					if(seccion!=null) producto.setSeccion(seccion);
					if(descuento!=null) producto.setDescuento(descuento);
					if(precio!=null) producto.setPrecio(precio);
					if(imagen!=null) producto.setImagen(imagen);
					
					tmp=producto;
					break;
				}
			}
			return tmp;
		}
	}



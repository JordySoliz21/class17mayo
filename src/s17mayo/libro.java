package s17mayo;

public class libro {
private String nombre;
private String editorial;
private int año;
private String autor;
public libro(String nombre, String editorial, int año, String autor) {
	super();
	this.nombre = nombre;
	this.editorial = editorial;
	this.año = año;
	this.autor = autor;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public int getAño() {
	return año;
}
public void setAño(int año) {
	this.año = año;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}

}

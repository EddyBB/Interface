package clases;

public interface MiniList {

	public boolean add(Object elemento) throws NullPointerException;
	
	public boolean contain(Object elemento);
	
	public boolean delete(Object elemento);
	
	public boolean delete(int elemento);
	
	public void addPosicion();
	
	public void devolver();
	
	public void size();
	
	public void clear();
	
}

package persistence;

public interface DAO<T>{

	public T read(String id);
	
	public boolean update (String id);
	
	public boolean delete(String id);
	
	public boolean add(T Event);

}

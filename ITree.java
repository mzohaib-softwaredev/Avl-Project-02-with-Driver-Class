package trees;


public interface ITree<T> {
   public T getItem();
   public ITree<T> find(T item);
   public ITree<T> insert(T item);
}
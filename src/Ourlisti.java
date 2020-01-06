public interface Ourlisti<E extends Object> {
    public int size();

    public void add(E element);

    public E get(int getIndex);

    //look for and return array position
    public int find(E searchFor) throws Exception;

    //check size of internal Object data array
    public int checkCapasity();

    //extend the internal data array by 100%
    public void grow();


}

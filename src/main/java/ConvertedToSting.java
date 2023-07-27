public interface ConvertedToSting<T> {
    public String Convert(T data);
    public T Parse(String data);

}

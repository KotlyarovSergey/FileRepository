public interface GenerateID<T> {
    public int toInteger(T id);

    public T toUserType(int id);
}

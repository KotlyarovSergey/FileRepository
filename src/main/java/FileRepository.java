import java.util.Map;

public class FileRepository<I extends GenerateID<I>, E extends ConvertedToSting<E>> {
    private String fileName;
    private Map<I, E> data;

    public FileRepository(String fileName) {
        this.fileName = fileName;

        // если файл существует
            // считать и заполнить из него data
        // если нет
            // создать пустой файл и пустую data

    }

//    Create
    public I add(E element){
        // сгенерировать уникальный Id
        int id = generateID();

        // добавить в data

        // записать data в файл

        // при успешной записи вернуть id, иначе null
        return null;
    }


//    Read
    public E read(I id){
        // найти элемент по id в data

        // вернуть если нашли
        return null;
    }

//    Update
    public boolean update(I id, E value){
        // найти в data элемент по id

        // если есть
            // заменить, перезаписать файл и вернуть true

        // если нет или запись не удалась
            // вернуть false
        return false;
    }

//    Delete
    public boolean delete(I id){
        // найти в data элемент по id

        // если есть
            // удалить из data, перезаписать файл и вернуть true

        // если нет или запись не удалась
            // вернуть false
        return false;
    }

    private int generateID(){
        return 0;
    }


    private boolean readFileToMap(){


        return false;
    }

    private boolean writeMapToFile(){

        return false;
    }



}

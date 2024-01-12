package dao;

import java.util.List;

/**
 *
 * @author @VHSkirik
 */
public interface DAOInterface<T> {

    public T findOne(int id);

    public int create(T t);

    public int update(T t, int id);

    public int delete(int id);

    public List<T> findALl();

}

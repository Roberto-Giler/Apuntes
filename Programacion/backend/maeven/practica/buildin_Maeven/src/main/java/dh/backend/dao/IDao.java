package dh.backend.dao;

import java.util.List;

public interface IDao<T> {

    T Registrar(T t);
    T BucarPorId(int id);
    List<T> buscarTodos();
    T DardeAlta(T t);

}

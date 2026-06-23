package service;

import model.Identificable;
import java.util.Collection;
import java.util.Optional;

public class Buscador<T extends Identificable<K>, K> {

    public Optional<T> buscarPorId(Collection<T> coleccion, K id) {
        for (T elemento : coleccion) {
            if (elemento.getID().equals(id)) {
                return Optional.of(elemento);
            }
        }
        return Optional.empty();
    }
}
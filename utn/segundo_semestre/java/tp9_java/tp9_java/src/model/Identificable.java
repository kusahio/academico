package model;

public interface Identificable<K> {
    K getID();
    void setID(K id);
}
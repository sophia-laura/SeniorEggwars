package net.seniorteam.eggwars.database;

public interface Crud<T> {

    void create(T t);

    void update(T t);

    void delete(T t);

}

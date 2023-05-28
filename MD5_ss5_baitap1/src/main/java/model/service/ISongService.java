package model.service;

import model.enity.SongName;

import java.util.List;

public interface ISongService {
    List<SongName> findAll();

    SongName findById(int id);

    void deleteById(int id);

    void save(song customer);
}

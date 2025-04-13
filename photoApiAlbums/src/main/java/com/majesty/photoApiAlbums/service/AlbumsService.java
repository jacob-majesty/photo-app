package com.majesty.photoApiAlbums.service;

import com.majesty.photoApiAlbums.data.AlbumEntity;

import java.util.List;

public interface AlbumsService {
    List<AlbumEntity> getAlbums(String userId);
}

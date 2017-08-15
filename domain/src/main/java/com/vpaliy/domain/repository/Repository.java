package com.vpaliy.domain.repository;

import com.vpaliy.domain.model.Playlist;
import com.vpaliy.domain.model.Track;
import com.vpaliy.domain.model.User;
import com.vpaliy.domain.model.UserDetails;

import java.util.List;
import io.reactivex.Single;

public interface Repository {
    Single<List<Track>> getTracksBy(List<String> categories);
    Single<List<Playlist>> getPlaylistsBy(List<String> categories);
    Single<List<User>> getUsersBy(List<String> categories);
    Single<UserDetails> getUserBy(String id);
    Single<Track> getTrackBy(String id);
    Single<Playlist> getPlaylistBy(String id);
}
package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.GenreMapper;
import com.shiki.zongyue.pojo.Genre;
import com.shiki.zongyue.pojo.GenreExample;
import com.shiki.zongyue.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenreServiceImpl implements GenreService {


    @Autowired
    private GenreMapper genreMapper;

    @Override
    public void add(Genre genre) {

    }

    @Override
    public List list() {
        GenreExample genreExample = new GenreExample();
        return genreMapper.selectByExample(genreExample);
    }


    @Override
    public Genre get(int genre_id) {
        return genreMapper.selectByPrimaryKey(genre_id);
    }
}

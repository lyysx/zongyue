package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.EnumForState.FictionOrderBy;
import com.shiki.zongyue.EnumForState.FictionState;
import com.shiki.zongyue.mapper.AuthorMapper;
import com.shiki.zongyue.mapper.FictionMapper;
import com.shiki.zongyue.mapper.GenreMapper;
import com.shiki.zongyue.pojo.Author;
import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.pojo.FictionExample;
import com.shiki.zongyue.pojo.Genre;
import com.shiki.zongyue.service.FictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FictionServiceImpl implements FictionService {


    @Autowired
    private FictionMapper fictionMapper;

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private GenreMapper genreMapper;



    @Override
    public void add(Fiction fiction) {
        fictionMapper.insertSelective(fiction);
    }

    @Override
    public void update(Fiction fiction) {
        fictionMapper.updateByPrimaryKeySelective(fiction);
    }

    @Override
    public void delete(int fiction_id) {

    }

    @Override
    public Fiction get(int fiction_id) {
        Fiction fiction = fictionMapper.selectByPrimaryKey(fiction_id);
        setAuthor(fiction);
        setGenre(fiction);
        return fiction;
    }

    @Override
    public List<Fiction> list(FictionState fictionState, FictionOrderBy orderBy) {
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andFiction_stateEqualTo(fictionState.getValue());
        fictionExample.setOrderByClause(orderBy.getOrderBy());
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        setAuthor(fictions);
        return fictions;
    }

    @Override
    public List<Fiction> list() {
        FictionExample fictionExample = new FictionExample();
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        setAuthor(fictions);
        return fictions;
    }

    public void setAuthor(Fiction fiction) {
        int author_id = fiction.getAuthor_id();
        Author author = authorMapper.selectByPrimaryKey(author_id);
        fiction.setAuthor(author);
    }

    public void setAuthor(List<Fiction> fictions) {
        for (Fiction fiction : fictions) {
            setAuthor(fiction);
        }
    }

    public void setGenre(Fiction fiction) {
        int genre_id = fiction.getGenre_id();
        Genre genre = genreMapper.selectByPrimaryKey(genre_id);
        fiction.setGenre(genre);
    }

    public void setGenre(List<Fiction> fictions) {
        for (Fiction fiction : fictions) {
            setGenre(fiction);
        }
    }

    @Override
    public List<Fiction> listByAuthor(int author_id) {
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andAuthor_idEqualTo(author_id);
        fictionExample.setOrderByClause("fiction_id desc");
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        return fictions;
    }

    @Override
    public List<Fiction> listByGenre(int genre_id) {
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andGenre_idEqualTo(genre_id).andFiction_stateGreaterThanOrEqualTo(FictionState.ON_SHELVES.getValue());
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        setAuthor(fictions);
        return fictions;
    }

    @Override
    public List<Fiction> list(FictionState fictionstate) {
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andFiction_stateEqualTo(fictionstate.getValue());
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        setAuthor(fictions);
        return fictions;
    }

    @Override
    public List<Fiction> list(int genre_id, FictionState fictionstate) {
        if (genre_id == 0) {
            return list(fictionstate);
        }
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andGenre_idEqualTo(genre_id).andFiction_stateEqualTo(fictionstate.getValue());
        List<Fiction> fictions = fictionMapper.selectByExample(fictionExample);
        setGenre(fictions);
        setAuthor(fictions);
        return fictions;
    }

    @Override
    public List<Fiction> topTenFictions() {
        return fictionMapper.topTenFictions();
    }

    @Override
    public List<Fiction> listAll(boolean isRanked) {
        FictionExample fictionExample = new FictionExample();
        fictionExample.createCriteria().andFiction_stateGreaterThanOrEqualTo(1);
        if (isRanked) {
            fictionExample.setOrderByClause("fiction_recommend desc");
        }
        List<Fiction> list = fictionMapper.selectByExample(fictionExample);
        setAuthor(list);
        setGenre(list);
        return list;
    }
}

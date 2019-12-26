package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.EnumForState.ChapterOrderBy;
import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.mapper.ChapterMapper;
import com.shiki.zongyue.pojo.Chapter;
import com.shiki.zongyue.pojo.ChapterExample;
import com.shiki.zongyue.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChapterServiceImpl implements ChapterService {


    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public Chapter get(int chapter_id) { return chapterMapper.selectByPrimaryKey(chapter_id); }

    @Override
    public List<Chapter> list(int fiction_id, ChapterState state, ChapterOrderBy orderBy) {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andFiction_idEqualTo(fiction_id).andChapter_stateEqualTo(state.getStatus());
        chapterExample.setOrderByClause(orderBy.getOrderBy());
        return chapterMapper.selectByExample(chapterExample);
    }

    @Override
    public Integer getFirstChapterID(int fiction_id) {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andFiction_idEqualTo(fiction_id);
        chapterExample.setOrderByClause("chapter_id asc");
        List<Chapter> chapters = chapterMapper.selectByExample(chapterExample);
        if (chapters.isEmpty()) {
            return null;
        }
        return chapters.get(0).getChapter_id();
    }

    @Override
    public void add(int fiction_id) {
        Chapter chapter = new Chapter();
        chapter.setFiction_id(fiction_id);
        chapterMapper.insertSelective(chapter);
    }

    @Override
    public int count(int fiction_id, ChapterState state) {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andFiction_idEqualTo(fiction_id).andChapter_stateEqualTo(state.getStatus());
        return chapterMapper.selectByExample(chapterExample).size();
    }

    @Override
    public void delete(int chapter_id) {
        chapterMapper.deleteByPrimaryKey(chapter_id);
    }

    @Override
    public void update(Chapter chapter) {
        chapterMapper.updateByPrimaryKeySelective(chapter);
    }

    @Override
    public Integer getNextChapterID(int fiction_id, int chapter_id) {
        return chapterMapper.getNextChapterID(fiction_id, chapter_id);
    }

    @Override
    public Integer getPreviousChapterID(int fiction_id, int chapter_id) {
        return chapterMapper.getPreviousChapterID(fiction_id, chapter_id);
    }

    @Override
    public Integer getStartChapterID(int fiction_id, Integer user_id) {
        if (null != user_id) {
            Integer result = chapterMapper.getStartChapterID(fiction_id, user_id);
            if (null != result) {
                return result;
            }
        }
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andFiction_idEqualTo(fiction_id).andChapter_stateEqualTo(ChapterState.PUBLISHED.getStatus());
        chapterExample.setOrderByClause(ChapterOrderBy.CHAPTER_ASC.getOrderBy());
        List<Chapter> chapters = chapterMapper.selectByExample(chapterExample);
        if (chapters.isEmpty()) {
            return null;
        }
        return chapters.get(0).getChapter_id();

    }

}

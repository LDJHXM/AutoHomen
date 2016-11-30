package com.l000phone.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by DJ on 2016/11/30.
 */
@Entity
public class HotMenuEntity {

    @Id(autoincrement = true)
    private Long id;
    private String tab;
    private String Cover;
    private String Title;
    private String UserName;
    private String LikeCount;
    private String CreateTime;
    private String RecipeId;
    @Generated(hash = 440947695)
    public HotMenuEntity(Long id, String tab, String Cover, String Title,
            String UserName, String LikeCount, String CreateTime, String RecipeId) {
        this.id = id;
        this.tab = tab;
        this.Cover = Cover;
        this.Title = Title;
        this.UserName = UserName;
        this.LikeCount = LikeCount;
        this.CreateTime = CreateTime;
        this.RecipeId = RecipeId;
    }
    @Generated(hash = 1610407433)
    public HotMenuEntity() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTab() {
        return this.tab;
    }
    public void setTab(String tab) {
        this.tab = tab;
    }
    public String getCover() {
        return this.Cover;
    }
    public void setCover(String Cover) {
        this.Cover = Cover;
    }
    public String getTitle() {
        return this.Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getUserName() {
        return this.UserName;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getLikeCount() {
        return this.LikeCount;
    }
    public void setLikeCount(String LikeCount) {
        this.LikeCount = LikeCount;
    }
    public String getCreateTime() {
        return this.CreateTime;
    }
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getRecipeId() {
        return this.RecipeId;
    }
    public void setRecipeId(String RecipeId) {
        this.RecipeId = RecipeId;
    }
   

}

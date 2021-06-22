package com.example.finalproject.WebNovelJavaFile;

public class WebNovel {
    private String name;
    private String desciption;
    private int image;
    private int genre;

    public WebNovel(String name, String desciption, int image, int genre) {
        this.name = name;
        this.desciption = desciption;
        this.image = image;
        this.genre = genre;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}

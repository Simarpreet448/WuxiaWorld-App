package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.WebNovelJavaFile.WebNovel;

import java.util.ArrayList;
import java.util.List;

import com.example.finalproject.WebNovelJavaFile.CustomAdaptor;
public  class SecondActivity extends AppCompatActivity {
    private String Genre;
    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        List<WebNovel> itemsList = new ArrayList<>();
        Intent intent = getIntent();

        Genre = intent.getStringExtra("Genre");
            getSupportActionBar().setTitle(Genre);
            if(Genre.equals("Xianxia (Immortal Heroes)"))
            {
                itemsList.add(new WebNovel("A Will Ethernal","A Will Eternal is the fourth major xianxia novel by the renowned Er Gen. It tells the tale of Bai Xiaochun, an endearing but exasperating young man who is driven primarily by his fear of death and desire to live forever, but who deeply values friendship and family. The story takes place in the same Universe as Er Gen's other novels, but is a separate story and can be read alone. That said, it does have connections to the other novels, especially I Shall Seal the Heavens. Those connections only pertain to a handful of chapters, so you can read the novel as a whole and enjoy it without first reading ISSTH. However, the best reading experience would begin with the later portions of ISSTH. This novel is much more comedic and light-hearted than Er Gen's previous works, although it has its fair share of action and drama.", R.raw.awillethernal,R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Renegade Immortal","nothing",R.raw.renegateimmortal, R.string.xianxiaimmortalheroes));
            }
            else if(Genre.equals("Wuxia (Martial Heroes)"))
            {
                itemsList.add(new WebNovel("A Will Ethernal","A Will Eternal is the fourth major xianxia novel by the renowned Er Gen. It tells the tale of Bai Xiaochun, an endearing but exasperating young man who is driven primarily by his fear of death and desire to live forever, but who deeply values friendship and family. The story takes place in the same Universe as Er Gen's other novels, but is a separate story and can be read alone. That said, it does have connections to the other novels, especially I Shall Seal the Heavens. Those connections only pertain to a handful of chapters, so you can read the novel as a whole and enjoy it without first reading ISSTH. However, the best reading experience would begin with the later portions of ISSTH. This novel is much more comedic and light-hearted than Er Gen's previous works, although it has its fair share of action and drama.", R.raw.awillethernal,R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Renegade Immortal","nothing",R.raw.courtlady, R.string.xianxiaimmortalheroes));
            }
            else if(Genre.equals("Xuanhuan (Mysterious Fantasy)"))
            {
                itemsList.add(new WebNovel("A Will Ethernal","A Will Eternal is the fourth major xianxia novel by the renowned Er Gen. It tells the tale of Bai Xiaochun, an endearing but exasperating young man who is driven primarily by his fear of death and desire to live forever, but who deeply values friendship and family. The story takes place in the same Universe as Er Gen's other novels, but is a separate story and can be read alone. That said, it does have connections to the other novels, especially I Shall Seal the Heavens. Those connections only pertain to a handful of chapters, so you can read the novel as a whole and enjoy it without first reading ISSTH. However, the best reading experience would begin with the later portions of ISSTH. This novel is much more comedic and light-hearted than Er Gen's previous works, although it has its fair share of action and drama.", R.raw.awillethernal,R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Renegade Immortal","nothing",R.raw.renegateimmortal, R.string.xianxiaimmortalheroes));
            }

        GridView gridView = findViewById(R.id.gridview);
        CustomAdaptor customAdapter = new CustomAdaptor(this, R.layout.webnovellistitem, itemsList);
        gridView.setAdapter(customAdapter);
    }

}
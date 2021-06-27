package com.example.finalproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressDialog progress;
    Thread tread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        progress = new ProgressDialog(MainActivity.this);
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
        setContentView(R.layout.activity_main);
    }

    public void onClickText(View view)
    {
        final ProgressDialog dialog= ProgressDialog.show(this,"Loading", "Please wait....",true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent categoryListActivity = new Intent(MainActivity.this, SecondActivity.class);
                    switch (view.getId())
                    {
                        case R.id.wuxiatextview:
                            categoryListActivity.putExtra("Genre", "Wuxia (Martial Heroes)");
                            break;
                        case R.id.xianxiatextview:
                            categoryListActivity.putExtra("Genre", "Xianxia (Immortal Heroes)");
                            break;
                        case R.id.xuanhuantextview:
                            categoryListActivity.putExtra("Genre", "Xuanhuan (Mysterious Fantasy)");
                            break;
                    }
                    startActivity(categoryListActivity);
                    dialog.dismiss();
                }
                catch(Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Something went wrong. Please try again later", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }).start();
    }

    public void onClickImage(View view)
    {
        Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
        switch (view.getId()) {
            case R.id.renegateimmortalimage:
                intent.putExtra("name","Renegade Immortal");
                intent.putExtra("image", R.raw.renegateimmortal);
                intent.putExtra("info", "Renegade Immortal / Xian Ni (仙逆) – Wang Lin is a very smart boy with loving parents. Although he and his parents are shunned by the rest of their relatives, his parents have always held high hopes that he will one day become someone great. One day, Wang Lin suddenly gained the chance to walk the path of an immortal but found that he only had mediocre talent at best. Watch Wang Lin as he breaks through his lack of talent and walks the path towards becoming a real immortal!");
                intent.putExtra("genre", R.string.xianxiaimmortalheroes);
                startActivity(intent);
                break;
            case R.id.awillethernalimage:
                intent.putExtra("name","A Will Ethernal");
                intent.putExtra("image", R.raw.awillethernal);
                intent.putExtra("info", "A Will Eternal is the fourth major xianxia novel by the renowned Er Gen. It tells the tale of Bai Xiaochun, an endearing but exasperating young man who is driven primarily by his fear of death and desire to live forever, but who deeply values friendship and family. The story takes place in the same Universe as Er Gen's other novels, but is a separate story and can be read alone. That said, it does have connections to the other novels, especially I Shall Seal the Heavens. Those connections only pertain to a handful of chapters, so you can read the novel as a whole and enjoy it without first reading ISSTH. However, the best reading experience would begin with the later portions of ISSTH. This novel is much more comedic and light-hearted than Er Gen's previous works, although it has its fair share of action and drama.");
                intent.putExtra("genre", R.string.xianxiaimmortalheroes);
                startActivity(intent);
                break;
            case R.id.ishellsealtheheavenimage:
                intent.putExtra("name","I Shell Seal The Heaven");
                intent.putExtra("image", R.raw.ishellsealtheheaven);
                intent.putExtra("info", "If I want something, the heavens better have it. If I don’t want something, the heavens better not have it! This is a story which originates between the Eighth and Ninth Mountains, a world in which “My fate is to seal the heavens like a demon!");
                intent.putExtra("genre", R.string.xianxiaimmortalheroes);
                startActivity(intent);
                break;
                case R.id.sagemonarchimage:
                intent.putExtra("name","Sage Monarch");
                intent.putExtra("image", R.raw.sagemonarch);
                intent.putExtra("info", "Yang Qi is a skilled fighter, but also has the reputation of being hedonistic and impulsive. To impress a girl, he does something monumentally stupid, and ends up crippled, unable to practice martial arts or energy cultivation. Furthermore, his actions put his clan in danger of being exterminated. To top it all off, he gets struck by lightning. However, as it turns out, being struck by lightning isn't such a bad thing after all....");
                intent.putExtra("genre", R.string.xuanhuanmysteriousfantasy);
                startActivity(intent);
                break;

            case R.id.geniusdetectiveimage:
                intent.putExtra("name","Genius Detective");
                intent.putExtra("image", R.raw.geniusdetective);
                intent.putExtra("info", "We follow the story of Song Lang, a genius in the police field, who due to unfortunate circumstances caused by his mortal enemy, now assumes the identity of a driver named Chen Shi. Although he had wanted to live out his days as an ordinary citizen, fate has other plans in store for him. Finding himself in the position of prime suspect to a case, he assists a police officer to uncover the truth. Follow the adventures of Chen Shi as he is plunged back into the world of bizarre homicide investigations. Will he be fated to meet his enemy once again? If you enjoy murder mysteries such as the TV show “The Mentalist”, or anime like “Detective Conan”, then this novel is for you.");
                intent.putExtra("genre", R.string.xianxiaimmortalheroes);
                startActivity(intent);
                break;

            case R.id.sovereignofthreerealmsimage:
                intent.putExtra("name","Sovereign Of Three Realms");
                intent.putExtra("image", R.raw.sovereignofthethreerealms);
                intent.putExtra("info", "Jiang Chen, son of the Celestial Emperor, unexpectedly reincarnated into the body of a despised young noble, thus embarking on the path of the underdog trouncing all comers. No one has the right to call himself a genius in front of Jiang Chen, as no one has a better understanding of the heavens than the son of the Celestial Emperor. Genius? He who adheres to me shall ascend, those who oppose me can find solace in hell!");
                intent.putExtra("genre", R.string.xianxiaimmortalheroes);
                startActivity(intent);
                break;
        }



    }
}
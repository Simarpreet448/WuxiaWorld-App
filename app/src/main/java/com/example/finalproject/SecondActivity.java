package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
                itemsList.add(new WebNovel("Renegade Immortal","Renegade Immortal / Xian Ni (仙逆) – Wang Lin is a very smart boy with loving parents. Although he and his parents are shunned by the rest of their relatives, his parents have always held high hopes that he will one day become someone great. One day, Wang Lin suddenly gained the chance to walk the path of an immortal but found that he only had mediocre talent at best. Watch Wang Lin as he breaks through his lack of talent and walks the path towards becoming a real immortal!",R.raw.renegateimmortal, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("I Shall Seal the Heavens","If I want something, the heavens better have it. If I don’t want something, the heavens better not have it! This is a story which originates between the Eighth and Ninth Mountains, a world in which “My fate is to seal the heavens like a demon!",R.raw.ishellsealtheheaven, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Lady Cultivator","The challenges a female cultivator must overcome on her life journey are countless. She must not lack in talent, cultivation techniques, medicinal pills or magic weapons. Otherwise, her cultivation will progress too slowly. She also must not have too many emotions, weaknesses, kindness, or greed - if she has these in excess, she will soon be saying hello to death. Moreover, she must not look either too pretty or ugly. Although she must not be stupid, she also must not be too smart.",R.raw.ladycultivator, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Paragon of Destruction","When Arran decides to become a mage, he quickly discovers that magic can be more dangerous than he had ever imagined. Soon, he finds himself hunted for powers he never knew he had. Helped by a mysterious mage with secret motives, he sets off on a journey to escape his enemies. But where will he run? And can he trust his helper?",R.raw.paragonofdestruction, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Necropolis Immortal","Necromancy, no filler, and unexplained mysteries of the world arrive with Necropolis Immortal! Starting off with a typical xianxia trope of an incredible treasure, this cultivation novel quickly veers away from the usual cliches and into the realm of the spookily unexplored. Lu Yun, commandant of the tomb raiders, arrives in a fantastical world of immortals. It’s a realm filled with shiny new toys—ahem, tombs to be explored. What seems like a treasure-hunting jaunt is soon tinged with intrigue. What else does he have to solve other than how to stay alive in half a year’s time? Oh, and his new body is afflicted with erectile dysfunction This novel is great for those who like mystery paired with adventure, epic one-liners, and fanciful plot twists all served with a little dash of horror. PS. etvo has a cameo!",R.raw.necropolisimmortal, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Path of Lazy Immortal","After reincarnating in his younger self, Li Wei wants to use the knowledge of the future to live a carefree life as a lazy immortal. But every new path taken is a path not yet explored. And every path not yet explored has a chance to be a perilous path.",R.raw.pathoflazyimmortal, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Immortal Soaring Blade","One ant like mountain boy. A long path of cultivation filled with difficulties. A fantasy cultivation world filled with wonders. A young boy named Zhao Jiuge lived with his adopted grandfather in a remote village at the foot of a mountain. Their lives were difficult, but they were happy to have each other. However, circumstances soon force Zhao Jiuge to leave the comfort of his home and step onto the path of cultivation. Join Zhao Jiuge on his journey through the cultivation world so that he may have gain control of his own destiny!",R.raw.immortalsoaringblade, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Reincarnation","A cultivation world destined for destruction. A man fated to destroy it. There’s a prophecy to ignore.",R.raw.threadsoffate, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Sovereign of the Three Realms","Jiang Chen, son of the Celestial Emperor, unexpectedly reincarnated into the body of a despised young noble, thus embarking on the path of the underdog trouncing all comers. No one has the right to call himself a genius in front of Jiang Chen, as no one has a better understanding of the heavens than the son of the Celestial Emperor. Genius? He who adheres to me shall ascend, those who oppose me can find solace in hell!",R.raw.sovereignofthethreerealms, R.string.xianxiaimmortalheroes));
                itemsList.add(new WebNovel("Skyfire Avenue","天火大道, aka Skyfire Avenue, is a scifi/fantasy webnovel by popular Chinese author Third Young Master of the Tang Family, aka Tang Jia San Shao (唐家三少), the same author who wrote Douluo Dalu.  This project is complete, having been finished by Xiao Lai",R.raw.skyfireavenue, R.string.xianxiaimmortalheroes));
            }
            else if(Genre.equals("Wuxia (Martial Heroes)"))
            {
                itemsList.add(new WebNovel("7 Killers","Dragon Fifth is a powerful lord with incredible martial arts, and yet is wasting away from a fatal disease. The only medicine which can cure his sickness lies in the clutches of his venomous ex-wife, Madam Lovesickness, and is guarded by seven dangerous killers, fugitives of the martial world. Into this treacherous love spat tumbles Liu Changjie, a skilled martial artist who loves drinking and women, but has a mysterious past. All is not what it seems in this wuxia heist story. Can you decipher the mystery before the final reveal? (There are only seven chapters in this novel, but they are very long chapters. In total, the story is of equal length to roughly 20-25 average web novel chapters", R.raw.sevenkillers,R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Dragon King With Seven Stars","Upon the death of multi-millionaire playboy Sun Jicheng, Jinan city suddenly becomes the center of a maelstrom of Jianghu intrigue. Once again, the mysterious death and/or disappearance of some of the most powerful and famous martial artists in recent years, such as the “End the Heavens, Destroy the Earth” crime-fighting duo Gao Tianjue and Guo Mie, and the master thief “Laughing General” Li, come to the spotlight. Smack dab in the middle of all the plotting and fighting is Ingot, a scrappy beggar who is far more than what he seems. Translated by Deathblade.",R.raw.dragonkingwithsevenstars, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Heroes Shed No Tears","Gao Jianfei: A naive martial arts genius, exploring the martial arts world for the first time in his life. Zhu Meng: A man's man who lives by the sword, but who is more passionate and emotional than he realizes. Sima Chaochun: The most famous martial artist in the world. Completely and utterly righteous. Or is he? Zhuo Donglai: The brains behind Sima Chaochun's brawn, who always has a trick up his sleeve. And the most fearsome weapon under heaven. Heroes Shed No Tears is a tale of friendship and love, of loyalty and betrayal. Secrets upon secrets will be revealed; pay close attention, and you might be able to unravel the mystery before the characters do!",R.raw.herosshednotears, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Court Lady","Once renowned as Chang’an’s number one hedonist, Sheng Chumu could barely ride on a horse without falling off. Now, he has fallen head over heels for a seamstress from Guangzhou and will do anything to be with her, including giving up his previous lifestyle and going through a one hundred and eighty degree change to improve his literary knowledge and martial arts. But will his entry into her life be a blessing or a downfall? ",R.raw.courtlady, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("The Grandmaster Strategist","This is an alternate history.  Decades after the fall of the Eastern Jin Dynasty, the world is still in chaos, although there is hope for reunification. Of poor background, Jiang Zhe, styled Suiyun, has finally, after ten years of hard work, passed the imperial examinations and become a scholar within Hanlin Academy.  Unwittingly, he becomes involved in the succession dispute of the Great Yong Dynasty.  He faces conspiracies and machinations, countless battles of strength and wits.  Intending to avoid court politics, he ultimately has no choice but to become involved.  With no alternative, Jiang Zhe can only follow the crowd, joining the chaotic political turmoil.  In this conniving world, he uses his intelligence and knowledge to provide for himself and his companions a stable environment to survive. Watch nations fall, great men rise, and supreme martial artists kneel before the quiet whispers of a frail, unassuming scholar.",R.raw.thegrandmasterstrategist, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("RMonarch of Evernight","The story starts with the protagonist as an abandoned child and follows him as he survives a cruel, spartan education to finally enlist as a proud elite of the empire. There, one day, an accident befell him that would change his entire life, strain all of his beliefs, and challenge everything he was taught to hate. An imperfect human being, we follow him as he matures both in strength and as a person, gaining allies and enemies alike as he marches onward. As to where that path would take him, however, is something we shall discover along the way.",R.raw.monarchofevernight, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("The Godsfall Chronicles","This is a world of nirvanic rebirth, a world of marvels and illusions, a world where faith is enduring and yet ruined. This is the story of a youth who seems ordinary, but who shoulders an earth-shaking secret and burden. He shall rise to prominence from his humble roots and walk a tightrope between life and death, and be lost in deciding between what is right and what is wrong. He seeks out the truth behind the destruction of Earth’s civilizations, and shall experience unbelievable dangers as he grows. In the end, he shall discover the hidden secrets behind the ancient war between the gods and the demons, and shall play the lead role in this stunning and exciting story!",R.raw.thegodsfallchronicles, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Physician’s Odyssey","Mediocre is a common characteristic of the majority. But when someone outstanding appears beside you, your life will change because of him. That’s the principle of ‘who you mix around with is a reflection of yourself.’ The doctor in charge of the Three Flavour Hall will change everything. You can raise a campus belle, a CEO beauty…,Somewhat vulgar, a little cold yet sexy, admiring young married woman and nurturing lolita. Moralists, please be warned.",R.raw.physiciansodyssey, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Ghost Emperor Wild Wife","Yun Luofeng, the genius of Huaxia Medicial School, died from an accident, and her soul attached onto the useless Eldest Miss of the General Estate in Longxia Continent. Not only was this trash ungifted in the literary arts and martial arts, but she was also big chested without a brain, arrogant, and self-willed. It was not enough for her to have a perfect fiancé like the Crown Prince. She forcibly snatched a pretty boy in public, leading to the Crown Prince to annul their engagement.",R.raw.ghostemperorwildwife, R.string.Wuxiamartialheroes));
                itemsList.add(new WebNovel("Genius Detective","We follow the story of Song Lang, a genius in the police field, who due to unfortunate circumstances caused by his mortal enemy, now assumes the identity of a driver named Chen Shi. Although he had wanted to live out his days as an ordinary citizen, fate has other plans in store for him. Finding himself in the position of prime suspect to a case, he assists a police officer to uncover the truth. Follow the adventures of Chen Shi as he is plunged back into the world of bizarre homicide investigations. Will he be fated to meet his enemy once again? ",R.raw.geniusdetective, R.string.Wuxiamartialheroes));
            }
            else if(Genre.equals("Xuanhuan (Mysterious Fantasy)"))
            {
                itemsList.add(new WebNovel("Against the Gods","Hunted for possessing a heaven-defying object, Yun Che is a young man in both that life and the next. Throwing himself off a cliff to spite his pursuers, Yun Che is reincarnated as Xiao Che, a recently poisoned teen in another realm. Just as hated in this life as the previous one, Che must overcome his own hostile clan, his own inability to cultivate, and his own frosty fiancée.", R.raw.againstthegods,R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Absolute Resonance","In the land of the Xia Kingdom, every human being is born with what is known as a 'resonance', either to a specific element or a powerful, mythical beast. Unfortunately, Li Luo was born with an incredibly rare condition known as a blank resonance - as the name suggests, he doesn't have one! Normally, this would be utterly crippling, but at least he has the advantage of being the young master of the mighty House Loulan, one of the five Great Houses of Xia. Unfortunately, his parents, the powerful masters of House Loulan, have gone missing for many years, and the other Great Houses are beginning to eye their holdings quite hungrily. For that matter, plenty are also eyeing his talented, beautiful childhood friend and fiancee Jiang Qing'e, who has been leading House Loulan in his parents' stead! Li Luo would much rather keep a low profile and wants call off the engagement - but Jiang Qing'e has flatly refused. What's a 'useless young master' to do? ",R.raw.absoluteresonance, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Martial God Asura","Regarding potential—even if you are not considered a genius, you can still learn Mysterious Techniques and martial skills. Anyone can be enlightened without a master. Regarding strength—despite having a myriad of artifacts, you may not defeat my army of World Spirits. Who am I? All the world’s living perceives me as Asura, but I was ignorant to such a thing. I thus ascend to be the Martial God as Asura.",R.raw.martialgodasura, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Almighty Sword Domain","This novel tells the tale of Yang Ye, a ruthless yet loving young man who's driven by his desire to protect his loved ones. It's set in a world where most only value strength and gain above all else, yet Yang Ye who's shaped by his experiences during his youth proves to be unlike everyone else. If killing wasn't for the sake of showing off, then it would be meaningless. If living wasn't for the sake of showing off, then it would be no different than death. Kill! Kill to the point corpses cover the world! Show off! Show off to the point of invincibility!",R.raw.almightysworddomain, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Ancient Strengthening Technique","A human warrior cultivating the Ancient Strengthening Technique has transcended dimensions and arrived on Kyushu. Together with twelve ravishing beauties with looks that were unmatched in their generation, will he be able to stand on the summit of this world? This novel is about the main character, named Qing Shui, who transcended dimensions and arrived in the world of nine continents. Storms of blood and wind, resulting in corpses and bones strewn about are extremely common here. The young warrior Qing Shui forged ahead in his path to cultivate, using 10 years to train himself, only to seek vengeance for the one who had forsaken his mother! On the road, he had a chance encounter with the cold beauty (ice princess) Shi Qing Zhuang, incurring hatred and vengeance from her fiancée – Situ Bu Fan. After entering the Hundred Miles City, Qing Shui got acquainted with a dignified and beautiful lady named Yu He and other Xian Tian Realm cultivators – After which, he willingly invited tribulation on himself, after killing the young master of the Gong Yang Clan because of Yu He, and was forced into a corner. Luckily for Qing Shui, a lady as beautiful as a celestial maiden named Yi Ye Jian Ge rushed back to save him from afar, following which a bloody battle ensued. Can Qing Shui turn danger into safety, averting disaster? And his relationships with the various beautiful ladies, what will it develop into?",R.raw.ancientstrengtheningtechnique, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Beastmaster of the Ages","Even in his dreams, Li Tianming can’t stop himself from laughing! Why? Because his family pets are all the Primordial Chaos Beasts of myth! That teeny weeny little chick over there is actually the Aeternal Infernal Phoenix that eats suns! His black cat is the Genesis Chaos Thunderfiend that refines worlds with its lightning. The cockroach, well, it’s the Myriad Worlds Deathless Beast that possesses trillions of undying clones… Followed by his menagerie of pets, Li Tianming begins his ascension to become the number one Beastmaster of the ages. He journeys across the many worlds, only one thing remaining constant. No one is ever ready for the likes of his pets! After all, who is ever prepared to fight a chicken and its fellows...",R.raw.beastmasteroftheages, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Martial World","In the Divine Realm, countless legends fought over a mysterious cube. After the battle it disappeared into the void. A young man stumbles upon this mystery object, opening a whole new world to him. His name is Lin Ming, and this is his road of martial arts.",R.raw.martialworld, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("The Sovereign's Ascension","As a lawyer back on earth, Lin Yun had never lost a case. He owed his success to three things: two blessings he received at birth (a photographic memory and the ability to comprehend anything he studies) and an indomitable will he forged himself. While on a trip in Shandong province, he decided he would pay a visit to Mt. Tai. Just as he was cresting the peak, he felt a sharp pain in his chest and his vision went black. Upon waking up, he found himself in the world of Profound Amber occupying the body of a sword slave who had shared his name. The last thing he remembered before dying was the image of a sword piercing his chest. Through the memories his body retained the sword slave’s life, Lin Yun came to understand the brutality of this world. If he sought respect, he would have to earn it through strength. The week found no compassion here. Refusing to leave his fate in the hands of others, Lin Yun set out to become a sovereign. No man or beast would stop him from achieving his destiny. With his sword in hand, he would overcome any obstacle.",R.raw.thesovereignsascension, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Dragon Prince Yuan","Destiny stolen at birth, the prince of the once mighty Great Zhou Empire, Zhou Yuan, has been plagued all his life by a fatal poison, forced to suffer powerlessly until one day when fate draws him into a mysterious domain where he meets a beautiful girl in green, a bizarre dog-like creature and an unfathomable old man in black. Join Zhou Yuan as he is thrust into the whirlpool of destiny while he seeks the pinnacle of cultivation.",R.raw.dragonprinceyuan, R.string.xuanhuanmysteriousfantasy));
                itemsList.add(new WebNovel("Tales of Demons & Gods","Killed by a Sage Emperor and reborn as his 13-year-old self, Nie Li was given a second chance at life. A second chance to change everything, save his loved ones and his beloved city. He shall once again battle with the Sage Emperor to avenge his death. With the vast knowledge he accumulated in his previous life, he shall have a new starting point. Although he started as the weakest, without a doubt, he will climb the steps towards the strongest. Cultivating the strongest cultivation technique, wielding the strongest demon spirits, he shall reach the pinnacle of Martial Arts. Enmities of the past will be settled in this new lifetime. “Since I’m back, then in this lifetime, I shall become the King of Gods that dominates everything. Let everything else tremble beneath my feet!”",R.raw.talesofdemonsandgods, R.string.xuanhuanmysteriousfantasy));

            }

        GridView gridView = findViewById(R.id.gridview);
        CustomAdaptor customAdapter = new CustomAdaptor(this, R.layout.webnovellistitem, itemsList);
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WebNovel item = itemsList.get(position);
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);
                intent.putExtra("name",item.getName());
                intent.putExtra("image",item.getImage());
                intent.putExtra("info", item.getDesciption());
                intent.putExtra("genre", item.getGenre());
                startActivity(intent);
            }
        });

    }

}
package com.bryonnicoson.news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.bryonnicoson.news.model.GetArticlesResponse;
import com.bryonnicoson.news.model.NewsArticle;
import com.bryonnicoson.news.networking.NewsAPI;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView newsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<NewsArticle> newsArticles = new ArrayList<>();
        newsArticles.add(new NewsArticle(
                "White House Now Just Holding Continuous Going-Away Party For Departing Staffers",
                "WASHINGTON—In an effort to make the frequent festivities for departing staffers more efficient, White House officials announced Tuesday that the administration is now just holding one continuous going-away party. “Instead of throwing a send-off celebration for Rob Porter and Rick Dearborn only to turn around and do it again a week later, we will now simply hold around-the-clock gatherings with light refreshments and cupcakes to honor whoever left the administration most recently,” said Press Secretary Sarah Huckabee-Sanders, adding that employees may now join their coworkers at any time of day in the permanently decorated White House kitchen where a never-ending stream of staffers will announce that this is their last day, perpetually deliver farewell speeches, and constantly pass around and sign goodbye cards for continuously departing coworkers. “In order to avoid another situation like when we had three separate get-togethers in one week for Sean Spicer, Michael Short, and Reince Priebus, aides may now enjoy a cup of soda, don a party hat, reminisce over fond memories together, and say their farewells whenever it is convenient for them.” Huckabee-Sanders added that she looks forward to seeing everyone in the kitchen, where she expects to be honored shortly.",
                "https://i.kinja-img.com/gawker-media/image/upload/s--SrwSTOyv--/c_scale,fl_progressive,q_80,w_800/igvwgt9fbcpmce60t11h.jpg",
                "2/13/18 5:36pm",
                "https://politics.theonion.com/white-house-now-just-holding-continuous-going-away-part-1822978954"
        ));
        newsArticles.add(new NewsArticle(
                "John Kelly Apologizes For Assuming Everyone Would Ignore Abuse Allegations Like They Do In Military",
                "WASHINGTON—Amid criticism of how long he waited to terminate the employment of Rob Porter, White House Chief of Staff John Kelly apologized Wednesday for assuming everyone would just ignore the abuse allegations against the staff secretary the way they always do in the military. “I am deeply sorry for thinking you would all react the way I’m accustomed to and simply disregard all misconduct claims made against someone in such a powerful position,” said the retired four-star Marine Corps general, explaining that his four decades as an officer in the armed services had led him to expect people would not only turn a blind eye to Porter’s misdeeds, but also denounce his victims as liars and then punish them for questioning authority. “I’m still getting used to a leadership style where the standard approach isn’t to roundly dismiss everything the accusers say, make them apologize to their abusers, and then force them to endure excessively painful drills coupled with dehumanizing insults. But I understand now that as White House chief of staff, you can’t just look the other way every time you’re confronted with violent physical abuse against women.” Kelly went on to promise that in future cases he will act without delay, addressing abuse allegations the very moment they are leaked to the public.",
                "https://i.kinja-img.com/gawker-media/image/upload/s--Ui8hVHuX--/c_scale,fl_progressive,q_80,w_800/lj6jous7oxblfuxagccv.jpg",
                "Thursday 10:18am",
                "https://politics.theonion.com/john-kelly-apologizes-for-assuming-everyone-would-ignor-1823035070"
        ));

        NewsStore.setNewsArticles(newsArticles);

        newsRecyclerView = (RecyclerView) findViewById(R.id.activity_main_recyclerview);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        HomeNewsAdapter homeNewsAdapter = new HomeNewsAdapter(NewsStore.getNewsArticles());
        newsRecyclerView.setAdapter(homeNewsAdapter);

        Call<GetArticlesResponse> call = NewsAPI.getApi().getArticles("reuters", "top");
        call.enqueue(new Callback<GetArticlesResponse>() {

            @Override
            public void onResponse(Call<GetArticlesResponse> call, Response<GetArticlesResponse> response) {
                GetArticlesResponse getArticlesResponse = response.body();
                Toast.makeText(MainActivity.this, "Response received", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<GetArticlesResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error received", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

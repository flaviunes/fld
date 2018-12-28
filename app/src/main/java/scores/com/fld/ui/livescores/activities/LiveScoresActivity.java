package scores.com.fld.ui.livescores.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import scores.com.fld.R;
import scores.com.fld.ui.livescores.adapters.LiveScoresAdapter;
import scores.com.fld.ui.livescores.models.Game;

public class LiveScoresActivity extends AppCompatActivity {
    private List<Game> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_scores_activity);
        games = getGamesList();
        RecyclerView recyclerView = findViewById(R.id.rv_livescores);
        LiveScoresAdapter adapter = new LiveScoresAdapter(games);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private List<Game> getGamesList() {
        Game game1 = new Game("TEAM1", "TEAM2", "2-2", "84'");
        Game game2 = new Game("TEST!@$#@$#@$#@$#@$", "TEEEEEST", "5-2", "39'");
        Game game3 = new Game("EEEE", "TREI", "1-3", "FT");
        Game game4 = new Game("ECHIPA", "PATRU", "1-4", "HT");
        Game game5 = new Game("CLUJ", "CFR", "0-2", "FT");
        List<Game> newList = new ArrayList<>();
        newList.add(game1);
        newList.add(game2);
        newList.add(game3);
        newList.add(game4);
        newList.add(game5);
        return newList;
    }
}

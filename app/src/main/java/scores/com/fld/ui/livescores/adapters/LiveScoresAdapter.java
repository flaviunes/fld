package scores.com.fld.ui.livescores.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import scores.com.fld.R;
import scores.com.fld.ui.livescores.models.Game;

public class LiveScoresAdapter extends RecyclerView.Adapter<LiveScoresAdapter.LivescoresViewHolder> {

    private List<Game> gamesList;

    public LiveScoresAdapter(List<Game> games) {
        this.gamesList = games;
    }

    @NonNull
    @Override
    public LivescoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View gameView = LayoutInflater.from(parent.getContext()).inflate(R.layout.livescore_view_holder, parent, false);
        return new LivescoresViewHolder(gameView);
    }

    @Override
    public void onBindViewHolder(@NonNull LivescoresViewHolder holder, int position) {
        Game game = gamesList.get(position);
        holder.minute.setText(game.getMinute());
        holder.score.setText(game.getScore());
        holder.firstTeam.setText(game.getFirstTeam());
        holder.secondTeam.setText(game.getSecondTeam());
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

    static class LivescoresViewHolder extends RecyclerView.ViewHolder {
        TextView firstTeam;
        TextView secondTeam;
        TextView score;
        TextView minute;

        public LivescoresViewHolder(@NonNull View view) {
            super(view);
            firstTeam = view.findViewById(R.id.tv_first_team);
            secondTeam = view.findViewById(R.id.tv_second_team);
            score = view.findViewById(R.id.tv_score);
            minute = view.findViewById(R.id.tv_minute);
        }
    }
}

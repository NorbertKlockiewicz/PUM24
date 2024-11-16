import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pum24.R
import com.example.pum24.ui.movies.Movie

class MoviesAdapter(private val movieList: List<Movie>) :
    RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.tvTitle.text = movie.title
        holder.tvAuthor.text = movie.author
        holder.tvYear.text = movie.yearOfRelease.toString()
    }

    override fun getItemCount() = movieList.size

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        var tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
        var tvYear: TextView = itemView.findViewById(R.id.tvYear)
    }
}
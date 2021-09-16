package grand.app.notta.pages.onBoard;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import grand.app.notta.R;
import grand.app.notta.pages.onBoard.models.OnBoard;


public class OnBoardAdapter extends SliderViewAdapter<OnBoardAdapter.SliderAdapterVH> {
    public List<OnBoard> pagerList;
    private Context context;

    public OnBoardAdapter() {
        pagerList = new ArrayList<>();
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.onboard_slider_item, null);
        context = parent.getContext();
        return new SliderAdapterVH(inflate);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {
        OnBoard introItem = pagerList.get(position);
        Glide.with(context).load(introItem.getImage()).placeholder(R.color.overlayBackground).into(viewHolder.imageViewBackground);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            viewHolder.title.setText(Html.fromHtml(introItem.getTitle(), Html.FROM_HTML_MODE_COMPACT));
            viewHolder.desc.setText(Html.fromHtml(introItem.getBody(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            viewHolder.title.setText(Html.fromHtml(introItem.getTitle()));
            viewHolder.desc.setText(Html.fromHtml(introItem.getBody()));
        }
    }

    @Override
    public int getCount() {
        //slider view count could be dynamic size
        return pagerList.size();
    }

    public void updateData(@Nullable List<OnBoard> data) {
        this.pagerList.clear();
        this.pagerList.addAll(data);
        notifyDataSetChanged();
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {
        View itemView;
        ImageView imageViewBackground;
        TextView title, desc;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.iv_auto_image_slider);
            title = itemView.findViewById(R.id.tv_board_title);
            desc = itemView.findViewById(R.id.tv_board_desc);
            this.itemView = itemView;
        }
    }
}

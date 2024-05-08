package com.example.test0518;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class stuDataAdapter extends RecyclerView.Adapter<stuDataAdapter.ViewHolder> {
    private List<StuData> listData;

    public stuDataAdapter(List<StuData> listData) {
        this.listData = listData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
                public TextView tvName1;

                public TextView tvHeight1;

                public List<StuData>
        public ViewHolder(@NonNull itemView) {
            super(itemView);
        }
    }
    @NonNull
}

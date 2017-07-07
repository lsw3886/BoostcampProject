package com.example.lsw38.facebook;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lsw38 on 2017-07-06.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    String[] PostNames = {"이승우", "유준영", "신현준"};
    String[] PostDate = {"7월 4일 오후 3:01 * ", "7월 2일 오후 2:01 *", "6월 15일 오전 2:58 *" };
    int[] images = {R.drawable.nogari, R.drawable.yuk, R.drawable.ramen};
    int[] ProfileImages = {R.mipmap.profile1, R.mipmap.profile2, R.mipmap.profile3};

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, null);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position){
        holder.postUserName.setText(PostNames[position]);
        holder.postDate.setText(PostDate[position]);
        holder.postImage.setImageResource(images[position]);
        holder.profileImage.setImageResource(ProfileImages[position]);
    }
    @Override
    public int getItemCount(){
        return PostNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout postItemLayout;
        TextView postUserName;
        TextView postDate;
        ImageView postImage;
        ImageView profileImage;

        public ViewHolder(View itemView){
            super(itemView);
            postItemLayout = (LinearLayout) itemView.findViewById(R.id.post_item_layout);
            postUserName = (TextView) itemView.findViewById(R.id.post_user_name);
            postDate = (TextView) itemView.findViewById(R.id.post_date);
            postImage = (ImageView) itemView.findViewById(R.id.content_pic);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_pic);
        }
    }
}
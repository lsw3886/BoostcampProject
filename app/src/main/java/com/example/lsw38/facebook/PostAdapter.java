package com.example.lsw38.facebook;

import android.content.Context;
import android.media.Image;
import android.support.v4.app.FragmentActivity;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by lsw38 on 2017-07-06.
 */

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    String[] PostNames = {"이승우", "유준영", "신현준"};
    String[] PostDate = {"7월 4일 오후 3:01 * ", "7월 2일 오후 2:01 *", "6월 15일 오전 2:58 *" };
    int[] images = {R.drawable.nogari, R.drawable.yuk, R.drawable.ramen};
    int[] ProfileImages = {R.mipmap.profile1, R.mipmap.profile2, R.mipmap.profile3};
    String[] CommentCount = {"댓글 24개", "댓글 97개 공유 181회", "공유 19회"};
    String[] ContentText = {"노가리 슈퍼에서 맥주 한 잔!", "육회집에서 소맥 한 잔!", "토상막회에서 소주 한 잔!"};
    Context mContext;

    public PostAdapter(Context context) {
        mContext = context;
    }

    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        if(viewType == 0){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_header, null);
            return new ViewHolder(v);
        }else if(viewType == 1){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_header, null);
            return new ViewHolder(v);
        }
        else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, null);
            return new ViewHolder(v);
        }

    }
    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position){
        if(position > 1) {
            holder.postUserName.setText(PostNames[position-2]);
            holder.postDate.setText(PostDate[position-2]);
            holder.postImage.setImageResource(images[position-2]);
            holder.contentText.setText(ContentText[position-2]);
            holder.profileImage.setImageResource(ProfileImages[position-2]);
            holder.countComment.setText(CommentCount[position-2]);
            holder.likeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "좋아요", Toast.LENGTH_SHORT).show();
                }
            });
            holder.commentBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "댓글달래요.", Toast.LENGTH_SHORT).show();
                }
            });
            holder.shareBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mContext, "공유할래요", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
    @Override
    public int getItemCount(){
        return (PostNames.length+2);
    }
    public class ViewHolderFirst extends RecyclerView.ViewHolder{
        LinearLayout FirstHeader;
        public ViewHolderFirst(View view){
            super(view);
            FirstHeader = (LinearLayout) view.findViewById(R.id.first_header);
        }
    }
    public class ViewHolderSecond extends RecyclerView.ViewHolder{
        LinearLayout SecondHeader;
        public ViewHolderSecond(View view){
            super(view);
            SecondHeader = (LinearLayout) view.findViewById(R.id.second_header);

        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout postItemLayout;
        TextView postUserName;
        TextView postDate;
        TextView contentText;
        TextView countComment;
        ImageView postImage;
        ImageView profileImage;
        Button likeBtn;
        Button commentBtn;
        Button shareBtn;

        public ViewHolder(View itemView){
            super(itemView);
            postItemLayout = (LinearLayout) itemView.findViewById(R.id.post_item_layout);
            postUserName = (TextView) itemView.findViewById(R.id.post_user_name);
            postDate = (TextView) itemView.findViewById(R.id.post_date);
            postImage = (ImageView) itemView.findViewById(R.id.content_pic);
            profileImage = (ImageView) itemView.findViewById(R.id.profile_pic);
            likeBtn = (Button) itemView.findViewById(R.id.likebtn);
            commentBtn = (Button) itemView.findViewById(R.id.commentbtn);
            shareBtn = (Button) itemView.findViewById(R.id.sharebtn);
            countComment = (TextView) itemView.findViewById(R.id.count_comment);
            contentText = (TextView) itemView.findViewById(R.id.content_txt);
        }

    }
    @Override
    public int getItemViewType(int position){
        if(position == 0){
            return 0;
        }else if(position == 1){
            return 1;
        }else{
            return 2;
        }
    }
}

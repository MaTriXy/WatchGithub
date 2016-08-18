package io.fisache.watchgithub.ui.userslist;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.fisache.watchgithub.R;
import io.fisache.watchgithub.data.model.User;

public class UsersListHolder extends RecyclerView.ViewHolder {
    @Bind(R.id.ivAvatar)
    ImageView ivAvatar;
    @Bind(R.id.tvLogin)
    TextView tvLogin;
    @Bind(R.id.tvDesc)
    TextView tvDesc;
    @Bind(R.id.ivSetting)
    ImageView ivSetting;
    @Bind(R.id.tvType)
    TextView tvType;
    @Bind(R.id.rlUserItem)
    View rlUserItem;

    public UsersListHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(User user) {
        tvLogin.setText(user.login);
        if(user.desc != null) {
            tvDesc.setText(user.desc);
        }
        if(user.type.equals("User")) {
            tvType.setText("[USR]");
        } else {
            tvType.setText("[ORG]");
        }
    }
}

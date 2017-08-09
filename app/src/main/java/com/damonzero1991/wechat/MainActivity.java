package com.damonzero1991.wechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.damonzero1991.wechat.util.ToastUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by damonzero1991 on 17/8/9.
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.clickme)
    Button mClickme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.clickme)
    public void onViewClicked() {
        ToastUtil.showToast("点击我喔喔！！！");
    }
}

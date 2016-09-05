package lic.swifter.box.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;
import lic.swifter.box.R;
import lic.swifter.box.api.model.Result;
import lic.swifter.box.api.model.TopNewsWrapper;
import lic.swifter.box.mvp.presenter.NetQueryType;
import lic.swifter.box.mvp.presenter.NewsPresenter;
import lic.swifter.box.mvp.view.IView;

public class TopNewsFragment extends BaseFragment implements IView<String, TopNewsWrapper> {

    @Bind(R.id.fragment_top_news_view_pager)
    ViewPager viewPager;
    private NewsPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top_news, container, false);
        ButterKnife.bind(this, rootView);
        presenter = new NewsPresenter(this);

        return rootView;
    }

    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }

    @Override
    public void beforeQuery(String requestParameter) {

    }

    @Override
    public void afterQuery(NetQueryType type, Result<TopNewsWrapper> response) {

    }

}

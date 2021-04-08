package com.cj.testservice;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("junchen", "Fragment1 onAttach: ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("junchen", "Fragment1 onCreate: ");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d("junchen", "Fragment1 onHiddenChanged: hidden--"+hidden);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("junchen", "Fragment1 onCreateView: ");
        return inflater.inflate(R.layout.fragment1_layout,null);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("junchen", "Fragment1 onViewCreated: ");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("junchen", "Fragment1 onActivityCreated: ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("junchen", "Fragment1 onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("junchen", "Fragment1 onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("junchen", "Fragment1 onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("junchen", "Fragment1 onStop: ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("junchen", "Fragment1 onDestroyView: ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("junchen", "Fragment1 onDestroy: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("junchen", "Fragment1 onDetach: ");
    }
}

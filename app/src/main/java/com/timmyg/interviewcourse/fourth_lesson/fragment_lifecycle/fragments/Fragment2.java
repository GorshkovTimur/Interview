package com.timmyg.interviewcourse.fourth_lesson.fragment_lifecycle.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.timmyg.interviewcourse.R;

public class Fragment2 extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        showToast("onAttach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showToast("onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        showToast("onCreateView");
        View view = inflater.inflate(R.layout.fragment2, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        showToast("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        showToast("onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        showToast("onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        showToast("onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        showToast("onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        showToast("onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        showToast("onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        showToast("onDetach() ");
    }

    private void showToast(String txt){
        Toast.makeText(getActivity(), txt, Toast.LENGTH_SHORT).show();
    }
}

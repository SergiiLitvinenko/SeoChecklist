package com.example.falcon.seochecklist.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.example.falcon.seochecklist.R;
import com.example.falcon.seochecklist.activities.Item;
import com.example.falcon.seochecklist.activities.MyListAdapter;

import java.util.List;


public class ChecklistFragment extends ListFragment {
    private ListView myList;
    private Item[] items = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "I am Checklist fragment :)", Toast.LENGTH_SHORT).show();

//        myList = (ListView) getActivity().findViewById(R.id.lvChecklist);
        items = new Item[5];
        items[0] = new Item("Семантика", 1);
        items[1] = new Item("Метатеги", 0);
        items[2] = new Item("Тексты", 1);
        items[3] = new Item("Хуяк хуяк", 0);
        items[4] = new Item("В продлакшн", 0);
        MyListAdapter adapter = new MyListAdapter(getActivity(), R.layout.list_item, items);
//        myList.setAdapter(adapter);

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

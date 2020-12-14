package com.example.personleads;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class LeadsFragment extends Fragment {

    ListView mLeadsList;
    LeadsAdapter mLeadsAdapter;


    public LeadsFragment() {

    }


    public static LeadsFragment newInstance() {
        LeadsFragment fragment = new LeadsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_leads, container, false);

        mLeadsList = (ListView)root.findViewById(R.id.leads_list);

        String[] leadsNames = {
                "Alexander Pierrot",
                "Carlos Lopez",
                "Sara Bonz",
                "Liliana Clarence",
                "Benito Peralta",
                "Juan Jaramillo",
                "Christian Steps",
                "Alexa Giraldo",
                "Linda Murillo",
                "Lizeth Astrada"
        };

        mLeadsAdapter = new LeadsAdapter(getActivity(), LeadsRepository.getInstance().getLeads());

        mLeadsList.setAdapter(mLeadsAdapter);

        return root;
    }
}
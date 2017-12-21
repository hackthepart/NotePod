package www.mnnit.com.notepod.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import www.mnnit.com.notepod.R;


    public class NoteLinedEditorFragment extends android.app.Fragment {


        public NoteLinedEditorFragment() {
            // Required empty public constructor
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_note_lined_editor, container, false);
        }


    }

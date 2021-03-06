package com.example.go4lunch2.ui.yourLunch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.go4lunch2.databinding.FragmentYourLunchBinding;

public class YourLunchFragment extends Fragment {

    private FragmentYourLunchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YourLunchViewModel galleryViewModel =
                new ViewModelProvider(this).get(YourLunchViewModel.class);

        binding = FragmentYourLunchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textYourLunch;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
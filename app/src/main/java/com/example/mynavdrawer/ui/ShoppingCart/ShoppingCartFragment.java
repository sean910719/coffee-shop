package com.example.mynavdrawer.ui.ShoppingCart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mynavdrawer.databinding.FragmentShoppingcartBinding;

public class ShoppingCartFragment extends Fragment {

    private FragmentShoppingcartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShoppingCartViewModel AboutViewModel =
                new ViewModelProvider(this).get(ShoppingCartViewModel.class);

        binding = FragmentShoppingcartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAbout;
        AboutViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

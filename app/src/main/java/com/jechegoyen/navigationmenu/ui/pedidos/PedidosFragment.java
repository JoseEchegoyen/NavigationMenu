package com.jechegoyen.navigationmenu.ui.pedidos;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jechegoyen.navigationmenu.MainActivity;
import com.jechegoyen.navigationmenu.R;
import com.jechegoyen.navigationmenu.databinding.FragmentHomeBinding;
import com.jechegoyen.navigationmenu.ui.home.HomeViewModel;

public class PedidosFragment extends Fragment {

    private PedidosViewModel mViewModel;

    public static PedidosFragment newInstance() {
        return new PedidosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(PedidosViewModel.class);
        View root= inflater.inflate(R.layout.pedidos_fragment, container, false);
        Button b1= root.findViewById(R.id.button);
        b1.setOnClickListener(v ->  {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        );

        return root;
    }

}
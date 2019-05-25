package br.com.digitalhouse.comunicaactivities.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.comunicaactivities.R;
import br.com.digitalhouse.comunicaactivities.interfaces.Comunicator;
import br.com.digitalhouse.comunicaactivities.model.Person;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private Comunicator comunicator;

    public FirstFragment() {
        // Required empty public constructor
    }

    //Este metodo é chamado quando o fragmento é vinculado a uma activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try{
            comunicator = (Comunicator) context;
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button btnSend = view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Colocar o envio de dados
                Person person = new Person("Tairo", "Professor", 30);
                comunicator.receberMensagem(person);

            }
        });

        return view;
    }

}

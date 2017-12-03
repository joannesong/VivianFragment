package nyc.c4q.java1203;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    View rootView;
    TextView textView;
    Button button;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        rootView = inflater.inflate(R.layout.fragment_fragment1, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragText);
        button = (Button) rootView.findViewById(R.id.buttonFrag);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("main", "maintext");
                NextFragment nextFragment = new NextFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                nextFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.fragment_container_framelayout, nextFragment);
                fragmentTransaction.addToBackStack("next");
                fragmentTransaction.commit();

            }
        });

        return rootView;
    }

}

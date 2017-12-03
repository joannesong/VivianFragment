package nyc.c4q.java1203;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {

    View rootView;
    public NextFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_next, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.bundleDataText);
        Bundle bundle = getArguments();
        String someText = bundle.getString("text1");
        textView.setText(someText);

        return rootView;
    }

}

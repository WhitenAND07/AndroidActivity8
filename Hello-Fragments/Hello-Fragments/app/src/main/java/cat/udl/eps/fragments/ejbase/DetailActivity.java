package cat.udl.eps.fragments.ejbase;

import android.app.Activity;
import android.os.Bundle;



public class DetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        DetailFrag detalle = (DetailFrag) getFragmentManager().findFragmentById(R.id.frag_series);
        detalle.showText(getIntent().getStringExtra(ListFrag.VALUE));
    }
}

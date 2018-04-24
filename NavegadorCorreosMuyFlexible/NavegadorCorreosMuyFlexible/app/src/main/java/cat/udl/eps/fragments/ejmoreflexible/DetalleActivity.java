package cat.udl.eps.fragments.ejmoreflexible;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DetalleActivity extends FragmentActivity {
	
	public static final String EXTRA_TEXTO = 
			"cat.udl.eps.fragments.ejmoreflexible.EXTRA_TEXTO";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle);
		FragmentDetalle detalle = (FragmentDetalle) getSupportFragmentManager().
				findFragmentById(R.id.FrgDetalle);
		detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));



		

	}
}

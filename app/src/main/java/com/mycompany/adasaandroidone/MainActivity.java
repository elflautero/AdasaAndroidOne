package com.mycompany.adasaandroidone;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Spinner spTipoInter = (Spinner)
			findViewById(R.id.spTipoInter);
			
		ArrayAdapter<CharSequence> adaptador =
			ArrayAdapter.createFromResource(
				this,
				R.array.strArrayTipoInter,
				android.R.layout.simple_spinner_item);
				
		adaptador.setDropDownViewResource(
			android.R.layout.simple_spinner_dropdown_item); 
		
			
		spTipoInter.setAdapter(adaptador);
    }
	
	public void onClickButton (View v){
		
		Endereco end = new Endereco ();
		
		//end.getLog()
		
	}
}


/*
Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
        R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
spinner.setAdapter(adapter);

*/

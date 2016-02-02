package edu.niu.cs.z1761257.shipcostcalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //Data Members
    private ShipItem itemShipped;

    private EditText weightET;
    private TextView baseCostTV, addedCostTV, totalCostTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the ShipItem object
        itemShipped = new ShipItem();

        //Connect to the Screen
        weightET = (EditText)findViewById(R.id.weightEditText);
        baseCostTV = (TextView)findViewById(R.id.baseCostEditText);
        addedCostTV = (TextView)findViewById(R.id.addedCostEditLabel);
        totalCostTV = (TextView)findViewById(R.id.totalShippingCostEditText);

        //setup the listener for EditText field
        weightET.addTextChangedListener( weightTextWatcher );

    }//end of onCreate

    private TextWatcher weightTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }; //end of weightTextWatcher -- this is not a method (we are just creating object)





}//end of MainActivity

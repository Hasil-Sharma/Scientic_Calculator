package com.ooad.frontend.button.behavior.combinatorics;
/**
 * Implements onlick string modifier to get relevant string for npr and ncr operation
 * using mxparser library
 * @author Hasil, Sandesh, Gautham
 */


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ooad.frontend.button.behavior.DefaultButtonBehavior;

public class CombPC extends DefaultButtonBehavior implements View.OnClickListener {

    private final String symbol;

    /**
     * Constructor that sets the text behavior for buttons and symbol value used for creating final math expression
     * @param txtOutput
     * @param btn
     * @param symbol
     */
    public CombPC(EditText txtOutput, Button btn, String symbol) {
        super(txtOutput, btn);
        this.symbol = symbol;
    }

    /**
     * Implements operation for button click callback - npr and ncr
     * @param view
     */
    @Override
    public void onClick(View view) {
        String oldStr = txtOutput.getText().toString();
        String newStr = symbol + oldStr + ",";
        txtOutput.setText(newStr);
    }
}

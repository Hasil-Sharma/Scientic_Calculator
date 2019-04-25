package com.ooad.frontend.button.behavior.matrix;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ooad.backend.data.types.ElemType;
import com.ooad.backend.la.Matrix;
import com.ooad.frontend.button.behavior.DefaultButtonBehavior;
import com.ooad.frontend.button.behavior.matrix.context.MatrixContext;

public class MatrixDet extends DefaultButtonBehavior {

    private MatrixContext ctx;

    public MatrixDet(EditText txtOutput, Button btn, MatrixContext ctx) {
        super(txtOutput, btn);
        this.ctx = ctx;
    }

    @Override
    public void onClick(View view) {
        Matrix matrix = ctx.getLastMatrix();
        try {
            ElemType matrixDet = matrix.determinant();
            txtOutput.setText(matrixDet.toString());

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            txtOutput.setText(MatrixContext.INPUT_ERROR);
        }

    }
}
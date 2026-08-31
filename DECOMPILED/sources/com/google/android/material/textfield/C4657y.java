package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import p325p3.AbstractC6745f;
import p325p3.AbstractC6750k;

/* JADX INFO: renamed from: com.google.android.material.textfield.y */
/* JADX INFO: loaded from: classes2.dex */
class C4657y extends AbstractC4651s {

    /* JADX INFO: renamed from: e */
    private int f18124e;

    /* JADX INFO: renamed from: f */
    private EditText f18125f;

    /* JADX INFO: renamed from: g */
    private final View.OnClickListener f18126g;

    C4657y(C4650r c4650r, int i7) {
        super(c4650r);
        this.f18124e = AbstractC6745f.f26384a;
        this.f18126g = new View.OnClickListener() { // from class: com.google.android.material.textfield.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4657y.m21710v(this.f18123a, view);
            }
        };
        if (i7 != 0) {
            this.f18124e = i7;
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m21710v(C4657y c4657y, View view) {
        EditText editText = c4657y.f18125f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (c4657y.m21711w()) {
            c4657y.f18125f.setTransformationMethod(null);
        } else {
            c4657y.f18125f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            c4657y.f18125f.setSelection(selectionEnd);
        }
        c4657y.m21638r();
    }

    /* JADX INFO: renamed from: w */
    private boolean m21711w() {
        EditText editText = this.f18125f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* JADX INFO: renamed from: x */
    private static boolean m21712x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: b */
    void mo21637b(CharSequence charSequence, int i7, int i8, int i9) {
        m21638r();
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: c */
    int mo21514c() {
        return AbstractC6750k.f26499U;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: d */
    int mo21515d() {
        return this.f18124e;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: f */
    View.OnClickListener mo21517f() {
        return this.f18126g;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: l */
    boolean mo21551l() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: m */
    boolean mo21552m() {
        return !m21711w();
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: n */
    void mo21519n(EditText editText) {
        this.f18125f = editText;
        m21638r();
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: s */
    void mo21521s() {
        if (m21712x(this.f18125f)) {
            this.f18125f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC4651s
    /* JADX INFO: renamed from: u */
    void mo21522u() {
        EditText editText = this.f18125f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

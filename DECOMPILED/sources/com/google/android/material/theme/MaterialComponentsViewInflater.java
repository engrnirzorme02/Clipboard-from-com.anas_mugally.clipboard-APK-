package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C2257r;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C2303B;
import androidx.appcompat.widget.C2347d;
import androidx.appcompat.widget.C2351f;
import androidx.appcompat.widget.C2371t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.C4654v;
import com.google.android.material.textview.MaterialTextView;
import p381w3.C7352a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C2257r {
    @Override // androidx.appcompat.app.C2257r
    /* JADX INFO: renamed from: c */
    protected C2347d mo9295c(Context context, AttributeSet attributeSet) {
        return new C4654v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C2257r
    /* JADX INFO: renamed from: d */
    protected AppCompatButton mo9296d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C2257r
    /* JADX INFO: renamed from: e */
    protected C2351f mo9297e(Context context, AttributeSet attributeSet) {
        return new C7352a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C2257r
    /* JADX INFO: renamed from: k */
    protected C2371t mo9303k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C2257r
    /* JADX INFO: renamed from: o */
    protected C2303B mo9307o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}

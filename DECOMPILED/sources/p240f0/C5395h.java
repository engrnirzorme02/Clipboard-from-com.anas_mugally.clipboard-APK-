package p240f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C2558f;

/* JADX INFO: renamed from: f0.h */
/* JADX INFO: loaded from: classes.dex */
class C5395h implements TransformationMethod {

    /* JADX INFO: renamed from: a */
    private final TransformationMethod f20554a;

    C5395h(TransformationMethod transformationMethod) {
        this.f20554a = transformationMethod;
    }

    /* JADX INFO: renamed from: a */
    public TransformationMethod m24461a() {
        return this.f20554a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f20554a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || C2558f.m11751c().m11759e() != 1) ? charSequence : C2558f.m11751c().m11764p(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f20554a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i7, rect);
        }
    }
}

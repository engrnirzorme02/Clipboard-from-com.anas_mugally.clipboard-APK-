package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p240f0.C5388a;
import p255h.AbstractC5529j;

/* JADX INFO: renamed from: androidx.appcompat.widget.l */
/* JADX INFO: loaded from: classes.dex */
class C2363l {

    /* JADX INFO: renamed from: a */
    private final EditText f8293a;

    /* JADX INFO: renamed from: b */
    private final C5388a f8294b;

    C2363l(EditText editText) {
        this.f8293a = editText;
        this.f8294b = new C5388a(editText, false);
    }

    /* JADX INFO: renamed from: a */
    KeyListener m10115a(KeyListener keyListener) {
        return m10116b(keyListener) ? this.f8294b.m24425a(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: b */
    boolean m10116b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: c */
    void m10117c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f8293a.getContext().obtainStyledAttributes(attributeSet, AbstractC5529j.f21256g0, i7, 0);
        try {
            int i8 = AbstractC5529j.f21326u0;
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getBoolean(i8, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m10119e(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    InputConnection m10118d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f8294b.m24426b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: e */
    void m10119e(boolean z7) {
        this.f8294b.m24427c(z7);
    }
}

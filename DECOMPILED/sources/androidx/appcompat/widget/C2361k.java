package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.widget.AbstractC2458i;
import androidx.core.widget.C2459j;
import p111O.AbstractC1030Z;
import p111O.C1041d;
import p111O.InterfaceC0997I;
import p125Q.AbstractC1241a;
import p125Q.AbstractC1243c;
import p255h.AbstractC5520a;

/* JADX INFO: renamed from: androidx.appcompat.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C2361k extends EditText implements InterfaceC0997I {

    /* JADX INFO: renamed from: a */
    private final C2349e f8283a;

    /* JADX INFO: renamed from: b */
    private final C2289A f8284b;

    /* JADX INFO: renamed from: c */
    private final C2377z f8285c;

    /* JADX INFO: renamed from: d */
    private final C2459j f8286d;

    /* JADX INFO: renamed from: e */
    private final C2363l f8287e;

    /* JADX INFO: renamed from: f */
    private a f8288f;

    /* JADX INFO: renamed from: androidx.appcompat.widget.k$a */
    class a {
        a() {
        }

        /* JADX INFO: renamed from: a */
        public TextClassifier m10109a() {
            return C2361k.super.getTextClassifier();
        }

        /* JADX INFO: renamed from: b */
        public void m10110b(TextClassifier textClassifier) {
            C2361k.super.setTextClassifier(textClassifier);
        }
    }

    public C2361k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20950A);
    }

    private a getSuperCaller() {
        if (this.f8288f == null) {
            this.f8288f = new a();
        }
        return this.f8288f;
    }

    @Override // p111O.InterfaceC0997I
    /* JADX INFO: renamed from: a */
    public C1041d mo4373a(C1041d c1041d) {
        return this.f8286d.mo4371a(this, c1041d);
    }

    /* JADX INFO: renamed from: d */
    void m10108d(C2363l c2363l) {
        KeyListener keyListener = getKeyListener();
        if (c2363l.m10116b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM10115a = c2363l.m10115a(keyListener);
            if (keyListenerM10115a == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM10115a);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f8284b;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2458i.m10764o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8284b.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8284b.m9606k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2377z c2377z;
        return (Build.VERSION.SDK_INT >= 28 || (c2377z = this.f8285c) == null) ? getSuperCaller().m10109a() : c2377z.m10178a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM4429C;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8284b.m9613r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM10126a = AbstractC2365n.m10126a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM10126a != null && Build.VERSION.SDK_INT <= 30 && (strArrM4429C = AbstractC1030Z.m4429C(this)) != null) {
            AbstractC1241a.m5468c(editorInfo, strArrM4429C);
            inputConnectionM10126a = AbstractC1243c.m5477c(this, inputConnectionM10126a, editorInfo);
        }
        return this.f8287e.m10118d(inputConnectionM10126a, editorInfo);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC2373v.m10148a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (AbstractC2373v.m10149b(this, i7)) {
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8284b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8284b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2458i.m10765p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f8287e.m10119e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8287e.m10115a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f8283a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8284b.m9618w(colorStateList);
        this.f8284b.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8284b.m9619x(mode);
        this.f8284b.m9598b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C2289A c2289a = this.f8284b;
        if (c2289a != null) {
            c2289a.m9612q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2377z c2377z;
        if (Build.VERSION.SDK_INT >= 28 || (c2377z = this.f8285c) == null) {
            getSuperCaller().m10110b(textClassifier);
        } else {
            c2377z.m10179b(textClassifier);
        }
    }

    public C2361k(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2349e c2349e = new C2349e(this);
        this.f8283a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f8284b = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2289a.m9598b();
        this.f8285c = new C2377z(this);
        this.f8286d = new C2459j();
        C2363l c2363l = new C2363l(this);
        this.f8287e = c2363l;
        c2363l.m10117c(attributeSet, i7);
        m10108d(c2363l);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}

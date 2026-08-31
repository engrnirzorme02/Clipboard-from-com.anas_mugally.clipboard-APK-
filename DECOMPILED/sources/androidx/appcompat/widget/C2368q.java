package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p255h.AbstractC5520a;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C2368q extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    private static final int[] f8305d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    private final C2349e f8306a;

    /* JADX INFO: renamed from: b */
    private final C2289A f8307b;

    /* JADX INFO: renamed from: c */
    private final C2363l f8308c;

    public C2368q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20975m);
    }

    /* JADX INFO: renamed from: a */
    void m10139a(C2363l c2363l) {
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
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f8307b;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8307b.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8307b.m9606k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f8308c.m10118d(AbstractC2365n.m10126a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8307b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8307b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i7) {
        setDropDownBackgroundDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        this.f8308c.m10119e(z7);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8308c.m10115a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f8306a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8307b.m9618w(colorStateList);
        this.f8307b.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8307b.m9619x(mode);
        this.f8307b.m9598b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C2289A c2289a = this.f8307b;
        if (c2289a != null) {
            c2289a.m9612q(context, i7);
        }
    }

    public C2368q(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2348d0 c2348d0M10025v = C2348d0.m10025v(getContext(), attributeSet, f8305d, i7, 0);
        if (c2348d0M10025v.m10044s(0)) {
            setDropDownBackgroundDrawable(c2348d0M10025v.m10032g(0));
        }
        c2348d0M10025v.m10046x();
        C2349e c2349e = new C2349e(this);
        this.f8306a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f8307b = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2289a.m9598b();
        C2363l c2363l = new C2363l(this);
        this.f8308c = c2363l;
        c2363l.m10117c(attributeSet, i7);
        m10139a(c2363l);
    }
}

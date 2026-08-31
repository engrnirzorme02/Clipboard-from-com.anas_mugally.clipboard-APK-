package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.F */
/* JADX INFO: loaded from: classes.dex */
public class C2308F extends ToggleButton {

    /* JADX INFO: renamed from: a */
    private final C2349e f7916a;

    /* JADX INFO: renamed from: b */
    private final C2289A f7917b;

    /* JADX INFO: renamed from: c */
    private C2364m f7918c;

    public C2308F(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f7918c == null) {
            this.f7918c = new C2364m(this);
        }
        return this.f7918c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f7917b;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7917b.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7917b.m9606k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7917b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7917b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m10124e(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m10120a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f7916a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7917b.m9618w(colorStateList);
        this.f7917b.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7917b.m9619x(mode);
        this.f7917b.m9598b();
    }

    public C2308F(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2349e c2349e = new C2349e(this);
        this.f7916a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f7917b = c2289a;
        c2289a.m9608m(attributeSet, i7);
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
    }
}

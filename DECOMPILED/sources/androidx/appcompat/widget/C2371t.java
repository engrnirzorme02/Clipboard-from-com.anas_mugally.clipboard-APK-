package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.core.widget.InterfaceC2460k;
import p255h.AbstractC5520a;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.t */
/* JADX INFO: loaded from: classes.dex */
public class C2371t extends RadioButton implements InterfaceC2460k {

    /* JADX INFO: renamed from: a */
    private final C2357i f8314a;

    /* JADX INFO: renamed from: b */
    private final C2349e f8315b;

    /* JADX INFO: renamed from: c */
    private final C2289A f8316c;

    /* JADX INFO: renamed from: d */
    private C2364m f8317d;

    public C2371t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20955F);
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f8317d == null) {
            this.f8317d = new C2364m(this);
        }
        return this.f8317d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f8316c;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC2460k
    public ColorStateList getSupportButtonTintList() {
        C2357i c2357i = this.f8314a;
        if (c2357i != null) {
            return c2357i.m10079b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2357i c2357i = this.f8314a;
        if (c2357i != null) {
            return c2357i.m10080c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8316c.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8316c.m9606k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2357i c2357i = this.f8314a;
        if (c2357i != null) {
            c2357i.m10082e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8316c;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8316c;
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
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f8315b;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC2460k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2357i c2357i = this.f8314a;
        if (c2357i != null) {
            c2357i.m10083f(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC2460k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2357i c2357i = this.f8314a;
        if (c2357i != null) {
            c2357i.m10084g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8316c.m9618w(colorStateList);
        this.f8316c.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8316c.m9619x(mode);
        this.f8316c.m9598b();
    }

    public C2371t(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2357i c2357i = new C2357i(this);
        this.f8314a = c2357i;
        c2357i.m10081d(attributeSet, i7);
        C2349e c2349e = new C2349e(this);
        this.f8315b = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f8316c = c2289a;
        c2289a.m9608m(attributeSet, i7);
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }
}

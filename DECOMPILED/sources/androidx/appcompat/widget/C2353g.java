package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC2458i;
import p255h.AbstractC5520a;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.g */
/* JADX INFO: loaded from: classes.dex */
public class C2353g extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    private final C2355h f8233a;

    /* JADX INFO: renamed from: b */
    private final C2349e f8234b;

    /* JADX INFO: renamed from: c */
    private final C2289A f8235c;

    /* JADX INFO: renamed from: d */
    private C2364m f8236d;

    public C2353g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20978p);
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f8236d == null) {
            this.f8236d = new C2364m(this);
        }
        return this.f8236d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2289A c2289a = this.f8235c;
        if (c2289a != null) {
            c2289a.m9598b();
        }
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            c2355h.m10058a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2458i.m10764o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            return c2355h.m10059b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            return c2355h.m10060c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8235c.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8235c.m9606k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC2365n.m10126a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            c2355h.m10062e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8235c;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f8235c;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2458i.m10765p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m10124e(z7);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f8234b;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            c2355h.m10063f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2355h c2355h = this.f8233a;
        if (c2355h != null) {
            c2355h.m10064g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8235c.m9618w(colorStateList);
        this.f8235c.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8235c.m9619x(mode);
        this.f8235c.m9598b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C2289A c2289a = this.f8235c;
        if (c2289a != null) {
            c2289a.m9612q(context, i7);
        }
    }

    public C2353g(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2289A c2289a = new C2289A(this);
        this.f8235c = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2289a.m9598b();
        C2349e c2349e = new C2349e(this);
        this.f8234b = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2355h c2355h = new C2355h(this);
        this.f8233a = c2355h;
        c2355h.m10061d(attributeSet, i7);
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(AbstractC5659a.m25175b(getContext(), i7));
    }
}

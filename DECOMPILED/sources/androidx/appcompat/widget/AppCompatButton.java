package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AbstractC2458i;
import p255h.AbstractC5520a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* JADX INFO: renamed from: a */
    private final C2349e f7876a;

    /* JADX INFO: renamed from: b */
    private final C2289A f7877b;

    /* JADX INFO: renamed from: c */
    private C2364m f7878c;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5520a.f20976n);
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f7878c == null) {
            this.f7878c = new C2364m(this);
        }
        return this.f7878c;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2362k0.f8292c) {
            return super.getAutoSizeMaxTextSize();
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            return c2289a.m9600e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2362k0.f8292c) {
            return super.getAutoSizeMinTextSize();
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            return c2289a.m9601f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2362k0.f8292c) {
            return super.getAutoSizeStepGranularity();
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            return c2289a.m9602g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2362k0.f8292c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C2289A c2289a = this.f7877b;
        return c2289a != null ? c2289a.m9603h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC2362k0.f8292c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            return c2289a.m9604i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2458i.m10764o(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7877b.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7877b.m9606k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9610o(z7, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C2289A c2289a = this.f7877b;
        if (c2289a == null || AbstractC2362k0.f8292c || !c2289a.m9607l()) {
            return;
        }
        this.f7877b.m9599c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (AbstractC2362k0.f8292c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
            return;
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9615t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (AbstractC2362k0.f8292c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9616u(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (AbstractC2362k0.f8292c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9617v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC2458i.m10765p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z7) {
        getEmojiTextViewHelper().m10124e(z7);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m10120a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z7) {
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9614s(z7);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f7876a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7877b.m9618w(colorStateList);
        this.f7877b.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7877b.m9619x(mode);
        this.f7877b.m9598b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9612q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (AbstractC2362k0.f8292c) {
            super.setTextSize(i7, f7);
            return;
        }
        C2289A c2289a = this.f7877b;
        if (c2289a != null) {
            c2289a.m9597A(i7, f7);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        AbstractC2340Z.m9984a(this, getContext());
        C2349e c2349e = new C2349e(this);
        this.f7876a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f7877b = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2289a.m9598b();
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
    }
}

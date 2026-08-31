package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC2263x;
import androidx.core.widget.AbstractC2458i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p033E.AbstractC0264s;
import p097M.AbstractC0867k;
import p263i.AbstractC5659a;

/* JADX INFO: renamed from: androidx.appcompat.widget.B */
/* JADX INFO: loaded from: classes.dex */
public class C2303B extends TextView {

    /* JADX INFO: renamed from: a */
    private final C2349e f7882a;

    /* JADX INFO: renamed from: b */
    private final C2289A f7883b;

    /* JADX INFO: renamed from: c */
    private final C2377z f7884c;

    /* JADX INFO: renamed from: d */
    private C2364m f7885d;

    /* JADX INFO: renamed from: e */
    private boolean f7886e;

    /* JADX INFO: renamed from: f */
    private a f7887f;

    /* JADX INFO: renamed from: r */
    private Future f7888r;

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$a */
    private interface a {
        /* JADX INFO: renamed from: a */
        void mo9696a(int[] iArr, int i7);

        /* JADX INFO: renamed from: b */
        int[] mo9697b();

        /* JADX INFO: renamed from: c */
        TextClassifier mo9698c();

        /* JADX INFO: renamed from: d */
        int mo9699d();

        /* JADX INFO: renamed from: e */
        void mo9700e(TextClassifier textClassifier);

        /* JADX INFO: renamed from: f */
        void mo9701f(int i7);

        /* JADX INFO: renamed from: g */
        void mo9702g(int i7, int i8, int i9, int i10);

        /* JADX INFO: renamed from: h */
        int mo9703h();

        /* JADX INFO: renamed from: i */
        int mo9704i();

        /* JADX INFO: renamed from: j */
        void mo9705j(int i7);

        /* JADX INFO: renamed from: k */
        int mo9706k();

        /* JADX INFO: renamed from: l */
        void mo9707l(int i7);

        /* JADX INFO: renamed from: m */
        void mo9708m(int i7, float f7);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$b */
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: a */
        public void mo9696a(int[] iArr, int i7) {
            C2303B.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: b */
        public int[] mo9697b() {
            return C2303B.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: c */
        public TextClassifier mo9698c() {
            return C2303B.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: d */
        public int mo9699d() {
            return C2303B.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: e */
        public void mo9700e(TextClassifier textClassifier) {
            C2303B.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: f */
        public void mo9701f(int i7) {
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: g */
        public void mo9702g(int i7, int i8, int i9, int i10) {
            C2303B.super.setAutoSizeTextTypeUniformWithConfiguration(i7, i8, i9, i10);
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: h */
        public int mo9703h() {
            return C2303B.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: i */
        public int mo9704i() {
            return C2303B.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: j */
        public void mo9705j(int i7) {
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: k */
        public int mo9706k() {
            return C2303B.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: l */
        public void mo9707l(int i7) {
            C2303B.super.setAutoSizeTextTypeWithDefaults(i7);
        }

        @Override // androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: m */
        public void mo9708m(int i7, float f7) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$c */
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.C2303B.b, androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: f */
        public void mo9701f(int i7) {
            C2303B.super.setLastBaselineToBottomHeight(i7);
        }

        @Override // androidx.appcompat.widget.C2303B.b, androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: j */
        public void mo9705j(int i7) {
            C2303B.super.setFirstBaselineToTopHeight(i7);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.B$d */
    class d extends c {
        d() {
            super();
        }

        @Override // androidx.appcompat.widget.C2303B.b, androidx.appcompat.widget.C2303B.a
        /* JADX INFO: renamed from: m */
        public void mo9708m(int i7, float f7) {
            C2303B.super.setLineHeight(i7, f7);
        }
    }

    public C2303B(Context context) {
        this(context, null);
    }

    private C2364m getEmojiTextViewHelper() {
        if (this.f7885d == null) {
            this.f7885d = new C2364m(this);
        }
        return this.f7885d;
    }

    /* JADX INFO: renamed from: r */
    private void m9695r() {
        Future future = this.f7888r;
        if (future != null) {
            try {
                this.f7888r = null;
                AbstractC2263x.m9328a(future.get());
                AbstractC2458i.m10761l(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            c2349e.m10049b();
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9598b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC2362k0.f8292c) {
            return getSuperCaller().mo9699d();
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            return c2289a.m9600e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC2362k0.f8292c) {
            return getSuperCaller().mo9704i();
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            return c2289a.m9601f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC2362k0.f8292c) {
            return getSuperCaller().mo9706k();
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            return c2289a.m9602g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC2362k0.f8292c) {
            return getSuperCaller().mo9697b();
        }
        C2289A c2289a = this.f7883b;
        return c2289a != null ? c2289a.m9603h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC2362k0.f8292c) {
            return getSuperCaller().mo9703h() == 1 ? 1 : 0;
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            return c2289a.m9604i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC2458i.m10764o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return AbstractC2458i.m10750a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return AbstractC2458i.m10751b(this);
    }

    a getSuperCaller() {
        if (this.f7887f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f7887f = new d();
            } else if (i7 >= 28) {
                this.f7887f = new c();
            } else {
                this.f7887f = new b();
            }
        }
        return this.f7887f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            return c2349e.m10050c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            return c2349e.m10051d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f7883b.m9605j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f7883b.m9606k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m9695r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2377z c2377z;
        return (Build.VERSION.SDK_INT >= 28 || (c2377z = this.f7884c) == null) ? getSuperCaller().mo9698c() : c2377z.m10178a();
    }

    public AbstractC0867k.a getTextMetricsParamsCompat() {
        return AbstractC2458i.m10754e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f7883b.m9613r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC2365n.m10126a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9610o(z7, i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        m9695r();
        super.onMeasure(i7, i8);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        super.onTextChanged(charSequence, i7, i8, i9);
        C2289A c2289a = this.f7883b;
        if (c2289a == null || AbstractC2362k0.f8292c || !c2289a.m9607l()) {
            return;
        }
        this.f7883b.m9599c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z7) {
        super.setAllCaps(z7);
        getEmojiTextViewHelper().m10123d(z7);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i8, int i9, int i10) {
        if (AbstractC2362k0.f8292c) {
            getSuperCaller().mo9702g(i7, i8, i9, i10);
            return;
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9615t(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (AbstractC2362k0.f8292c) {
            getSuperCaller().mo9696a(iArr, i7);
            return;
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9616u(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (AbstractC2362k0.f8292c) {
            getSuperCaller().mo9707l(i7);
            return;
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9617v(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            c2349e.m10053f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            c2349e.m10054g(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2289A c2289a = this.f7883b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m10120a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo9705j(i7);
        } else {
            AbstractC2458i.m10757h(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo9701f(i7);
        } else {
            AbstractC2458i.m10758i(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        AbstractC2458i.m10759j(this, i7);
    }

    public void setPrecomputedText(AbstractC0867k abstractC0867k) {
        AbstractC2458i.m10761l(this, abstractC0867k);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            c2349e.m10056i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2349e c2349e = this.f7882a;
        if (c2349e != null) {
            c2349e.m10057j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f7883b.m9618w(colorStateList);
        this.f7883b.m9598b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f7883b.m9619x(mode);
        this.f7883b.m9598b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9612q(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2377z c2377z;
        if (Build.VERSION.SDK_INT >= 28 || (c2377z = this.f7884c) == null) {
            getSuperCaller().mo9700e(textClassifier);
        } else {
            c2377z.m10179b(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC0867k> future) {
        this.f7888r = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC0867k.a aVar) {
        AbstractC2458i.m10763n(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i7, float f7) {
        if (AbstractC2362k0.f8292c) {
            super.setTextSize(i7, f7);
            return;
        }
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9597A(i7, f7);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i7) {
        if (this.f7886e) {
            return;
        }
        Typeface typefaceM1224a = (typeface == null || i7 <= 0) ? null : AbstractC0264s.m1224a(getContext(), typeface, i7);
        this.f7886e = true;
        if (typefaceM1224a != null) {
            typeface = typefaceM1224a;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f7886e = false;
        }
    }

    public C2303B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7, float f7) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo9708m(i7, f7);
        } else {
            AbstractC2458i.m10760k(this, i7, f7);
        }
    }

    public C2303B(Context context, AttributeSet attributeSet, int i7) {
        super(C2342a0.m9997b(context), attributeSet, i7);
        this.f7886e = false;
        this.f7887f = null;
        AbstractC2340Z.m9984a(this, getContext());
        C2349e c2349e = new C2349e(this);
        this.f7882a = c2349e;
        c2349e.m10052e(attributeSet, i7);
        C2289A c2289a = new C2289A(this);
        this.f7883b = c2289a;
        c2289a.m9608m(attributeSet, i7);
        c2289a.m9598b();
        this.f7884c = new C2377z(this);
        getEmojiTextViewHelper().m10122c(attributeSet, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? AbstractC5659a.m25175b(context, i7) : null, i8 != 0 ? AbstractC5659a.m25175b(context, i8) : null, i9 != 0 ? AbstractC5659a.m25175b(context, i9) : null, i10 != 0 ? AbstractC5659a.m25175b(context, i10) : null);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i7, int i8, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? AbstractC5659a.m25175b(context, i7) : null, i8 != 0 ? AbstractC5659a.m25175b(context, i8) : null, i9 != 0 ? AbstractC5659a.m25175b(context, i9) : null, i10 != 0 ? AbstractC5659a.m25175b(context, i10) : null);
        C2289A c2289a = this.f7883b;
        if (c2289a != null) {
            c2289a.m9611p();
        }
    }
}

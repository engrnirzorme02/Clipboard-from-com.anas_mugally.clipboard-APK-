package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.emoji2.text.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2567o extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    private final Class f9895a;

    /* JADX INFO: renamed from: b */
    private final List f9896b;

    /* JADX INFO: renamed from: androidx.emoji2.text.o$a */
    private static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a */
        final Object f9897a;

        /* JADX INFO: renamed from: b */
        private final AtomicInteger f9898b = new AtomicInteger(0);

        a(Object obj) {
            this.f9897a = obj;
        }

        /* JADX INFO: renamed from: b */
        private boolean m11843b(Object obj) {
            return obj instanceof AbstractC2562j;
        }

        /* JADX INFO: renamed from: a */
        final void m11844a() {
            this.f9898b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f9897a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f9897a).beforeTextChanged(charSequence, i7, i8, i9);
        }

        /* JADX INFO: renamed from: c */
        final void m11845c() {
            this.f9898b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f9898b.get() <= 0 || !m11843b(obj)) {
                ((SpanWatcher) this.f9897a).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i7, int i8, int i9, int i10) {
            int i11;
            int i12;
            if (this.f9898b.get() <= 0 || !m11843b(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i11 = i7;
                    i12 = i9;
                } else {
                    if (i7 > i8) {
                        i7 = 0;
                    }
                    if (i9 > i10) {
                        i11 = i7;
                        i12 = 0;
                    } else {
                        i11 = i7;
                        i12 = i9;
                    }
                }
                ((SpanWatcher) this.f9897a).onSpanChanged(spannable, obj, i11, i8, i12, i10);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f9898b.get() <= 0 || !m11843b(obj)) {
                ((SpanWatcher) this.f9897a).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f9897a).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    C2567o(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f9896b = new ArrayList();
        AbstractC0910g.m4140h(cls, "watcherClass cannot be null");
        this.f9895a = cls;
    }

    /* JADX INFO: renamed from: b */
    private void m11834b() {
        for (int i7 = 0; i7 < this.f9896b.size(); i7++) {
            ((a) this.f9896b.get(i7)).m11844a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2567o m11835c(Class cls, CharSequence charSequence) {
        return new C2567o(cls, charSequence);
    }

    /* JADX INFO: renamed from: e */
    private void m11836e() {
        for (int i7 = 0; i7 < this.f9896b.size(); i7++) {
            ((a) this.f9896b.get(i7)).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: f */
    private a m11837f(Object obj) {
        for (int i7 = 0; i7 < this.f9896b.size(); i7++) {
            a aVar = (a) this.f9896b.get(i7);
            if (aVar.f9897a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private boolean m11838g(Class cls) {
        return this.f9895a == cls;
    }

    /* JADX INFO: renamed from: h */
    private boolean m11839h(Object obj) {
        return obj != null && m11838g(obj.getClass());
    }

    /* JADX INFO: renamed from: i */
    private void m11840i() {
        for (int i7 = 0; i7 < this.f9896b.size(); i7++) {
            ((a) this.f9896b.get(i7)).m11845c();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11841a() {
        m11834b();
    }

    /* JADX INFO: renamed from: d */
    public void m11842d() {
        m11840i();
        m11836e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarM11837f;
        if (m11839h(obj) && (aVarM11837f = m11837f(obj)) != null) {
            obj = aVarM11837f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarM11837f;
        if (m11839h(obj) && (aVarM11837f = m11837f(obj)) != null) {
            obj = aVarM11837f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarM11837f;
        if (m11839h(obj) && (aVarM11837f = m11837f(obj)) != null) {
            obj = aVarM11837f;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i7, int i8, Class cls) {
        if (!m11838g(cls)) {
            return super.getSpans(i7, i8, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            objArr[i9] = aVarArr[i9].f9897a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        if (cls == null || m11838g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarM11837f;
        if (m11839h(obj)) {
            aVarM11837f = m11837f(obj);
            if (aVarM11837f != null) {
                obj = aVarM11837f;
            }
        } else {
            aVarM11837f = null;
        }
        super.removeSpan(obj);
        if (aVarM11837f != null) {
            this.f9896b.remove(aVarM11837f);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (m11839h(obj)) {
            a aVar = new a(obj);
            this.f9896b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return new C2567o(this.f9895a, this, i7, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        m11834b();
        super.replace(i7, i8, charSequence);
        m11840i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    C2567o(Class cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f9896b = new ArrayList();
        AbstractC0910g.m4140h(cls, "watcherClass cannot be null");
        this.f9895a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        m11834b();
        super.replace(i7, i8, charSequence, i9, i10);
        m11840i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}

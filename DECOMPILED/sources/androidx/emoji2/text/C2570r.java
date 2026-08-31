package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p097M.AbstractC0867k;

/* JADX INFO: renamed from: androidx.emoji2.text.r */
/* JADX INFO: loaded from: classes.dex */
class C2570r implements Spannable {

    /* JADX INFO: renamed from: a */
    private boolean f9905a = false;

    /* JADX INFO: renamed from: b */
    private Spannable f9906b;

    /* JADX INFO: renamed from: androidx.emoji2.text.r$a */
    private static class a {
        /* JADX INFO: renamed from: a */
        static IntStream m11865a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* JADX INFO: renamed from: b */
        static IntStream m11866b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.r$b */
    static class b {
        b() {
        }

        /* JADX INFO: renamed from: a */
        boolean mo11867a(CharSequence charSequence) {
            return charSequence instanceof AbstractC0867k;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.r$c */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.C2570r.b
        /* JADX INFO: renamed from: a */
        boolean mo11867a(CharSequence charSequence) {
            return AbstractC2571s.m11868a(charSequence) || (charSequence instanceof AbstractC0867k);
        }
    }

    C2570r(Spannable spannable) {
        this.f9906b = spannable;
    }

    /* JADX INFO: renamed from: a */
    private void m11862a() {
        Spannable spannable = this.f9906b;
        if (!this.f9905a && m11863c().mo11867a(spannable)) {
            this.f9906b = new SpannableString(spannable);
        }
        this.f9905a = true;
    }

    /* JADX INFO: renamed from: c */
    static b m11863c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: renamed from: b */
    Spannable m11864b() {
        return this.f9906b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i7) {
        return this.f9906b.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m11865a(this.f9906b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m11866b(this.f9906b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f9906b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f9906b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f9906b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i7, int i8, Class cls) {
        return this.f9906b.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f9906b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f9906b.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m11862a();
        this.f9906b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i7, int i8, int i9) {
        m11862a();
        this.f9906b.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i7, int i8) {
        return this.f9906b.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f9906b.toString();
    }

    C2570r(CharSequence charSequence) {
        this.f9906b = new SpannableString(charSequence);
    }
}

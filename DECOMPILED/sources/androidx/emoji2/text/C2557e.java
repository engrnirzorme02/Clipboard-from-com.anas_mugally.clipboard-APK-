package androidx.emoji2.text;

import android.text.TextPaint;
import p033E.AbstractC0248c;

/* JADX INFO: renamed from: androidx.emoji2.text.e */
/* JADX INFO: loaded from: classes.dex */
class C2557e implements C2558f.e {

    /* JADX INFO: renamed from: b */
    private static final ThreadLocal f9814b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    private final TextPaint f9815a;

    C2557e() {
        TextPaint textPaint = new TextPaint();
        this.f9815a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: b */
    private static StringBuilder m11747b() {
        ThreadLocal threadLocal = f9814b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.C2558f.e
    /* JADX INFO: renamed from: a */
    public boolean mo11748a(CharSequence charSequence, int i7, int i8, int i9) {
        StringBuilder sbM11747b = m11747b();
        sbM11747b.setLength(0);
        while (i7 < i8) {
            sbM11747b.append(charSequence.charAt(i7));
            i7++;
        }
        return AbstractC0248c.m1189a(this.f9815a, sbM11747b.toString());
    }
}

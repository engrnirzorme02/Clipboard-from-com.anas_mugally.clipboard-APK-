package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import p104N.AbstractC0910g;

/* JADX INFO: renamed from: androidx.emoji2.text.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2562j extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    private final C2568p f9870b;

    /* JADX INFO: renamed from: a */
    private final Paint.FontMetricsInt f9869a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    private short f9871c = -1;

    /* JADX INFO: renamed from: d */
    private short f9872d = -1;

    /* JADX INFO: renamed from: e */
    private float f9873e = 1.0f;

    AbstractC2562j(C2568p c2568p) {
        AbstractC0910g.m4140h(c2568p, "rasterizer cannot be null");
        this.f9870b = c2568p;
    }

    /* JADX INFO: renamed from: a */
    public final C2568p m11804a() {
        return this.f9870b;
    }

    /* JADX INFO: renamed from: b */
    final int m11805b() {
        return this.f9871c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f9869a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f9869a;
        this.f9873e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f9870b.m11851e();
        this.f9872d = (short) (this.f9870b.m11851e() * this.f9873e);
        short sM11854i = (short) (this.f9870b.m11854i() * this.f9873e);
        this.f9871c = sM11854i;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f9869a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sM11854i;
    }
}

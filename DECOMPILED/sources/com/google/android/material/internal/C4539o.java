package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.C3553a;

/* JADX INFO: renamed from: com.google.android.material.internal.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C4539o {

    /* JADX INFO: renamed from: o */
    static final int f17353o = 1;

    /* JADX INFO: renamed from: a */
    private CharSequence f17354a;

    /* JADX INFO: renamed from: b */
    private final TextPaint f17355b;

    /* JADX INFO: renamed from: c */
    private final int f17356c;

    /* JADX INFO: renamed from: e */
    private int f17358e;

    /* JADX INFO: renamed from: l */
    private boolean f17365l;

    /* JADX INFO: renamed from: n */
    private InterfaceC4540p f17367n;

    /* JADX INFO: renamed from: d */
    private int f17357d = 0;

    /* JADX INFO: renamed from: f */
    private Layout.Alignment f17359f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g */
    private int f17360g = C3553a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: h */
    private float f17361h = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f17362i = 1.0f;

    /* JADX INFO: renamed from: j */
    private int f17363j = f17353o;

    /* JADX INFO: renamed from: k */
    private boolean f17364k = true;

    /* JADX INFO: renamed from: m */
    private TextUtils.TruncateAt f17366m = null;

    /* JADX INFO: renamed from: com.google.android.material.internal.o$a */
    public static class a extends Exception {
    }

    private C4539o(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f17354a = charSequence;
        this.f17355b = textPaint;
        this.f17356c = i7;
        this.f17358e = charSequence.length();
    }

    /* JADX INFO: renamed from: b */
    public static C4539o m20785b(CharSequence charSequence, TextPaint textPaint, int i7) {
        return new C4539o(charSequence, textPaint, i7);
    }

    /* JADX INFO: renamed from: a */
    public StaticLayout m20786a() {
        if (this.f17354a == null) {
            this.f17354a = "";
        }
        int iMax = Math.max(0, this.f17356c);
        CharSequence charSequenceEllipsize = this.f17354a;
        if (this.f17360g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f17355b, iMax, this.f17366m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f17358e);
        this.f17358e = iMin;
        if (this.f17365l && this.f17360g == 1) {
            this.f17359f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f17357d, iMin, this.f17355b, iMax);
        builderObtain.setAlignment(this.f17359f);
        builderObtain.setIncludePad(this.f17364k);
        builderObtain.setTextDirection(this.f17365l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f17366m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f17360g);
        float f7 = this.f17361h;
        if (f7 != 0.0f || this.f17362i != 1.0f) {
            builderObtain.setLineSpacing(f7, this.f17362i);
        }
        if (this.f17360g > 1) {
            builderObtain.setHyphenationFrequency(this.f17363j);
        }
        InterfaceC4540p interfaceC4540p = this.f17367n;
        if (interfaceC4540p != null) {
            interfaceC4540p.mo20795a(builderObtain);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: c */
    public C4539o m20787c(Layout.Alignment alignment) {
        this.f17359f = alignment;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C4539o m20788d(TextUtils.TruncateAt truncateAt) {
        this.f17366m = truncateAt;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C4539o m20789e(int i7) {
        this.f17363j = i7;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C4539o m20790f(boolean z7) {
        this.f17364k = z7;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C4539o m20791g(boolean z7) {
        this.f17365l = z7;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C4539o m20792h(float f7, float f8) {
        this.f17361h = f7;
        this.f17362i = f8;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C4539o m20793i(int i7) {
        this.f17360g = i7;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public C4539o m20794j(InterfaceC4540p interfaceC4540p) {
        this.f17367n = interfaceC4540p;
        return this;
    }
}

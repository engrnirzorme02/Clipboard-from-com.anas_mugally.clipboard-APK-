package com.google.android.material.carousel;

import p065I.AbstractC0577a;

/* JADX INFO: renamed from: com.google.android.material.carousel.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4447a {

    /* JADX INFO: renamed from: a */
    final int f16684a;

    /* JADX INFO: renamed from: b */
    float f16685b;

    /* JADX INFO: renamed from: c */
    int f16686c;

    /* JADX INFO: renamed from: d */
    int f16687d;

    /* JADX INFO: renamed from: e */
    float f16688e;

    /* JADX INFO: renamed from: f */
    float f16689f;

    /* JADX INFO: renamed from: g */
    final int f16690g;

    /* JADX INFO: renamed from: h */
    final float f16691h;

    public C4447a(int i7, float f7, float f8, float f9, int i8, float f10, int i9, float f11, int i10, float f12) {
        this.f16684a = i7;
        this.f16685b = AbstractC0577a.m2540a(f7, f8, f9);
        this.f16686c = i8;
        this.f16688e = f10;
        this.f16687d = i9;
        this.f16689f = f11;
        this.f16690g = i10;
        m19943d(f12, f8, f9, f11);
        this.f16691h = m19941b(f11);
    }

    /* JADX INFO: renamed from: a */
    private float m19940a(float f7, int i7, float f8, int i8, int i9) {
        if (i7 <= 0) {
            f8 = 0.0f;
        }
        float f9 = i8 / 2.0f;
        return (f7 - ((i7 + f9) * f8)) / (i9 + f9);
    }

    /* JADX INFO: renamed from: b */
    private float m19941b(float f7) {
        if (m19945g()) {
            return Math.abs(f7 - this.f16689f) * this.f16684a;
        }
        return Float.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public static C4447a m19942c(float f7, float f8, float f9, float f10, int[] iArr, float f11, int[] iArr2, float f12, int[] iArr3) {
        C4447a c4447a = null;
        int i7 = 1;
        for (int i8 : iArr3) {
            int length = iArr2.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = iArr2[i9];
                int length2 = iArr.length;
                int i11 = 0;
                while (i11 < length2) {
                    int i12 = length;
                    int i13 = i9;
                    int i14 = i7;
                    int i15 = length2;
                    int i16 = i11;
                    C4447a c4447a2 = new C4447a(i14, f8, f9, f10, iArr[i11], f11, i10, f12, i8, f7);
                    if (c4447a == null || c4447a2.f16691h < c4447a.f16691h) {
                        if (c4447a2.f16691h == 0.0f) {
                            return c4447a2;
                        }
                        c4447a = c4447a2;
                    }
                    int i17 = i14 + 1;
                    i11 = i16 + 1;
                    i9 = i13;
                    i7 = i17;
                    length = i12;
                    length2 = i15;
                }
                i9++;
                i7 = i7;
                length = length;
            }
        }
        return c4447a;
    }

    /* JADX INFO: renamed from: d */
    private void m19943d(float f7, float f8, float f9, float f10) {
        float fM19944f = f7 - m19944f();
        int i7 = this.f16686c;
        if (i7 > 0 && fM19944f > 0.0f) {
            float f11 = this.f16685b;
            this.f16685b = f11 + Math.min(fM19944f / i7, f9 - f11);
        } else if (i7 > 0 && fM19944f < 0.0f) {
            float f12 = this.f16685b;
            this.f16685b = f12 + Math.max(fM19944f / i7, f8 - f12);
        }
        int i8 = this.f16686c;
        float f13 = i8 > 0 ? this.f16685b : 0.0f;
        this.f16685b = f13;
        float fM19940a = m19940a(f7, i8, f13, this.f16687d, this.f16690g);
        this.f16689f = fM19940a;
        float f14 = (this.f16685b + fM19940a) / 2.0f;
        this.f16688e = f14;
        int i9 = this.f16687d;
        if (i9 <= 0 || fM19940a == f10) {
            return;
        }
        float f15 = (f10 - fM19940a) * this.f16690g;
        float fMin = Math.min(Math.abs(f15), f14 * 0.1f * i9);
        if (f15 > 0.0f) {
            this.f16688e -= fMin / this.f16687d;
            this.f16689f += fMin / this.f16690g;
        } else {
            this.f16688e += fMin / this.f16687d;
            this.f16689f -= fMin / this.f16690g;
        }
    }

    /* JADX INFO: renamed from: f */
    private float m19944f() {
        return (this.f16689f * this.f16690g) + (this.f16688e * this.f16687d) + (this.f16685b * this.f16686c);
    }

    /* JADX INFO: renamed from: g */
    private boolean m19945g() {
        int i7 = this.f16690g;
        if (i7 <= 0 || this.f16686c <= 0 || this.f16687d <= 0) {
            return i7 <= 0 || this.f16686c <= 0 || this.f16689f > this.f16685b;
        }
        float f7 = this.f16689f;
        float f8 = this.f16688e;
        return f7 > f8 && f8 > this.f16685b;
    }

    /* JADX INFO: renamed from: e */
    int m19946e() {
        return this.f16686c + this.f16687d + this.f16690g;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f16684a + ", smallCount=" + this.f16686c + ", smallSize=" + this.f16685b + ", mediumCount=" + this.f16687d + ", mediumSize=" + this.f16688e + ", largeCount=" + this.f16690g + ", largeSize=" + this.f16689f + ", cost=" + this.f16691h + "]";
    }
}

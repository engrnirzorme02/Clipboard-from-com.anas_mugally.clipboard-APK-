package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import p373v3.InterfaceC7227a;

/* JADX INFO: renamed from: com.google.android.material.carousel.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4449c {

    /* JADX INFO: renamed from: a */
    private float f16695a;

    /* JADX INFO: renamed from: b */
    private float f16696b;

    /* JADX INFO: renamed from: com.google.android.material.carousel.c$a */
    enum a {
        CONTAINED,
        UNCONTAINED
    }

    /* JADX INFO: renamed from: a */
    static int[] m19959a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr2[i7] = iArr[i7] * 2;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: b */
    public static float m19960b(float f7, float f8, float f9) {
        return 1.0f - ((f7 - f9) / (f8 - f9));
    }

    /* JADX INFO: renamed from: c */
    public float m19961c() {
        return this.f16696b;
    }

    /* JADX INFO: renamed from: d */
    public float m19962d() {
        return this.f16695a;
    }

    /* JADX INFO: renamed from: e */
    a m19963e() {
        return a.CONTAINED;
    }

    /* JADX INFO: renamed from: f */
    void m19964f(Context context) {
        float fM19975h = this.f16695a;
        if (fM19975h <= 0.0f) {
            fM19975h = AbstractC4450d.m19975h(context);
        }
        this.f16695a = fM19975h;
        float fM19974g = this.f16696b;
        if (fM19974g <= 0.0f) {
            fM19974g = AbstractC4450d.m19974g(context);
        }
        this.f16696b = fM19974g;
    }

    /* JADX INFO: renamed from: g */
    public abstract C4451e mo19965g(InterfaceC7227a interfaceC7227a, View view);

    /* JADX INFO: renamed from: h */
    public abstract boolean mo19966h(InterfaceC7227a interfaceC7227a, int i7);
}

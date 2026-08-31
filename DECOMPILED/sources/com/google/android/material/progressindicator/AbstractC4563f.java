package com.google.android.material.progressindicator;

import androidx.vectordrawable.graphics.drawable.AbstractC2860b;
import java.util.ArrayList;
import java.util.List;
import p065I.AbstractC0577a;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.f */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4563f {

    /* JADX INFO: renamed from: a */
    protected C4564g f17517a;

    /* JADX INFO: renamed from: b */
    protected final List f17518b = new ArrayList();

    protected AbstractC4563f(int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            this.f17518b.add(new AbstractC4562e.a());
        }
    }

    /* JADX INFO: renamed from: a */
    abstract void mo20955a();

    /* JADX INFO: renamed from: b */
    protected float m20956b(int i7, int i8, int i9) {
        return AbstractC0577a.m2540a((i7 - i8) / i9, 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo20957c();

    /* JADX INFO: renamed from: d */
    public abstract void mo20958d(AbstractC2860b abstractC2860b);

    /* JADX INFO: renamed from: e */
    protected void m20959e(C4564g c4564g) {
        this.f17517a = c4564g;
    }

    /* JADX INFO: renamed from: f */
    abstract void mo20960f();

    /* JADX INFO: renamed from: g */
    abstract void mo20961g();

    /* JADX INFO: renamed from: h */
    public abstract void mo20962h();
}

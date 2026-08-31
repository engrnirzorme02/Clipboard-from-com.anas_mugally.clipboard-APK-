package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import p111O.C0982A0;
import p111O.C1063n0;
import p333q3.AbstractC6826a;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.c */
/* JADX INFO: loaded from: classes2.dex */
class C4429c extends C1063n0.b {

    /* JADX INFO: renamed from: c */
    private final View f16540c;

    /* JADX INFO: renamed from: d */
    private int f16541d;

    /* JADX INFO: renamed from: e */
    private int f16542e;

    /* JADX INFO: renamed from: f */
    private final int[] f16543f;

    public C4429c(View view) {
        super(0);
        this.f16543f = new int[2];
        this.f16540c = view;
    }

    @Override // p111O.C1063n0.b
    /* JADX INFO: renamed from: b */
    public void mo4719b(C1063n0 c1063n0) {
        this.f16540c.setTranslationY(0.0f);
    }

    @Override // p111O.C1063n0.b
    /* JADX INFO: renamed from: c */
    public void mo4720c(C1063n0 c1063n0) {
        this.f16540c.getLocationOnScreen(this.f16543f);
        this.f16541d = this.f16543f[1];
    }

    @Override // p111O.C1063n0.b
    /* JADX INFO: renamed from: d */
    public C0982A0 mo4721d(C0982A0 c0982a0, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1063n0 c1063n0 = (C1063n0) it.next();
            if ((c1063n0.m4712c() & C0982A0.p.m4329b()) != 0) {
                this.f16540c.setTranslationY(AbstractC6826a.m29845c(this.f16542e, 0, c1063n0.m4711b()));
                break;
            }
        }
        return c0982a0;
    }

    @Override // p111O.C1063n0.b
    /* JADX INFO: renamed from: e */
    public C1063n0.a mo4722e(C1063n0 c1063n0, C1063n0.a aVar) {
        this.f16540c.getLocationOnScreen(this.f16543f);
        int i7 = this.f16541d - this.f16543f[1];
        this.f16542e = i7;
        this.f16540c.setTranslationY(i7);
        return aVar;
    }
}

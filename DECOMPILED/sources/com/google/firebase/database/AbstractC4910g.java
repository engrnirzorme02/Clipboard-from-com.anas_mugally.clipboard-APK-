package com.google.firebase.database;

import com.google.android.gms.tasks.Task;
import p006A4.C0023h;
import p006A4.C0024i;
import p374v4.C7245j;
import p374v4.C7247l;

/* JADX INFO: renamed from: com.google.firebase.database.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4910g {

    /* JADX INFO: renamed from: a */
    protected final C7247l f18636a;

    /* JADX INFO: renamed from: b */
    protected final C7245j f18637b;

    /* JADX INFO: renamed from: c */
    protected final C0023h f18638c = C0023h.f119i;

    /* JADX INFO: renamed from: d */
    private final boolean f18639d = false;

    AbstractC4910g(C7247l c7247l, C7245j c7245j) {
        this.f18636a = c7247l;
        this.f18637b = c7245j;
    }

    /* JADX INFO: renamed from: a */
    public Task m22124a() {
        return this.f18636a.m32049M(this);
    }

    /* JADX INFO: renamed from: b */
    public C7245j m22125b() {
        return this.f18637b;
    }

    /* JADX INFO: renamed from: c */
    public C4905b m22126c() {
        return new C4905b(this.f18636a, m22125b());
    }

    /* JADX INFO: renamed from: d */
    public C0024i m22127d() {
        return new C0024i(this.f18637b, this.f18638c);
    }
}

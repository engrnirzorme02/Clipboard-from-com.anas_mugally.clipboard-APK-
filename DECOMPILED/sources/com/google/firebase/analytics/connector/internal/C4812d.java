package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import p171W3.InterfaceC1862a;
import p275j3.C5862a;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4812d {

    /* JADX INFO: renamed from: a */
    final Set f18429a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1862a.b f18430b;

    /* JADX INFO: renamed from: c */
    private final C5862a f18431c;

    /* JADX INFO: renamed from: d */
    private final C4811c f18432d;

    public C4812d(C5862a c5862a, InterfaceC1862a.b bVar) {
        this.f18430b = bVar;
        this.f18431c = c5862a;
        C4811c c4811c = new C4811c(this);
        this.f18432d = c4811c;
        c5862a.m26277b(c4811c);
        this.f18429a = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ InterfaceC1862a.b m21963a() {
        return this.f18430b;
    }
}

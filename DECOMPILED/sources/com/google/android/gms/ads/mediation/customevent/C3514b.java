package com.google.android.gms.ads.mediation.customevent;

import java.util.Objects;
import p012B2.InterfaceC0074o;
import p020C2.InterfaceC0139c;

/* JADX INFO: renamed from: com.google.android.gms.ads.mediation.customevent.b */
/* JADX INFO: loaded from: classes.dex */
final class C3514b implements InterfaceC0139c {

    /* JADX INFO: renamed from: a */
    private final CustomEventAdapter f14365a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0074o f14366b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ CustomEventAdapter f14367c;

    public C3514b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, InterfaceC0074o interfaceC0074o) {
        Objects.requireNonNull(customEventAdapter);
        this.f14367c = customEventAdapter;
        this.f14365a = customEventAdapter2;
        this.f14366b = interfaceC0074o;
    }
}

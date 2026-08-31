package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.o */
/* JADX INFO: loaded from: classes.dex */
final class C3374o extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14043b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3369m2 f14044c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f14045d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3411y f14046e;

    C3374o(C3411y c3411y, Context context, C3369m2 c3369m2, String str) {
        this.f14043b = context;
        this.f14044c = c3369m2;
        this.f14045d = str;
        Objects.requireNonNull(c3411y);
        this.f14046e = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14043b, "search");
        return new BinderC3273K1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        return this.f14046e.m17356m().m17226a(this.f14043b, this.f14044c, this.f14045d, null, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17178p0(BinderC3773b.m18221N0(this.f14043b), this.f14044c, this.f14045d, ModuleDescriptor.MODULE_VERSION);
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.p */
/* JADX INFO: loaded from: classes.dex */
final class C3378p extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14053b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3369m2 f14054c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f14055d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ zzbox f14056e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3411y f14057f;

    C3378p(C3411y c3411y, Context context, C3369m2 c3369m2, String str, zzbox zzboxVar) {
        this.f14053b = context;
        this.f14054c = c3369m2;
        this.f14055d = str;
        this.f14056e = zzboxVar;
        Objects.requireNonNull(c3411y);
        this.f14057f = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14053b, "interstitial");
        return new BinderC3273K1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        return this.f14057f.m17356m().m17226a(this.f14053b, this.f14054c, this.f14055d, this.f14056e, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17182z(BinderC3773b.m18221N0(this.f14053b), this.f14054c, this.f14055d, this.f14056e, ModuleDescriptor.MODULE_VERSION);
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.m */
/* JADX INFO: loaded from: classes.dex */
final class C3366m extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14002b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3369m2 f14003c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f14004d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ zzbox f14005e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3411y f14006f;

    C3366m(C3411y c3411y, Context context, C3369m2 c3369m2, String str, zzbox zzboxVar) {
        this.f14002b = context;
        this.f14003c = c3369m2;
        this.f14004d = str;
        this.f14005e = zzboxVar;
        Objects.requireNonNull(c3411y);
        this.f14006f = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14002b, "banner");
        return new BinderC3273K1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        return this.f14006f.m17356m().m17226a(this.f14002b, this.f14003c, this.f14004d, this.f14005e, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17169H(BinderC3773b.m18221N0(this.f14002b), this.f14003c, this.f14004d, this.f14005e, ModuleDescriptor.MODULE_VERSION);
    }
}

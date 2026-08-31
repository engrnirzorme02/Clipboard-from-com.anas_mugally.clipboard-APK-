package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.n */
/* JADX INFO: loaded from: classes.dex */
final class C3370n extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f14037b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3369m2 f14038c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f14039d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ zzbox f14040e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3411y f14041f;

    C3370n(C3411y c3411y, Context context, C3369m2 c3369m2, String str, zzbox zzboxVar) {
        this.f14037b = context;
        this.f14038c = c3369m2;
        this.f14039d = str;
        this.f14040e = zzboxVar;
        Objects.requireNonNull(c3411y);
        this.f14041f = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14037b, "app_open");
        return new BinderC3273K1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        return this.f14041f.m17356m().m17226a(this.f14037b, this.f14038c, this.f14039d, this.f14040e, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17177n(BinderC3773b.m18221N0(this.f14037b), this.f14038c, this.f14039d, this.f14040e, ModuleDescriptor.MODULE_VERSION);
    }
}

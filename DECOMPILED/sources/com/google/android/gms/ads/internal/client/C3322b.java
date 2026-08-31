package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbwm;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.b */
/* JADX INFO: loaded from: classes.dex */
final class C3322b extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f13913b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f13914c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ zzbox f13915d;

    C3322b(C3411y c3411y, Context context, String str, zzbox zzboxVar) {
        this.f13913b = context;
        this.f13914c = str;
        this.f13915d = zzboxVar;
        Objects.requireNonNull(c3411y);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f13913b, "rewarded");
        return new BinderC3288P1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        return zzbwm.zza(this.f13913b, this.f13914c, this.f13915d);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17174f(BinderC3773b.m18221N0(this.f13913b), this.f13914c, this.f13915d, ModuleDescriptor.MODULE_VERSION);
    }
}

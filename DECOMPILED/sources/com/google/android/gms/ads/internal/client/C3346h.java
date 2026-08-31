package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbyh;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.h */
/* JADX INFO: loaded from: classes.dex */
final class C3346h extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f13934b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbox f13935c;

    C3346h(C3411y c3411y, Context context, zzbox zzboxVar) {
        this.f13934b = context;
        this.f13935c = zzboxVar;
        Objects.requireNonNull(c3411y);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f13934b;
        try {
            return ((zzbyh) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", C3342g.f13933a)).zze(BinderC3773b.m18221N0(context), this.f13935c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | NullPointerException | C7602s unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17176m(BinderC3773b.m18221N0(this.f13934b), this.f13935c, ModuleDescriptor.MODULE_VERSION);
    }
}

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbki;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbox;
import java.util.Objects;
import p348s2.InterfaceC7004b;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.l */
/* JADX INFO: loaded from: classes.dex */
final class C3362l extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f13983b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbox f13984c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ InterfaceC7004b f13985d;

    C3362l(C3411y c3411y, Context context, zzbox zzboxVar, InterfaceC7004b interfaceC7004b) {
        this.f13983b = context;
        this.f13984c = zzboxVar;
        this.f13985d = interfaceC7004b;
        Objects.requireNonNull(c3411y);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* synthetic */ Object mo17185a() {
        return new zzbkv();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f13983b;
        try {
            return ((zzbkr) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", C3358k.f13981a)).zze(BinderC3773b.m18221N0(context), this.f13984c, ModuleDescriptor.MODULE_VERSION, new zzbki(this.f13985d));
        } catch (RemoteException | NullPointerException | C7602s unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17179q0(BinderC3773b.m18221N0(this.f13983b), this.f13984c, ModuleDescriptor.MODULE_VERSION, new zzbki(this.f13985d));
    }
}

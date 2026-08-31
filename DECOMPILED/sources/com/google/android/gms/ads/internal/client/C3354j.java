package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbss;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.j */
/* JADX INFO: loaded from: classes.dex */
final class C3354j extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f13978b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbox f13979c;

    C3354j(C3411y c3411y, Context context, zzbox zzboxVar) {
        this.f13978b = context;
        this.f13979c = zzboxVar;
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
        Context context = this.f13978b;
        try {
            return ((zzbss) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", C3350i.f13964a)).zze(BinderC3773b.m18221N0(context), this.f13979c, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | NullPointerException | C7602s unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17171b(BinderC3773b.m18221N0(this.f13978b), this.f13979c, ModuleDescriptor.MODULE_VERSION);
    }
}

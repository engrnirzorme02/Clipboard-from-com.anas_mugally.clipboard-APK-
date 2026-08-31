package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.f */
/* JADX INFO: loaded from: classes.dex */
final class C3338f extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f13930b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ zzbox f13931c;

    C3338f(C3411y c3411y, Context context, zzbox zzboxVar) {
        this.f13930b = context;
        this.f13931c = zzboxVar;
        Objects.requireNonNull(c3411y);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f13930b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f13930b;
        InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(context);
        zzbci.zza(context);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkh)).booleanValue()) {
            try {
                return ((C3313Y0) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", C3334e.f13928a)).m17217L0(interfaceC3772aM18221N0, this.f13931c, ModuleDescriptor.MODULE_VERSION);
            } catch (RemoteException | NullPointerException | C7602s e7) {
                zzbtt.zza(this.f13930b).zzh(e7, "ClientApiBroker.getOutOfContextTester");
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        Context context = this.f13930b;
        InterfaceC3772a interfaceC3772aM18221N0 = BinderC3773b.m18221N0(context);
        zzbci.zza(context);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkh)).booleanValue()) {
            return interfaceC3387r0.mo17170K0(interfaceC3772aM18221N0, this.f13931c, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}

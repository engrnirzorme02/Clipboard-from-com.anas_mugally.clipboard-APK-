package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.x */
/* JADX INFO: loaded from: classes.dex */
final class C3408x extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ FrameLayout f14115b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ FrameLayout f14116c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Context f14117d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C3411y f14118e;

    C3408x(C3411y c3411y, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f14115b = frameLayout;
        this.f14116c = frameLayout2;
        this.f14117d = context;
        Objects.requireNonNull(c3411y);
        this.f14118e = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f14117d, "native_ad_view_delegate");
        return new BinderC3282N1();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Context context = this.f14117d;
        zzbci.zza(context);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            C3411y c3411y = this.f14118e;
            return c3411y.m17359p().zza(this.f14117d, this.f14115b, this.f14116c);
        }
        try {
            return zzbfz.zzdK(((zzbgd) AbstractC7603t.m33337a(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", C3405w.f14101a)).zze(BinderC3773b.m18221N0(context), BinderC3773b.m18221N0(this.f14115b), BinderC3773b.m18221N0(this.f14116c), ModuleDescriptor.MODULE_VERSION));
        } catch (RemoteException | NullPointerException | C7602s e7) {
            C3411y c3411y2 = this.f14118e;
            c3411y2.m17362s(zzbtt.zza(this.f14117d));
            c3411y2.m17361r().zzh(e7, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.mo17172c(BinderC3773b.m18221N0(this.f14115b), BinderC3773b.m18221N0(this.f14116c));
    }
}

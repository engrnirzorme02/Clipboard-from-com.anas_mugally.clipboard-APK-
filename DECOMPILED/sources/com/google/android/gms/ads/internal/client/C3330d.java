package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtt;
import java.util.Objects;
import p404z2.AbstractC7603t;
import p404z2.C7602s;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.d */
/* JADX INFO: loaded from: classes.dex */
final class C3330d extends AbstractC3241A {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f13926b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C3411y f13927c;

    C3330d(C3411y c3411y, Activity activity) {
        this.f13926b = activity;
        Objects.requireNonNull(c3411y);
        this.f13927c = c3411y;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo17185a() {
        C3411y.m17344l(this.f13926b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17186b() {
        Activity activity = this.f13926b;
        zzbci.zza(activity);
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlx)).booleanValue()) {
            C3411y c3411y = this.f13927c;
            return c3411y.m17360q().zza(this.f13926b);
        }
        try {
            return zzbsv.zzI(((zzbsz) AbstractC7603t.m33337a(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", C3326c.f13923a)).zze(BinderC3773b.m18221N0(activity)));
        } catch (RemoteException | NullPointerException | C7602s e7) {
            C3411y c3411y2 = this.f13927c;
            c3411y2.m17362s(zzbtt.zza(this.f13926b.getApplicationContext()));
            c3411y2.m17361r().zzh(e7, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC3241A
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17187c(InterfaceC3387r0 interfaceC3387r0) {
        return interfaceC3387r0.zzg(BinderC3773b.m18221N0(this.f13926b));
    }
}

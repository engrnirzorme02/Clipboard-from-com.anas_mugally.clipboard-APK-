package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3339f0;
import com.google.android.gms.ads.internal.client.InterfaceC3347h0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.ScheduledExecutorService;
import p157U3.InterfaceFutureC1673e;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkh extends zzflb {
    public zzfkh(ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3339f0 interfaceC3339f0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        super(clientApi, context, i7, zzfdyVar, c3296s1, interfaceC3339f0, scheduledExecutorService, zzfkfVar, interfaceC3750e);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final InterfaceFutureC1673e zza(Context context) {
        InterfaceC3312Y interfaceC3312YMo17182z;
        zzbox zzboxVarZzd = this.zzd.zzd();
        if (zzboxVarZzd != null && (interfaceC3312YMo17182z = this.zza.mo17182z(BinderC3773b.m18221N0(context), new C3369m2(), this.zze.f13901a, zzboxVarZzd, this.zzc)) != null) {
            zzgpm zzgpmVarZze = zzgpm.zze();
            try {
                zzs(this.zze.f13903c);
                interfaceC3312YMo17182z.zzQ(this.zze.f13903c, new zzfkg(this, zzgpmVarZze, interfaceC3312YMo17182z));
                return zzgpmVarZze;
            } catch (RemoteException e7) {
                AbstractC7599p.m33332g("Failed to load interstitial ad.", e7);
                return zzgot.zzc(new zzfjx(1, "remote exception"));
            }
        }
        return zzgot.zzc(new zzfjx(1, "Failed to create an interstitial ad manager."));
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final /* bridge */ /* synthetic */ InterfaceC3328c1 zzb(Object obj) {
        try {
            return ((InterfaceC3312Y) obj).zzt();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Failed to get response info for  the interstitial ad.", e7);
            return null;
        }
    }

    public zzfkh(String str, ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        super(str, clientApi, context, i7, zzfdyVar, c3296s1, interfaceC3347h0, scheduledExecutorService, zzfkfVar, interfaceC3750e);
    }
}

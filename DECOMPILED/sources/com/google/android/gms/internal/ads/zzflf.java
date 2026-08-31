package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.C3296S1;
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
public final class zzflf extends zzflb {
    public zzflf(ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3339f0 interfaceC3339f0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        super(clientApi, context, i7, zzfdyVar, c3296s1, interfaceC3339f0, scheduledExecutorService, zzfkfVar, interfaceC3750e);
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final InterfaceFutureC1673e zza(Context context) {
        zzbwa zzbwaVarMo17174f;
        zzbox zzboxVarZzd = this.zzd.zzd();
        if (zzboxVarZzd != null && (zzbwaVarMo17174f = this.zza.mo17174f(BinderC3773b.m18221N0(context), this.zze.f13901a, zzboxVarZzd, this.zzc)) != null) {
            zzgpm zzgpmVarZze = zzgpm.zze();
            try {
                zzs(this.zze.f13903c);
                zzbwaVarMo17174f.zzc(this.zze.f13903c, new zzfle(this, zzgpmVarZze, zzbwaVarMo17174f));
                return zzgpmVarZze;
            } catch (RemoteException unused) {
                AbstractC7599p.m33331f("Failed to load rewarded ad.");
                return zzgot.zzc(new zzfjx(1, "remote exception"));
            }
        }
        return zzgot.zzc(new zzfjx(1, "Failed to create a rewarded ad."));
    }

    @Override // com.google.android.gms.internal.ads.zzflb
    protected final /* bridge */ /* synthetic */ InterfaceC3328c1 zzb(Object obj) {
        try {
            return ((zzbwa) obj).zzm();
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Failed to get response info for the rewarded ad.", e7);
            return null;
        }
    }

    public zzflf(String str, ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        super(str, clientApi, context, i7, zzfdyVar, c3296s1, interfaceC3347h0, scheduledExecutorService, zzfkfVar, interfaceC3750e);
    }
}

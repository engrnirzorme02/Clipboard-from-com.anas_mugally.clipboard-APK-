package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdjz implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnx zzd;
    private final InterfaceC3750e zze;
    private zzbhn zzf;
    private zzbjl zzg;

    public zzdjz(zzdnx zzdnxVar, InterfaceC3750e interfaceC3750e) {
        this.zzd = zzdnxVar;
        this.zze = interfaceC3750e;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.mo18159a() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzbhn zzbhnVar) {
        this.zzf = zzbhnVar;
        zzbjl zzbjlVar = this.zzg;
        if (zzbjlVar != null) {
            this.zzd.zze("/unconfirmedClick", zzbjlVar);
        }
        zzbjl zzbjlVar2 = new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdjz zzdjzVar = this.zza;
                try {
                    zzdjzVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhn zzbhnVar2 = zzbhnVar;
                zzdjzVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhnVar2 == null) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbhnVar2.zze(str);
                    } catch (RemoteException e7) {
                        AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                    }
                }
            }
        };
        this.zzg = zzbjlVar2;
        this.zzd.zzd("/unconfirmedClick", zzbjlVar2);
    }

    public final zzbhn zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e7) {
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }
}

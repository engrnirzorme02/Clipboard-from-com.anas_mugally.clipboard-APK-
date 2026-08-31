package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzefh extends zzbqj {
    final /* synthetic */ zzefi zza;
    private final zzeec zzb;

    /* synthetic */ zzefh(zzefi zzefiVar, zzeec zzeecVar, byte[] bArr) {
        Objects.requireNonNull(zzefiVar);
        this.zza = zzefiVar;
        this.zzb = zzeecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(InterfaceC3772a interfaceC3772a) {
        this.zza.zzd((View) BinderC3773b.m18220M0(interfaceC3772a));
        ((zzefo) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        ((zzefo) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzg(C3324b1 c3324b1) {
        ((zzefo) this.zzb.zzc).zzx(c3324b1);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzh(zzbpg zzbpgVar) {
        this.zza.zze(zzbpgVar);
        ((zzefo) this.zzb.zzc).zzj();
    }
}

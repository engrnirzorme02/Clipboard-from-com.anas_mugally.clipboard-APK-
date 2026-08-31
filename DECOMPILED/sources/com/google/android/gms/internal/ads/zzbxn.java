package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxn extends zzbxs {
    final zzhqg zza;
    final zzhqg zzb;
    final zzhqg zzc;
    final zzhqg zzd;
    final zzhqg zze;
    final zzhqg zzf;
    final zzhqg zzg;
    final zzhqg zzh;
    private final InterfaceC3750e zzj;

    zzbxn(Context context, InterfaceC3750e interfaceC3750e, InterfaceC3494q0 interfaceC3494q0, zzbxr zzbxrVar) {
        this.zzj = interfaceC3750e;
        zzhpx zzhpxVarZza = zzhpy.zza(context);
        this.zza = zzhpxVarZza;
        zzhpx zzhpxVarZza2 = zzhpy.zza(interfaceC3494q0);
        this.zzb = zzhpxVarZza2;
        this.zzc = zzhpw.zza(zzbxh.zza(zzhpxVarZza, zzhpxVarZza2));
        zzhpx zzhpxVarZza3 = zzhpy.zza(interfaceC3750e);
        this.zzd = zzhpxVarZza3;
        zzhpx zzhpxVarZza4 = zzhpy.zza(zzbxrVar);
        this.zze = zzhpxVarZza4;
        zzhqg zzhqgVarZza = zzhpw.zza(zzbxj.zza(zzhpxVarZza3, zzhpxVarZza2, zzhpxVarZza4));
        this.zzf = zzhqgVarZza;
        zzbxl zzbxlVarZzc = zzbxl.zzc(zzhpxVarZza3, zzhqgVarZza);
        this.zzg = zzbxlVarZzc;
        this.zzh = zzhpw.zza(zzbxy.zza(zzhpxVarZza, zzbxlVarZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    final zzbxk zza() {
        return new zzbxk(this.zzj, (zzbxi) this.zzf.zzb());
    }
}

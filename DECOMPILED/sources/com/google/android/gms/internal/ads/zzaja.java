package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzaja extends zzajj {
    private zzadh zza;
    private zzaiz zzb;

    zzaja() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z7) {
        super.zza(z7);
        if (z7) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        if (!zzd(zzefVar.zzi())) {
            return -1L;
        }
        int i7 = (zzefVar.zzi()[2] & 255) >> 4;
        if (i7 == 6) {
            zzefVar.zzk(4);
            zzefVar.zzO();
        } else if (i7 == 7) {
            i7 = 7;
            zzefVar.zzk(4);
            zzefVar.zzO();
        }
        int iZzc = zzadc.zzc(zzefVar, i7);
        zzefVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final boolean zzc(zzef zzefVar, long j7, zzajh zzajhVar) {
        byte[] bArrZzi = zzefVar.zzi();
        zzadh zzadhVar = this.zza;
        if (zzadhVar == null) {
            zzadh zzadhVar2 = new zzadh(bArrZzi, 17);
            this.zza = zzadhVar2;
            zzs zzsVarZza = zzadhVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzefVar.zze()), null).zza();
            zzsVarZza.zzl("audio/ogg");
            zzajhVar.zza = zzsVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzadg zzadgVarZzc = zzade.zzc(zzefVar);
            zzadh zzadhVarZze = zzadhVar.zze(zzadgVarZzc);
            this.zza = zzadhVarZze;
            this.zzb = new zzaiz(zzadhVarZze, zzadgVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzaiz zzaizVar = this.zzb;
        if (zzaizVar != null) {
            zzaizVar.zzd(j7);
            zzajhVar.zzb = this.zzb;
        }
        zzajhVar.zza.getClass();
        return false;
    }
}

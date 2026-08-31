package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzajg extends zzajj {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzajg() {
    }

    public static boolean zzd(zzef zzefVar) {
        return zzk(zzefVar, zza);
    }

    private static boolean zzk(zzef zzefVar, byte[] bArr) {
        if (zzefVar.zzd() < 8) {
            return false;
        }
        int iZzg = zzefVar.zzg();
        byte[] bArr2 = new byte[8];
        zzefVar.zzm(bArr2, 0, 8);
        zzefVar.zzh(iZzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z7) {
        super.zza(z7);
        if (z7) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        return zzi(zzadr.zzd(zzefVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final boolean zzc(zzef zzefVar, long j7, zzajh zzajhVar) {
        if (zzk(zzefVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze());
            int i7 = bArrCopyOf[9] & 255;
            List listZza = zzadr.zza(bArrCopyOf);
            if (zzajhVar.zza != null) {
                return true;
            }
            zzs zzsVar = new zzs();
            zzsVar.zzl("audio/ogg");
            zzsVar.zzm("audio/opus");
            zzsVar.zzE(i7);
            zzsVar.zzF(48000);
            zzsVar.zzp(listZza);
            zzajhVar.zza = zzsVar.zzM();
            return true;
        }
        if (!zzk(zzefVar, zzb)) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzajhVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzefVar.zzk(8);
        zzao zzaoVarZzc = zzaeh.zzc(zzgjz.zzr(zzaeh.zzb(zzefVar, false, false).zza));
        if (zzaoVarZzc == null) {
            return true;
        }
        zzs zzsVarZza = zzajhVar.zza.zza();
        zzsVarZza.zzk(zzaoVarZzc.zzc(zzajhVar.zza.zzl));
        zzajhVar.zza = zzsVarZza.zzM();
        return true;
    }
}

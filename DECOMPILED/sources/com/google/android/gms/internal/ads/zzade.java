package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzade {
    public static zzao zza(zzacv zzacvVar, boolean z7) {
        zzao zzaoVarZza = new zzadm().zza(zzacvVar, z7 ? null : zzagg.zza, 0);
        if (zzaoVarZza == null || zzaoVarZza.zza() == 0) {
            return null;
        }
        return zzaoVarZza;
    }

    public static boolean zzb(zzacv zzacvVar, zzadd zzaddVar) {
        zzacvVar.zzl();
        zzee zzeeVar = new zzee(new byte[4], 4);
        zzacvVar.zzi(zzeeVar.zza, 0, 4);
        boolean zZzi = zzeeVar.zzi();
        int iZzj = zzeeVar.zzj(7);
        int iZzj2 = zzeeVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzacvVar.zzc(bArr, 0, 38);
            zzaddVar.zza = new zzadh(bArr, 4);
            return zZzi;
        }
        zzadh zzadhVar = zzaddVar.zza;
        if (zzadhVar == null) {
            throw new IllegalArgumentException();
        }
        if (iZzj == 3) {
            zzef zzefVar = new zzef(iZzj2);
            zzacvVar.zzc(zzefVar.zzi(), 0, iZzj2);
            zzaddVar.zza = zzadhVar.zze(zzc(zzefVar));
            return zZzi;
        }
        if (iZzj == 4) {
            zzef zzefVar2 = new zzef(iZzj2);
            zzacvVar.zzc(zzefVar2.zzi(), 0, iZzj2);
            zzefVar2.zzk(4);
            zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(zzaeh.zzc(Arrays.asList(zzaeh.zzb(zzefVar2, false, false).zza))));
            return zZzi;
        }
        if (iZzj != 6) {
            zzacvVar.zzf(iZzj2);
            return zZzi;
        }
        zzef zzefVar3 = new zzef(iZzj2);
        zzacvVar.zzc(zzefVar3.zzi(), 0, iZzj2);
        zzefVar3.zzk(4);
        zzaddVar.zza = new zzadh(zzadhVar.zza, zzadhVar.zzb, zzadhVar.zzc, zzadhVar.zzd, zzadhVar.zze, zzadhVar.zzg, zzadhVar.zzh, zzadhVar.zzj, zzadhVar.zzk, zzadhVar.zzd(new zzao(zzgjz.zzj(zzafu.zzb(zzefVar3)))));
        return zZzi;
    }

    public static zzadg zzc(zzef zzefVar) {
        zzefVar.zzk(1);
        int iZzx = zzefVar.zzx();
        long jZzg = zzefVar.zzg();
        long j7 = iZzx;
        int i7 = iZzx / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            long jZzD = zzefVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                break;
            }
            jArrCopyOf[i8] = jZzD;
            jArrCopyOf2[i8] = zzefVar.zzD();
            zzefVar.zzk(2);
        }
        zzefVar.zzk((int) ((jZzg + j7) - ((long) zzefVar.zzg())));
        return new zzadg(jArrCopyOf, jArrCopyOf2);
    }
}

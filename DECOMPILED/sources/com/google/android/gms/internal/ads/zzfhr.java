package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3349h2;
import p036E2.AbstractC0335c;

/* JADX INFO: loaded from: classes2.dex */
public interface zzfhr {
    static zzfhr zzn(Context context, int i7) {
        boolean zBooleanValue;
        if (zzfie.zza()) {
            int i8 = i7 - 2;
            if (i8 == 20 || i8 == 21) {
                zBooleanValue = ((Boolean) zzbeb.zze.zze()).booleanValue();
            } else if (i8 != 110) {
                switch (i8) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbeb.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbeb.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbeb.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) zzbeb.zzf.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfht(context, i7);
            }
        }
        return new zzfis();
    }

    static zzfhr zzo(Context context, int i7, int i8, C3349h2 c3349h2) {
        zzfhr zzfhrVarZzn = zzn(context, i7);
        if (zzfhrVarZzn instanceof zzfht) {
            zzfhrVarZzn.zza();
            zzfhrVarZzn.zzp(i8);
            zzfhrVarZzn.zzf(AbstractC0335c.m1522d(c3349h2.f13961x));
            String str = c3349h2.f13936A;
            if (zzfia.zza(str)) {
                zzfhrVarZzn.zze(str);
            }
        }
        return zzfhrVarZzn;
    }

    zzfhr zza();

    boolean zzb();

    zzfhr zzc();

    zzfhr zzd(boolean z7);

    zzfhr zze(String str);

    zzfhr zzf(zzfig zzfigVar);

    zzfhr zzg(zzfct zzfctVar);

    zzfhr zzh(C3324b1 c3324b1);

    zzfhr zzi(String str);

    zzfhr zzj(Throwable th);

    zzfhr zzk(String str);

    boolean zzl();

    zzfhu zzm();

    zzfhr zzp(int i7);
}

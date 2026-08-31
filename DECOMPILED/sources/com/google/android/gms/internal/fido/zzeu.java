package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeu extends zzei {
    private static final Set zza;
    private static final zzea zzb;
    private static final zzer zzc;
    private final String zzd;
    private final zzdn zze;
    private final Level zzf;
    private final Set zzg;
    private final zzea zzh;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzdh.zza, zzdm.zza)));
        zza = setUnmodifiableSet;
        zzb = zzed.zza(setUnmodifiableSet).zzd();
        zzc = new zzer();
    }

    /* synthetic */ zzeu(String str, String str2, boolean z7, zzdn zzdnVar, Level level, Set set, zzea zzeaVar, zzet zzetVar) {
        super(str2);
        if (str2.length() > 23) {
            int i7 = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char cCharAt = str2.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i7 = length;
                    break;
                }
            }
            str2 = str2.substring(i7 + 1);
        }
        String strConcat = "".concat(String.valueOf(str2));
        this.zzd = strConcat.substring(0, Math.min(strConcat.length(), 23));
        this.zze = zzdnVar;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzeaVar;
    }

    public static zzer zzc() {
        return zzc;
    }
}

package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;
import p108N3.EnumC0963e;

/* JADX INFO: loaded from: classes2.dex */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private EnumC0963e zzd = EnumC0963e.UNKNOWN;

    zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    final zzab zza() throws zzg {
        String str;
        zzcl zzclVar = this.zzb;
        int i7 = zzclVar.zzf;
        boolean z7 = i7 == 8;
        zzz zzzVar = this.zza;
        zzzVar.zzc.zzh(z7);
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        switch (i8) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzclVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzclVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i9 = zzclVar.zzg;
        int i10 = i9 - 1;
        if (i9 == 0) {
            throw null;
        }
        if (i10 == 1) {
            this.zzd = EnumC0963e.REQUIRED;
        } else {
            if (i10 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = EnumC0963e.NOT_REQUIRED;
        }
        String str2 = zzclVar.zza;
        zzbq zzbqVar = str2 == null ? null : new zzbq(zzclVar.zzb, str2);
        zzzVar.zzc.zzj(new HashSet(zzclVar.zzd));
        for (zzck zzckVar : zzclVar.zze) {
            int i11 = zzckVar.zzb;
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == 0) {
                str = null;
            } else if (i12 == 1) {
                str = "write";
            } else if (i12 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                zzzVar.zza.zzb(str, zzckVar.zza, zzzVar.zzb);
            }
        }
        return new zzab(this.zzc, this.zzd, zzbqVar, null);
    }
}

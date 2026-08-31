package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = C3553a.e.API_PRIORITY_OTHER;

    protected zzz(zzaa zzaaVar, CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzm
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i7 = this.zze;
        while (true) {
            int i8 = this.zze;
            if (i8 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i8);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i7) {
                int i9 = iZzc + 1;
                this.zze = i9;
                if (i9 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i7 < iZzd) {
                    this.zzb.charAt(i7);
                }
                if (i7 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i7 != iZzd) {
                    int i10 = this.zzf;
                    if (i10 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i7) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i10 - 1;
                    }
                    return this.zzb.subSequence(i7, iZzd).toString();
                }
                i7 = this.zze;
            }
        }
    }

    abstract int zzc(int i7);

    abstract int zzd(int i7);
}

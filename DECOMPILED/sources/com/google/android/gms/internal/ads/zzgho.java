package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzgho extends zzggi {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = C3553a.e.API_PRIORITY_OTHER;

    zzgho(zzghq zzghqVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzggi
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i7 = this.zzc;
        while (true) {
            int i8 = this.zzc;
            if (i8 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i8);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzc = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzc = iZzd;
            }
            if (iZzd != i7) {
                if (i7 < iZzc) {
                    this.zzb.charAt(i7);
                }
                if (i7 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i9 = this.zzd;
                if (i9 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i7) {
                        charSequence.charAt(length - 1);
                    }
                    iZzc = length;
                } else {
                    this.zzd = i9 - 1;
                }
                return this.zzb.subSequence(i7, iZzc).toString();
            }
            int i10 = iZzd + 1;
            this.zzc = i10;
            if (i10 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    abstract int zzc(int i7);

    abstract int zzd(int i7);
}

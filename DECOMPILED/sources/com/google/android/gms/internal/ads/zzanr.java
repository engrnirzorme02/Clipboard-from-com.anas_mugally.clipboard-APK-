package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzanr {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanr(int i7, int i8, int i9) {
        String string;
        if (i7 != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1);
            sb.append(i7);
            sb.append("/");
            string = sb.toString();
        } else {
            string = "";
        }
        this.zza = string;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i7 = this.zzd;
        int i8 = i7 == Integer.MIN_VALUE ? this.zzb : i7 + this.zzc;
        this.zzd = i8;
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + String.valueOf(i8).length());
        sb.append(str);
        sb.append(i8);
        this.zze = sb.toString();
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}

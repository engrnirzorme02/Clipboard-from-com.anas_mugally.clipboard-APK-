package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzkw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlr zzd;
    public int zze;

    zzkw() {
        int i7 = zzlr.zzb;
        int i8 = zznu.zza;
        this.zzd = zzlr.zza;
    }

    static /* synthetic */ String zza(int i7, int i8, byte b7, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + b7 + String.valueOf(i7).length());
        sb.append(str);
        sb.append(i8);
        sb.append(str2);
        sb.append(i7);
        return sb.toString();
    }

    zzkw(zzlr zzlrVar) {
        zzlrVar.getClass();
        this.zzd = zzlrVar;
    }
}

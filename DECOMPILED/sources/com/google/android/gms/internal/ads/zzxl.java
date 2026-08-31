package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzxl extends zzxv implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxl(int i7, zzbf zzbfVar, int i8, zzxo zzxoVar, int i9) {
        super(i7, zzbfVar, i8);
        this.zze = zzln.zzZ(i9, zzxoVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxl zzxlVar) {
        return Integer.compare(this.zzf, zzxlVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        return false;
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzahv implements zzahs {
    private final int zza;
    private final int zzb;
    private final zzef zzc;

    public zzahv(zzeu zzeuVar, zzu zzuVar) {
        zzef zzefVar = zzeuVar.zza;
        this.zzc = zzefVar;
        zzefVar.zzh(12);
        int iZzH = zzefVar.zzH();
        if ("audio/raw".equals(zzuVar.zzo)) {
            int iZzE = zzeo.zzE(zzuVar.zzI) * zzuVar.zzG;
            if (iZzH == 0 || iZzH % iZzE != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzE).length() + 66 + String.valueOf(iZzH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iZzE);
                sb.append(", stsz sample size: ");
                sb.append(iZzH);
                zzds.zzc("BoxParsers", sb.toString());
                iZzH = iZzE;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzefVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final int zzc() {
        int i7 = this.zza;
        return i7 == -1 ? this.zzc.zzH() : i7;
    }
}

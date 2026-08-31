package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzang {
    private final List zza;
    private final zzaeb[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfp zzd = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzanf
        @Override // com.google.android.gms.internal.ads.zzfo
        public final /* synthetic */ void zza(long j7, zzef zzefVar) {
            this.zza.zzf(j7, zzefVar);
        }
    });

    public zzang(List list, String str) {
        this.zza = list;
        this.zzc = new zzaeb[list.size()];
    }

    public final void zza(zzacx zzacxVar, zzanr zzanrVar) {
        int i7 = 0;
        while (true) {
            zzaeb[] zzaebVarArr = this.zzc;
            if (i7 >= zzaebVarArr.length) {
                return;
            }
            zzanrVar.zza();
            zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 3);
            zzu zzuVar = (zzu) this.zza.get(i7);
            String str = zzuVar.zzo;
            boolean z7 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z7 = false;
            }
            zzghc.zzf(z7, "Invalid closed caption MIME type provided: %s", str);
            String strZzc = zzuVar.zza;
            if (strZzc == null) {
                strZzc = zzanrVar.zzc();
            }
            zzs zzsVar = new zzs();
            zzsVar.zza(strZzc);
            zzsVar.zzl(this.zzb);
            zzsVar.zzm(str);
            zzsVar.zzf(zzuVar.zze);
            zzsVar.zze(zzuVar.zzd);
            zzsVar.zzJ(zzuVar.zzL);
            zzsVar.zzp(zzuVar.zzr);
            zzaebVarZzu.zzu(zzsVar.zzM());
            zzaebVarArr[i7] = zzaebVarZzu;
            i7++;
        }
    }

    public final void zzb(int i7) {
        this.zzd.zza(i7);
    }

    public final void zzc(long j7, zzef zzefVar) {
        this.zzd.zzc(j7, zzefVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j7, zzef zzefVar) {
        zzach.zza(j7, zzefVar, this.zzc);
    }
}

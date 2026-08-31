package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.C3250D;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebw implements zzfhi {
    private final zzebk zza;
    private final zzebo zzb;

    zzebw(zzebk zzebkVar, zzebo zzeboVar) {
        this.zza = zzebkVar;
        this.zzb = zzeboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue()) {
            if (zzfhb.RENDERER == zzfhbVar) {
                this.zza.zzg(C7351t.m32357o().mo18161c());
                return;
            }
            if (zzfhb.PRELOADED_LOADER == zzfhbVar || zzfhb.SERVER_TRANSACTION == zzfhbVar) {
                zzebk zzebkVar = this.zza;
                zzebkVar.zza(C7351t.m32357o().mo18161c());
                final zzebo zzeboVar = this.zzb;
                final long jZzb = zzebkVar.zzb();
                zzeboVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebn
                    @Override // com.google.android.gms.internal.ads.zzfgm
                    public final /* synthetic */ Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeboVar.zzf()) {
                            return null;
                        }
                        long j7 = jZzb;
                        zzbbn.zzaf.zza.C7683zza c7683zzaZzz = zzbbn.zzaf.zza.zzz();
                        c7683zzaZzz.zzad(j7);
                        byte[] bArrZzaN = c7683zzaZzz.zzbu().zzaN();
                        zzebv.zzf(sQLiteDatabase, false, false);
                        zzebv.zze(sQLiteDatabase, j7, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue() && zzfhb.RENDERER == zzfhbVar) {
            zzebk zzebkVar = this.zza;
            if (zzebkVar.zzh() != 0) {
                zzebkVar.zzi(C7351t.m32357o().mo18161c() - zzebkVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue() && zzfhb.RENDERER == zzfhbVar) {
            zzebk zzebkVar = this.zza;
            if (zzebkVar.zzh() != 0) {
                zzebkVar.zzi(C7351t.m32357o().mo18161c() - zzebkVar.zzh());
            }
        }
    }
}

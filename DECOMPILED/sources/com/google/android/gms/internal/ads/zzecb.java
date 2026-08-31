package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecb {
    private final zzbbh zza;
    private final Context zzb;
    private final zzebg zzc;
    private final C7584a zzd;

    public zzecb(Context context, C7584a c7584a, zzbbh zzbbhVar, zzebg zzebgVar) {
        this.zzb = context;
        this.zzd = c7584a;
        this.zza = zzbbhVar;
        this.zzc = zzebgVar;
    }

    public final void zza(final boolean z7) {
        try {
            this.zzc.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // com.google.android.gms.internal.ads.zzfgm
                public final /* synthetic */ Object zza(Object obj) {
                    this.zza.zzb(z7, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Error in offline signals database startup: ".concat(strValueOf));
        }
    }

    final /* synthetic */ Void zzb(boolean z7, SQLiteDatabase sQLiteDatabase) {
        if (z7) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbbn.zzaf.zza.zzk(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzhiw e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33328c("Unable to deserialize proto from offline signals database:");
                    AbstractC7599p.m33328c(e7.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbbn.zzaf.zzc zzcVarZzB = zzbbn.zzaf.zzB();
            zzcVarZzB.zzB(context.getPackageName());
            zzcVarZzB.zzH(Build.MODEL);
            zzcVarZzB.zzo(zzebv.zzc(sQLiteDatabase, 0));
            zzcVarZzB.zzj(arrayList);
            zzcVarZzB.zzs(zzebv.zzc(sQLiteDatabase, 1));
            zzcVarZzB.zzQ(zzebv.zzc(sQLiteDatabase, 3));
            zzcVarZzB.zzw(C7351t.m32357o().mo18159a());
            zzcVarZzB.zzM(zzebv.zzd(sQLiteDatabase, 2));
            final zzbbn.zzaf zzafVarZzbu = zzcVarZzB.zzbu();
            int size = arrayList.size();
            long jZzb = 0;
            for (int i8 = 0; i8 < size; i8++) {
                zzbbn.zzaf.zza zzaVar = (zzbbn.zzaf.zza) arrayList.get(i8);
                if (zzaVar.zzf() == zzbbn.zzq.ENUM_TRUE && zzaVar.zzb() > jZzb) {
                    jZzb = zzaVar.zzb();
                }
            }
            if (jZzb != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", Long.valueOf(jZzb));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbbh zzbbhVar = this.zza;
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzeby
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzaVar2.zzaf(zzafVarZzbu);
                }
            });
            C7584a c7584a = this.zzd;
            zzbbn.zzar.zza zzaVarZzs = zzbbn.zzar.zzs();
            zzaVarZzs.zzc(c7584a.f30227b);
            zzaVarZzs.zzg(c7584a.f30228c);
            zzaVarZzs.zzk(true == c7584a.f30229d ? 0 : 2);
            final zzbbn.zzar zzarVarZzbu = zzaVarZzs.zzbu();
            zzbbhVar.zzb(new zzbbg() { // from class: com.google.android.gms.internal.ads.zzebz
                @Override // com.google.android.gms.internal.ads.zzbbg
                public final /* synthetic */ void zza(zzbbn.zzt.zza zzaVar2) {
                    zzbbn.zzm.zza zzaVarZzcc = zzaVar2.zzG().zzcc();
                    zzaVarZzcc.zzs(zzarVarZzbu);
                    zzaVar2.zzI(zzaVarZzcc);
                }
            });
            zzbbhVar.zzc(10004);
            zzebv.zzb(sQLiteDatabase);
        }
        return null;
    }
}

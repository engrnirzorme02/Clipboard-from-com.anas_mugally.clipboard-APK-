package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzebr implements zzgoq {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebs zzb;

    zzebr(zzebs zzebsVar, boolean z7) {
        this.zza = z7;
        Objects.requireNonNull(zzebsVar);
        this.zzb = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33328c("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b7;
        zzbbn.zzd.zza zzaVar;
        zzebs zzebsVar = this.zzb;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (zzebsVar.zzf()) {
            return;
        }
        Bundle bundle = zzcuuVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b7 = 0;
                        break;
                    case "native":
                        b7 = 2;
                        break;
                    case "rewarded":
                        b7 = 3;
                        break;
                    case "interstitial":
                        b7 = 1;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                if (b7 != 0) {
                    zzaVar = zzbbn.zzd.zza.BANNER;
                } else if (b7 != 1) {
                    zzaVar = zzbbn.zzd.zza.INTERSTITIAL;
                } else if (b7 != 2) {
                    zzaVar = zzbbn.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b7 != 3) {
                    zzaVar = zzbbn.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbbn.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbbn.zzaf.zzd zzdVarZze = zzebs.zze(bundle);
            final zzbbn.zzab zzabVarZzb = zzebsVar.zzb(bundle);
            final boolean z7 = this.zza;
            zzebsVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebq
                @Override // com.google.android.gms.internal.ads.zzfgm
                public final /* synthetic */ Object zza(Object obj3) {
                    zzebs zzebsVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzebsVar2.zzf()) {
                        return null;
                    }
                    zzbbn.zzaf.zzd zzdVar = zzdVarZze;
                    zzbbn.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z8 = z7;
                    byte[] bArrZzc = zzebsVar2.zzc(z8, arrayList2, zzabVar, zzdVar);
                    zzebv.zzf(sQLiteDatabase, z8, true);
                    zzebv.zze(sQLiteDatabase, zzebsVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        b7 = 0;
                    } else {
                        b7 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        b7 = 2;
                    } else {
                        b7 = -1;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        b7 = 3;
                    } else {
                        b7 = -1;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                    break;
                default:
                    b7 = -1;
                    break;
            }
            if (b7 != 0) {
                zzaVar = zzbbn.zzd.zza.BANNER;
            } else if (b7 != 1) {
                zzaVar = zzbbn.zzd.zza.INTERSTITIAL;
            } else if (b7 != 2) {
                zzaVar = zzbbn.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b7 != 3) {
                zzaVar = zzbbn.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbbn.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbbn.zzaf.zzd zzdVarZze2 = zzebs.zze(bundle);
        final zzbbn.zzab zzabVarZzb2 = zzebsVar.zzb(bundle);
        final boolean z8 = this.zza;
        zzebsVar.zza.zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj4) {
                zzebs zzebsVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzebsVar2.zzf()) {
                    return null;
                }
                zzbbn.zzaf.zzd zzdVar = zzdVarZze2;
                zzbbn.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z9 = z8;
                byte[] bArrZzc = zzebsVar2.zzc(z9, arrayList3, zzabVar, zzdVar);
                zzebv.zzf(sQLiteDatabase, z9, true);
                zzebv.zze(sQLiteDatabase, zzebsVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}

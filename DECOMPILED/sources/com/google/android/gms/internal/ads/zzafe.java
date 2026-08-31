package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzafe extends zzafg {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafe() {
        super(new zzacr());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzef zzefVar) {
        return Double.valueOf(Double.longBitsToDouble(zzefVar.zzD()));
    }

    private static String zzh(zzef zzefVar) {
        int iZzt = zzefVar.zzt();
        int iZzg = zzefVar.zzg();
        zzefVar.zzk(iZzt);
        return new String(zzefVar.zzi(), iZzg, iZzt);
    }

    private static HashMap zzi(zzef zzefVar) {
        int iZzH = zzefVar.zzH();
        HashMap map = new HashMap(iZzH);
        for (int i7 = 0; i7 < iZzH; i7++) {
            String strZzh = zzh(zzefVar);
            Object objZzj = zzj(zzefVar, zzefVar.zzs());
            if (objZzj != null) {
                map.put(strZzh, objZzj);
            }
        }
        return map;
    }

    private static Object zzj(zzef zzefVar, int i7) {
        if (i7 == 0) {
            return zzg(zzefVar);
        }
        if (i7 == 1) {
            return Boolean.valueOf(zzefVar.zzs() == 1);
        }
        if (i7 == 2) {
            return zzh(zzefVar);
        }
        if (i7 != 3) {
            if (i7 == 8) {
                return zzi(zzefVar);
            }
            if (i7 != 10) {
                if (i7 != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzefVar).doubleValue());
                zzefVar.zzk(2);
                return date;
            }
            int iZzH = zzefVar.zzH();
            ArrayList arrayList = new ArrayList(iZzH);
            for (int i8 = 0; i8 < iZzH; i8++) {
                Object objZzj = zzj(zzefVar, zzefVar.zzs());
                if (objZzj != null) {
                    arrayList.add(objZzj);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzh = zzh(zzefVar);
            int iZzs = zzefVar.zzs();
            if (iZzs == 9) {
                return map;
            }
            Object objZzj2 = zzj(zzefVar, iZzs);
            if (objZzj2 != null) {
                map.put(strZzh, objZzj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zza(zzef zzefVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    protected final boolean zzb(zzef zzefVar, long j7) {
        if (zzefVar.zzs() == 2 && "onMetaData".equals(zzh(zzefVar)) && zzefVar.zzd() != 0 && zzefVar.zzs() == 8) {
            HashMap mapZzi = zzi(zzefVar);
            Object obj = mapZzi.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzi.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i7 = 0; i7 < size; i7++) {
                        Object obj5 = list.get(i7);
                        Object obj6 = list2.get(i7);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i7] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzc;
    }

    public final long[] zze() {
        return this.zzd;
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzegv {
    private final zzgpm zzc;
    private zzehl zzf;
    private final String zzh;
    private final int zzi;
    private final zzehk zzj;
    private zzfcj zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = C3553a.e.API_PRIORITY_OTHER;
    private boolean zzl = false;

    zzegv(zzfcu zzfcuVar, zzehk zzehkVar, zzgpm zzgpmVar) {
        this.zzi = zzfcuVar.zzb.zzb.zzr;
        this.zzj = zzehkVar;
        this.zzc = zzgpmVar;
        this.zzh = zzehr.zzb(zzfcuVar);
        List list = zzfcuVar.zzb.zza;
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.zza.put((zzfcj) list.get(i7), Integer.valueOf(i7));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfcj) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi && zzf(false)) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z7) {
        try {
            for (zzfcj zzfcjVar : this.zzb) {
                Integer num = (Integer) this.zza.get(zzfcjVar);
                int iIntValue = num != null ? num.intValue() : C3553a.e.API_PRIORITY_OTHER;
                if (z7 || !this.zze.contains(zzfcjVar.zzat)) {
                    int i7 = this.zzg;
                    if (iIntValue < i7) {
                        return true;
                    }
                    if (iIntValue > i7) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzg() {
        try {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.zza.get((zzfcj) it.next());
                if ((num != null ? num.intValue() : C3553a.e.API_PRIORITY_OTHER) < this.zzg) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzh() {
        return zzf(true) || zzg();
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzehl zzehlVar = this.zzf;
        if (zzehlVar != null) {
            this.zzc.zza(zzehlVar);
        } else {
            this.zzc.zzb(new zzeho(3, this.zzh));
        }
    }

    final synchronized zzfcj zza() {
        try {
            if (zze()) {
                int i7 = 0;
                while (true) {
                    List list = this.zzb;
                    if (i7 >= list.size()) {
                        break;
                    }
                    zzfcj zzfcjVar = (zzfcj) list.get(i7);
                    String str = zzfcjVar.zzat;
                    Set set = this.zze;
                    if (!set.contains(str)) {
                        if (zzfcjVar.zzav) {
                            this.zzl = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            set.add(str);
                        }
                        this.zzd.add(zzfcjVar);
                        return (zzfcj) list.remove(i7);
                    }
                    i7++;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void zzb(zzehl zzehlVar, zzfcj zzfcjVar) {
        this.zzl = false;
        this.zzd.remove(zzfcjVar);
        if (zzd()) {
            zzehlVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfcjVar);
        int iIntValue = num != null ? num.intValue() : C3553a.e.API_PRIORITY_OTHER;
        if (iIntValue > this.zzg) {
            this.zzj.zzf(zzfcjVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = iIntValue;
        this.zzf = zzehlVar;
        this.zzk = zzfcjVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfcj zzfcjVar) {
        this.zzl = false;
        this.zzd.remove(zzfcjVar);
        this.zze.remove(zzfcjVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}

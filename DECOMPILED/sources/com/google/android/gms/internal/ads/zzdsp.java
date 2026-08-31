package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsp implements zzfhi {
    private final zzdsg zzb;
    private final InterfaceC3750e zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsp(zzdsg zzdsgVar, Set set, InterfaceC3750e interfaceC3750e) {
        this.zzb = zzdsgVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdso zzdsoVar = (zzdso) it.next();
            this.zzd.put(zzdsoVar.zzc(), zzdsoVar);
        }
        this.zzc = interfaceC3750e;
    }

    private final void zze(zzfhb zzfhbVar, boolean z7) {
        zzdso zzdsoVar = (zzdso) this.zzd.get(zzfhbVar);
        if (zzdsoVar == null) {
            return;
        }
        String str = true != z7 ? "f." : "s.";
        Map map = this.zza;
        zzfhb zzfhbVarZzb = zzdsoVar.zzb();
        if (map.containsKey(zzfhbVarZzb)) {
            long jMo18161c = this.zzc.mo18161c() - ((Long) map.get(zzfhbVarZzb)).longValue();
            zzdsg zzdsgVar = this.zzb;
            String strZza = zzdsoVar.zza();
            int length = str.length();
            Map mapZzc = zzdsgVar.zzc();
            StringBuilder sb = new StringBuilder(length + String.valueOf(jMo18161c).length());
            sb.append(str);
            sb.append(jMo18161c);
            mapZzc.put("label.".concat(strZza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdP(zzfhb zzfhbVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdQ(zzfhb zzfhbVar, String str) {
        this.zza.put(zzfhbVar, Long.valueOf(this.zzc.mo18161c()));
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdR(zzfhb zzfhbVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            long jMo18161c = this.zzc.mo18161c() - ((Long) map.get(zzfhbVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jMo18161c))));
        }
        if (this.zzd.containsKey(zzfhbVar)) {
            zze(zzfhbVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhi
    public final void zzdS(zzfhb zzfhbVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfhbVar)) {
            long jMo18161c = this.zzc.mo18161c() - ((Long) map.get(zzfhbVar)).longValue();
            this.zzb.zzc().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jMo18161c))));
        }
        if (this.zzd.containsKey(zzfhbVar)) {
            zze(zzfhbVar, true);
        }
    }
}

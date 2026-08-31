package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvx {
    private final Set zza;
    private final Set zzb;
    private final zzgea zzc;
    private InterfaceFutureC1673e zzd = null;

    zzfvx(Set set, Set set2, zzgea zzgeaVar) {
        this.zza = set;
        this.zzb = set2;
        this.zzc = zzgeaVar;
    }

    public final synchronized InterfaceFutureC1673e zza() {
        try {
            InterfaceFutureC1673e interfaceFutureC1673e = this.zzd;
            if (interfaceFutureC1673e != null) {
                return interfaceFutureC1673e;
            }
            Set set = this.zzb;
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzfvv) it.next()).zza());
            }
            zzgea zzgeaVar = this.zzc;
            InterfaceFutureC1673e interfaceFutureC1673eZzk = zzgot.zzk(zzgot.zzl(arrayList), zzfvw.zza, zzgpk.zza());
            zzgeaVar.zze(2, interfaceFutureC1673eZzk);
            this.zzd = interfaceFutureC1673eZzk;
            Iterator it2 = this.zza.iterator();
            while (it2.hasNext()) {
                ((zzfvv) it2.next()).zza();
            }
            InterfaceFutureC1673e interfaceFutureC1673e2 = this.zzd;
            if (interfaceFutureC1673e2 != null) {
                return interfaceFutureC1673e2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceFutureC1673e zzb() {
        InterfaceFutureC1673e interfaceFutureC1673e;
        interfaceFutureC1673e = this.zzd;
        if (interfaceFutureC1673e == null) {
            throw null;
        }
        return interfaceFutureC1673e;
    }
}

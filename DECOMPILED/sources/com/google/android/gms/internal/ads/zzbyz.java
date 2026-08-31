package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyz implements zzazc {
    final zzbyw zza;
    private final InterfaceC3494q0 zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzbyx zzf = new zzbyx();

    public zzbyz(String str, InterfaceC3494q0 interfaceC3494q0) {
        this.zza = new zzbyw(str, interfaceC3494q0);
        this.zze = interfaceC3494q0;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zza(boolean z7) {
        long jMo18159a = C7351t.m32357o().mo18159a();
        if (!z7) {
            InterfaceC3494q0 interfaceC3494q0 = this.zze;
            interfaceC3494q0.zzl(jMo18159a);
            interfaceC3494q0.mo17550c(this.zza.zzd);
            return;
        }
        InterfaceC3494q0 interfaceC3494q1 = this.zze;
        if (jMo18159a - interfaceC3494q1.zzm() > ((Long) C3250D.m17200c().zzd(zzbci.zzbi)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = interfaceC3494q1.zzo();
        }
        this.zzg = true;
    }

    public final void zzb(zzbyp zzbypVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzbypVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(C3349h2 c3349h2, long j7) {
        synchronized (this.zzd) {
            this.zza.zze(c3349h2, j7);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int iZzd;
        synchronized (this.zzd) {
            iZzd = this.zza.zzd();
        }
        return iZzd;
    }

    public final zzbyp zzk(InterfaceC3750e interfaceC3750e, String str) {
        return new zzbyp(interfaceC3750e, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final String zzm() {
        return this.zzf.zzb();
    }

    public final Bundle zzn(Context context, zzfek zzfekVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzbyp) it2.next()).zzi());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfekVar.zzb(hashSet);
        return bundle;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3339f0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfko {
    private final zzflc zzc;
    private final zzfkk zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final InterfaceC3750e zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfko(zzflc zzflcVar, zzfkk zzfkkVar, Context context, InterfaceC3750e interfaceC3750e) {
        this.zzc = zzflcVar;
        this.zzd = zzfkkVar;
        this.zze = context;
        this.zzh = interfaceC3750e;
    }

    static String zzh(String str, EnumC6551c enumC6551c) {
        String strName = enumC6551c == null ? "NULL" : enumC6551c.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length());
        sb.append(str);
        sb.append("#");
        sb.append(strName);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzw)).booleanValue()) {
            zzj(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z7) {
        try {
            if (z7) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzflb) it.next()).zzh();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzflb) it2.next()).zzg();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00e6, B:35:0x00fb, B:37:0x0101, B:34:0x00f8), top: B:43:0x0001 }] */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3296S1 c3296s1 = (C3296S1) it.next();
                String strZzh = zzh(c3296s1.f13901a, EnumC6551c.m27812c(c3296s1.f13902b));
                hashSet.add(strZzh);
                ConcurrentMap concurrentMap = this.zza;
                zzflb zzflbVar = (zzflb) concurrentMap.get(strZzh);
                if (zzflbVar == null) {
                    ConcurrentMap concurrentMap2 = this.zzb;
                    if (concurrentMap2.containsKey(strZzh)) {
                        zzflb zzflbVar2 = (zzflb) concurrentMap2.get(strZzh);
                        if (zzflbVar2.zze.equals(c3296s1)) {
                            zzflbVar2.zzr(c3296s1.f13904d);
                            zzflbVar2.zzh();
                            concurrentMap.put(strZzh, zzflbVar2);
                            concurrentMap2.remove(strZzh);
                        } else {
                            arrayList.add(c3296s1);
                        }
                    } else {
                        arrayList.add(c3296s1);
                    }
                } else if (zzflbVar.zze.equals(c3296s1)) {
                    zzflbVar.zzr(c3296s1.f13904d);
                } else {
                    this.zzb.put(strZzh, zzflbVar);
                    concurrentMap.remove(strZzh);
                    arrayList.add(c3296s1);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzflb) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzflb zzflbVar3 = (zzflb) ((Map.Entry) it3.next()).getValue();
                zzflbVar3.zzf();
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzy)).booleanValue()) {
                    zzflbVar3.zzo();
                } else {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzz)).booleanValue()) {
                        zzflbVar3.zzo();
                    }
                }
                if (!zzflbVar3.zzd()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzflb zzflbVar) {
        zzflbVar.zzc();
        this.zza.put(str, zzflbVar);
    }

    private final synchronized boolean zzo(String str, EnumC6551c enumC6551c) {
        boolean z7;
        try {
            InterfaceC3750e interfaceC3750e = this.zzh;
            long jMo18159a = interfaceC3750e.mo18159a();
            zzflb zzflbVarZzq = zzq(str, enumC6551c);
            int iZzn = 0;
            z7 = zzflbVarZzq != null && zzflbVarZzq.zzd();
            Long lValueOf = z7 ? Long.valueOf(interfaceC3750e.mo18159a()) : null;
            zzfkr zzfkrVar = new zzfkr(new zzfkq(str, enumC6551c), null);
            zzfkk zzfkkVar = this.zzd;
            int i7 = zzflbVarZzq == null ? 0 : zzflbVarZzq.zze.f13904d;
            if (zzflbVarZzq != null) {
                iZzn = zzflbVarZzq.zzn();
            }
            zzfkkVar.zzd(i7, iZzn, jMo18159a, lValueOf, zzflbVarZzq != null ? zzflbVarZzq.zzi() : null, zzfkrVar, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z7;
    }

    private final synchronized Object zzp(Class cls, String str, EnumC6551c enumC6551c) {
        zzfkr zzfkrVar = new zzfkr(new zzfkq(str, enumC6551c), null);
        zzfkk zzfkkVar = this.zzd;
        InterfaceC3750e interfaceC3750e = this.zzh;
        zzfkkVar.zzf(interfaceC3750e.mo18159a(), zzfkrVar, -1, -1, "1");
        zzflb zzflbVarZzq = zzq(str, enumC6551c);
        if (zzflbVarZzq == null) {
            return null;
        }
        try {
            String strZzi = zzflbVarZzq.zzi();
            Object objZze = zzflbVarZzq.zze();
            Object objCast = objZze == null ? null : cls.cast(objZze);
            if (objCast != null) {
                zzfkkVar.zzh(interfaceC3750e.mo18159a(), zzflbVarZzq.zze.f13904d, zzflbVarZzq.zzn(), strZzi, zzfkrVar, "1");
            }
            return objCast;
        } catch (ClassCastException e7) {
            C7351t.m32354l().zzg(e7, "PreloadAdManager.pollAd");
            AbstractC3490o0.m17546l("Unable to cast ad to the requested type:".concat(cls.getName()), e7);
            return null;
        }
    }

    private final synchronized zzflb zzq(String str, EnumC6551c enumC6551c) {
        return (zzflb) this.zza.get(zzh(str, enumC6551c));
    }

    public final synchronized void zza(List list, InterfaceC3339f0 interfaceC3339f0) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e7) {
                                int i7 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33332g("Failed to get connectivity manager", e7);
                            }
                        }
                    }
                }
                if (!AbstractC3760o.m18199g() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) C3250D.m17200c().zzd(zzbci.zzE)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfkn(this));
                    } catch (RuntimeException e8) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33332g("Failed to register network callback", e8);
                        this.zzi = new AtomicInteger(((Integer) C3250D.m17200c().zzd(zzbci.zzE)).intValue());
                    }
                }
                C7351t.m32353k().zzb(new zzfkm(this));
            }
            List<C3296S1> listZzm = zzm(list);
            EnumMap enumMap = new EnumMap(EnumC6551c.class);
            for (C3296S1 c3296s1 : listZzm) {
                String str = c3296s1.f13901a;
                EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(c3296s1.f13902b);
                zzflb zzflbVarZza = this.zzc.zza(c3296s1, interfaceC3339f0);
                if (enumC6551cM27812c != null && zzflbVarZza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zzflbVarZza.zzk(atomicInteger.get());
                    }
                    zzfkk zzfkkVar = this.zzd;
                    zzflbVarZza.zzj(zzfkkVar);
                    zzn(zzh(str, enumC6551cM27812c), zzflbVarZza);
                    enumMap.put(enumC6551cM27812c, Integer.valueOf(((Integer) C7590g.m33283m(enumMap, enumC6551cM27812c, 0)).intValue() + 1));
                    zzfkkVar.zza(c3296s1.f13904d, this.zzh.mo18159a(), new zzfkr(new zzfkq(str, enumC6551cM27812c), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.mo18159a(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, EnumC6551c.REWARDED);
    }

    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzp(zzbwa.class, str, EnumC6551c.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, EnumC6551c.APP_OPEN_AD);
    }

    public final synchronized zzbab zze(String str) {
        return (zzbab) zzp(zzbab.class, str, EnumC6551c.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, EnumC6551c.INTERSTITIAL);
    }

    public final synchronized InterfaceC3312Y zzg(String str) {
        return (InterfaceC3312Y) zzp(InterfaceC3312Y.class, str, EnumC6551c.INTERSTITIAL);
    }
}

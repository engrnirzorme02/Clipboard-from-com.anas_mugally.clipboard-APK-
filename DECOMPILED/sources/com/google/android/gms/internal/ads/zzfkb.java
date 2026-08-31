package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3347h0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkb {
    private final Map zza;
    private final zzflc zzb;
    private final zzfkk zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final InterfaceC3750e zzg;
    private AtomicInteger zzh;

    zzfkb(zzflc zzflcVar, zzfkk zzfkkVar, Context context, InterfaceC3750e interfaceC3750e) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(EnumC6551c.APP_OPEN_AD, new HashMap());
        map.put(EnumC6551c.INTERSTITIAL, new HashMap());
        map.put(EnumC6551c.REWARDED, new HashMap());
        this.zzb = zzflcVar;
        this.zzc = zzfkkVar;
        this.zzd = context;
        this.zzg = interfaceC3750e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzw)).booleanValue()) {
            zzl(z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z7) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzflb zzflbVar : ((Map) it.next()).values()) {
                    if (z7) {
                        zzflbVar.zzh();
                    } else {
                        zzflbVar.zzg();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object zzo(Class cls, EnumC6551c enumC6551c, String str) {
        zzfkk zzfkkVar = this.zzc;
        InterfaceC3750e interfaceC3750e = this.zzg;
        zzfkkVar.zze(interfaceC3750e.mo18159a(), "2");
        Map map = this.zza;
        if (!map.containsKey(enumC6551c)) {
            return null;
        }
        zzflb zzflbVar = (zzflb) ((Map) map.get(enumC6551c)).get(str);
        if (zzflbVar != null && enumC6551c.equals(zzflbVar.zzm())) {
            zzfkq zzfkqVar = new zzfkq(zzflbVar.zze.f13901a, zzflbVar.zzm());
            zzfkqVar.zza(str);
            zzfkr zzfkrVar = new zzfkr(zzfkqVar, null);
            zzfkkVar.zzf(interfaceC3750e.mo18159a(), zzfkrVar, zzflbVar.zze.f13904d, zzflbVar.zzn(), "2");
            try {
                String strZzi = zzflbVar.zzi();
                Object objZze = zzflbVar.zze();
                Object objCast = objZze == null ? null : cls.cast(objZze);
                if (objCast != null) {
                    zzfkkVar.zzh(interfaceC3750e.mo18159a(), zzflbVar.zze.f13904d, zzflbVar.zzn(), strZzi, zzfkrVar, "2");
                }
                return objCast;
            } catch (ClassCastException e7) {
                C7351t.m32354l().zzg(e7, "PreloadAdManager.pollAd");
                AbstractC3490o0.m17546l("Unable to cast ad to the requested type:".concat(cls.getName()), e7);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(EnumC6551c enumC6551c) {
        int size;
        int iMax;
        try {
            Map map = this.zza;
            size = map.containsKey(enumC6551c) ? ((Map) map.get(enumC6551c)).size() : 0;
            int iOrdinal = enumC6551c.ordinal();
            if (iOrdinal == 1) {
                iMax = Math.max(((Integer) C3250D.m17200c().zzd(zzbci.zzeW)).intValue(), 1);
            } else if (iOrdinal == 2) {
                iMax = Math.max(((Integer) C3250D.m17200c().zzd(zzbci.zzeX)).intValue(), 1);
            } else if (iOrdinal != 5) {
                iMax = 0;
            } else {
                iMax = Math.max(((Integer) C3250D.m17200c().zzd(zzbci.zzeY)).intValue(), 1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return size < iMax;
    }

    public final synchronized boolean zza(String str, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0) {
        zzflb zzflbVarZzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e7) {
                                int i7 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33332g("Failed to get connectivity manager", e7);
                            }
                        }
                    }
                }
                if (!AbstractC3760o.m18199g() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) C3250D.m17200c().zzd(zzbci.zzE)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfjz(this));
                    } catch (RuntimeException e8) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33332g("Failed to register network callback", e8);
                        this.zzh = new AtomicInteger(((Integer) C3250D.m17200c().zzd(zzbci.zzE)).intValue());
                    }
                }
                C7351t.m32353k().zzb(new zzfka(this));
            }
            EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(c3296s1.f13902b);
            if (enumC6551cM27812c != null) {
                Map map = this.zza;
                if (map.containsKey(enumC6551cM27812c) && !((Map) map.get(enumC6551cM27812c)).containsKey(str) && zzp(enumC6551cM27812c) && (zzflbVarZzb = this.zzb.zzb(str, c3296s1, interfaceC3347h0)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzflbVarZzb.zzk(atomicInteger.get());
                    }
                    zzfkk zzfkkVar = this.zzc;
                    zzflbVarZzb.zzj(zzfkkVar);
                    zzflbVarZzb.zzc();
                    ((Map) map.get(enumC6551cM27812c)).put(str, zzflbVarZzb);
                    zzfkq zzfkqVar = new zzfkq(c3296s1.f13901a, enumC6551cM27812c);
                    zzfkqVar.zza(str);
                    zzfkkVar.zza(c3296s1.f13904d, this.zzg.mo18159a(), new zzfkr(zzfkqVar, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(EnumC6551c enumC6551c, String str) {
        zzfkr zzfkrVar;
        try {
            InterfaceC3750e interfaceC3750e = this.zzg;
            long jMo18159a = interfaceC3750e.mo18159a();
            Map map = this.zza;
            int iZzn = 0;
            if (!map.containsKey(enumC6551c)) {
                return false;
            }
            zzflb zzflbVar = (zzflb) ((Map) map.get(enumC6551c)).get(str);
            String strZzi = zzflbVar == null ? null : zzflbVar.zzi();
            boolean z7 = strZzi != null && enumC6551c.equals(zzflbVar.zzm());
            Long lValueOf = z7 ? Long.valueOf(interfaceC3750e.mo18159a()) : null;
            if (zzflbVar == null) {
                zzfkrVar = null;
            } else {
                zzfkq zzfkqVar = new zzfkq(zzflbVar.zze.f13901a, enumC6551c);
                zzfkqVar.zza(str);
                zzfkrVar = new zzfkr(zzfkqVar, null);
            }
            zzfkk zzfkkVar = this.zzc;
            int i7 = zzflbVar == null ? 0 : zzflbVar.zze.f13904d;
            if (zzflbVar != null) {
                iZzn = zzflbVar.zzn();
            }
            zzfkkVar.zzd(i7, iZzn, jMo18159a, lValueOf, strZzi, zzfkrVar, "2");
            return z7;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzbwa zzc(String str) {
        return (zzbwa) zzo(zzbwa.class, EnumC6551c.REWARDED, str);
    }

    public final synchronized zzbab zzd(String str) {
        return (zzbab) zzo(zzbab.class, EnumC6551c.APP_OPEN_AD, str);
    }

    public final synchronized InterfaceC3312Y zze(String str) {
        return (InterfaceC3312Y) zzo(InterfaceC3312Y.class, EnumC6551c.INTERSTITIAL, str);
    }

    public final synchronized C3296S1 zzf(EnumC6551c enumC6551c, String str) {
        Map map = this.zza;
        if (map.containsKey(enumC6551c)) {
            zzflb zzflbVar = (zzflb) ((Map) map.get(enumC6551c)).get(str);
            this.zzc.zzo(this.zzg.mo18159a(), str, zzflbVar == null ? null : zzflbVar.zze.f13901a, enumC6551c, zzflbVar == null ? -1 : zzflbVar.zze.f13904d, zzflbVar != null ? zzflbVar.zzn() : -1);
            if (zzflbVar != null) {
                return zzflbVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(EnumC6551c enumC6551c, String str) {
        Map map = this.zza;
        if (!map.containsKey(enumC6551c)) {
            return 0;
        }
        zzflb zzflbVar = (zzflb) ((Map) map.get(enumC6551c)).get(str);
        int iZzn = zzflbVar != null ? zzflbVar.zzn() : 0;
        this.zzc.zzp(iZzn, this.zzg.mo18159a(), str, zzflbVar == null ? null : zzflbVar.zze.f13901a, enumC6551c, zzflbVar == null ? -1 : zzflbVar.zze.f13904d);
        return iZzn;
    }

    public final synchronized Map zzh(int i7) {
        try {
            HashMap map = new HashMap();
            EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
            if (enumC6551cM27812c != null) {
                Map map2 = this.zza;
                if (map2.containsKey(enumC6551cM27812c)) {
                    for (zzflb zzflbVar : ((Map) map2.get(enumC6551cM27812c)).values()) {
                        map.put(zzflbVar.zzl(), zzflbVar.zze);
                    }
                    this.zzc.zzn(enumC6551cM27812c, this.zzg.mo18159a(), map.size());
                    return map;
                }
            }
            return map;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzi(EnumC6551c enumC6551c, String str) {
        zzflb zzflbVar;
        Map map = this.zza;
        if (map.containsKey(enumC6551c) && (zzflbVar = (zzflb) ((Map) map.get(enumC6551c)).get(str)) != null) {
            ((Map) map.get(enumC6551c)).remove(str);
            zzflbVar.zzf();
            zzflbVar.zzo();
            zzfkk zzfkkVar = this.zzc;
            long jMo18159a = this.zzg.mo18159a();
            C3296S1 c3296s1 = zzflbVar.zze;
            zzfkkVar.zzm(jMo18159a, str, c3296s1.f13901a, enumC6551c, c3296s1.f13904d, zzflbVar.zzn());
            return true;
        }
        return false;
    }

    public final synchronized void zzj(int i7) {
        try {
            EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
            if (enumC6551cM27812c != null) {
                Map map = this.zza;
                if (map.containsKey(enumC6551cM27812c)) {
                    Map map2 = (Map) map.get(enumC6551cM27812c);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzflb zzflbVar = (zzflb) map2.get(str);
                        if (zzflbVar != null) {
                            zzflbVar.zzf();
                            zzflbVar.zzo();
                            String strValueOf = String.valueOf(str);
                            int i8 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33330e("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(enumC6551cM27812c.toString());
                    int i9 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33330e(strConcat);
                    this.zzc.zzl(this.zzg.mo18159a(), enumC6551cM27812c, size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

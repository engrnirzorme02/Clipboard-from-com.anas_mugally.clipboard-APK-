package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3467d;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p044F2.C0418c;
import p404z2.AbstractC7599p;
import p404z2.C7605v;
import p404z2.EnumC7604u;

/* JADX INFO: loaded from: classes2.dex */
public class zzdsv {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final C7605v zzd;
    protected final boolean zze;
    private final C0418c zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    protected zzdsv(Executor executor, C7605v c7605v, C0418c c0418c, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = c7605v;
        this.zze = ((Boolean) C3250D.m17200c().zzd(zzbci.zzck)).booleanValue();
        this.zzf = c0418c;
        this.zzg = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcp)).booleanValue();
        this.zzh = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhr)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z7) {
        if (map.isEmpty()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strM1808a = this.zzf.m1808a(map);
        AbstractC3490o0.m17545k(strM1808a);
        boolean z8 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z7 || this.zzg) {
                if (!z8 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdss
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzd.zza(strM1808a);
                        }
                    });
                }
            }
        }
    }

    private final void zzi(Map map) {
        if (map == null || map.isEmpty()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) C3250D.m17200c().zzd(zzbci.zzlp);
            this.zzj.set(AbstractC3467d.m17524c(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdst
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.zza.zzh(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(Map map) {
        zza(map, false);
    }

    protected final String zzc(Map map) {
        return this.zzf.m1808a(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final EnumC7604u zzf(Map map) {
        if (map.isEmpty()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Empty paramMap.");
            return EnumC7604u.SUCCESS;
        }
        String strM1808a = this.zzf.m1808a(map);
        AbstractC3490o0.m17545k(strM1808a);
        return this.zzd.zza(strM1808a);
    }

    public final void zzg(Map map) {
        if (map.isEmpty()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33326a("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strM1808a = this.zzf.m1808a(map);
        AbstractC3490o0.m17545k(strM1808a);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznX)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd.zza(strM1808a);
                }
            });
        }
    }

    final /* synthetic */ void zzh(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(AbstractC3467d.m17523b(this.zzb, str));
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdux {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdqc zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsx zzl;
    private final C7584a zzm;
    private final zzdcy zzo;
    private final zzfie zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzm zze = new zzbzm();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = C7351t.m32357o().mo18161c();

    public zzdux(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdqc zzdqcVar, ScheduledExecutorService scheduledExecutorService, zzdsx zzdsxVar, C7584a c7584a, zzdcy zzdcyVar, zzfie zzfieVar) {
        this.zzh = zzdqcVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdsxVar;
        this.zzm = c7584a;
        this.zzo = zzdcyVar;
        this.zzp = zzfieVar;
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized InterfaceFutureC1673e zzu() {
        String strZzd = C7351t.m32354l().zzo().zzi().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzgot.zza(strZzd);
        }
        final zzbzm zzbzmVar = new zzbzm();
        C7351t.m32354l().zzo().mo17557j(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzbzmVar);
            }
        });
        return zzbzmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z7, String str2, int i7) {
        this.zzn.put(str, new zzblk(str, z7, i7, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzblr zzblrVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzblrVar.zzb(this.zza.zzd());
                } catch (RemoteException e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33329d("", e7);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbeo.zza.zze()).booleanValue()) {
            if (this.zzm.f30228c >= ((Integer) C3250D.m17200c().zzd(zzbci.zzca)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzbzm zzbzmVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdup
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzbzmVar.addListener(runnable, executor);
                        this.zza = true;
                        InterfaceFutureC1673e interfaceFutureC1673eZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdur
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzh();
                            }
                        }, ((Long) C3250D.m17200c().zzd(zzbci.zzcc)).longValue(), TimeUnit.SECONDS);
                        zzgot.zzq(interfaceFutureC1673eZzu, new zzdun(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzblk zzblkVar = (zzblk) map.get(str);
            arrayList.add(new zzblk(str, zzblkVar.zzb, zzblkVar.zzc, zzblkVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    final /* synthetic */ void zzg(final zzbzm zzbzmVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzduv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                String strZzd = C7351t.m32354l().zzo().zzi().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzbzm zzbzmVar2 = zzbzmVar;
                if (zIsEmpty) {
                    zzbzmVar2.zzd(new Exception());
                } else {
                    zzbzmVar2.zzc(strZzd);
                }
            }
        });
    }

    final /* synthetic */ void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (C7351t.m32357o().mo18161c() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ void zzi(Object obj, zzbzm zzbzmVar, String str, long j7, zzfhr zzfhrVar) {
        synchronized (obj) {
            try {
                if (!zzbzmVar.isDone()) {
                    zzm(str, false, "Timeout.", (int) (C7351t.m32357o().mo18161c() - j7));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfie zzfieVar = this.zzp;
                    zzfhrVar.zzk("Timeout");
                    zzfhrVar.zzd(false);
                    zzfieVar.zzb(zzfhrVar.zzm());
                    zzbzmVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object zzj(zzfhr zzfhrVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfhrVar.zzd(true);
        this.zzp.zzb(zzfhrVar.zzm());
        return null;
    }

    final /* synthetic */ void zzk(String str, zzblo zzbloVar, zzfea zzfeaVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbloVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfeaVar.zzA(context, zzbloVar, list);
            } catch (RemoteException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("", e7);
            }
        } catch (RemoteException e8) {
            throw new zzghz(e8);
        } catch (zzfdj unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzbloVar.zzf(sb.toString());
        }
    }

    final /* synthetic */ void zzl(String str) {
        final zzdux zzduxVar = this;
        Context context = zzduxVar.zzf;
        int i7 = 5;
        final zzfhr zzfhrVarZzn = zzfhr.zzn(context, 5);
        zzfhrVarZzn.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfhr zzfhrVarZzn2 = zzfhr.zzn(context, i7);
                zzfhrVarZzn2.zza();
                zzfhrVarZzn2.zzi(next);
                final Object obj = new Object();
                final zzbzm zzbzmVar = new zzbzm();
                InterfaceFutureC1673e interfaceFutureC1673eZzi = zzgot.zzi(zzbzmVar, ((Long) C3250D.m17200c().zzd(zzbci.zzcb)).longValue(), TimeUnit.SECONDS, zzduxVar.zzk);
                zzduxVar.zzl.zza(next);
                zzduxVar.zzo.zza(next);
                final long jMo18161c = C7351t.m32357o().mo18161c();
                interfaceFutureC1673eZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdus
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzbzmVar, next, jMo18161c, zzfhrVarZzn2);
                    }
                }, zzduxVar.zzi);
                arrayList.add(interfaceFutureC1673eZzi);
                try {
                    try {
                        final zzduo zzduoVar = new zzduo(this, obj, next, jMo18161c, zzfhrVarZzn2, zzbzmVar);
                        zzduxVar = this;
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                        final ArrayList arrayList2 = new ArrayList();
                        if (jSONObjectOptJSONObject != null) {
                            try {
                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                int i8 = 0;
                                while (i8 < jSONArray.length()) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                                    String strOptString = jSONObject2.optString("format", "");
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                        while (itKeys2.hasNext()) {
                                            String next2 = itKeys2.next();
                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList2.add(new zzblu(strOptString, bundle));
                                    i8++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        zzduxVar.zzm(next, false, "", 0);
                        try {
                            final zzfea zzfeaVarZza = zzduxVar.zzh.zza(next, new JSONObject());
                            zzduxVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduu
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzk(next, zzduoVar, zzfeaVarZza, arrayList2);
                                }
                            });
                        } catch (zzfdj e7) {
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) C3250D.m17200c().zzd(zzbci.zznP)).booleanValue()) {
                                    String message = e7.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                zzduoVar.zzf(string);
                            } catch (RemoteException e8) {
                                int i9 = AbstractC3490o0.f14278b;
                                AbstractC7599p.m33329d("", e8);
                            }
                        }
                        i7 = 5;
                    } catch (JSONException e9) {
                        e = e9;
                        zzduxVar = this;
                        AbstractC3490o0.m17546l("Malformed CLD response", e);
                        zzduxVar.zzo.zzd("MalformedJson");
                        zzduxVar.zzl.zzd("MalformedJson");
                        zzduxVar.zze.zzd(e);
                        C7351t.m32354l().zzg(e, "AdapterInitializer.updateAdapterStatus");
                        zzfie zzfieVar = zzduxVar.zzp;
                        zzfhrVarZzn.zzj(e);
                        zzfhrVarZzn.zzd(false);
                        zzfieVar.zzb(zzfhrVarZzn.zzm());
                    }
                } catch (JSONException e10) {
                    e = e10;
                    zzduxVar = this;
                }
            }
            zzgot.zzm(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdut
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfhrVarZzn);
                    return null;
                }
            }, zzduxVar.zzi);
        } catch (JSONException e11) {
            e = e11;
            AbstractC3490o0.m17546l("Malformed CLD response", e);
            zzduxVar.zzo.zzd("MalformedJson");
            zzduxVar.zzl.zzd("MalformedJson");
            zzduxVar.zze.zzd(e);
            C7351t.m32354l().zzg(e, "AdapterInitializer.updateAdapterStatus");
            zzfie zzfieVar2 = zzduxVar.zzp;
            zzfhrVarZzn.zzj(e);
            zzfhrVarZzn.zzd(false);
            zzfieVar2.zzb(zzfhrVarZzn.zzm());
        }
    }

    final /* synthetic */ void zzn(boolean z7) {
        this.zzc = true;
    }

    final /* synthetic */ long zzo() {
        return this.zzd;
    }

    final /* synthetic */ zzbzm zzp() {
        return this.zze;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    final /* synthetic */ zzdsx zzr() {
        return this.zzl;
    }

    final /* synthetic */ zzdcy zzs() {
        return this.zzo;
    }

    final /* synthetic */ zzfie zzt() {
        return this.zzp;
    }
}

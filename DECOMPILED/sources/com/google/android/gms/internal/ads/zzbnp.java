package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.C3459Y;
import com.google.android.gms.ads.internal.util.InterfaceC3428E;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnp {
    private final Context zzb;
    private final String zzc;
    private final C7584a zzd;
    private final zzfie zze;
    private final InterfaceC3428E zzf;
    private final InterfaceC3428E zzg;
    private zzbno zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnp(Context context, C7584a c7584a, String str, InterfaceC3428E interfaceC3428E, InterfaceC3428E interfaceC3428E2, zzfie zzfieVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = c7584a;
        this.zze = zzfieVar;
        this.zzf = interfaceC3428E;
        this.zzg = interfaceC3428E2;
    }

    protected final zzbno zza(zzauu zzauuVar) {
        zzfhr zzfhrVarZzn = zzfhr.zzn(this.zzb, 6);
        zzfhrVarZzn.zza();
        final zzbno zzbnoVar = new zzbno(this.zzg);
        AbstractC3490o0.m17545k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzauu zzauuVar2 = null;
        zzbzh.zzf.execute(new Runnable(zzauuVar2, zzbnoVar) { // from class: com.google.android.gms.internal.ads.zzbnf
            private final /* synthetic */ zzbno zzb;

            {
                this.zzb = zzbnoVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(null, this.zzb);
            }
        });
        AbstractC3490o0.m17545k("loadNewJavascriptEngine: Promise created");
        zzbnoVar.zze(new zzbmy(this, zzbnoVar, zzfhrVarZzn), new zzbmz(this, zzbnoVar, zzfhrVarZzn));
        return zzbnoVar;
    }

    public final zzbnj zzb(zzauu zzauuVar) {
        AbstractC3490o0.m17545k("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                AbstractC3490o0.m17545k("getEngine: Lock acquired");
                AbstractC3490o0.m17545k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        AbstractC3490o0.m17545k("refreshIfDestroyed: Lock acquired");
                        zzbno zzbnoVar = this.zzh;
                        if (zzbnoVar != null && this.zzi == 0) {
                            zzbnoVar.zze(new zzbzq() { // from class: com.google.android.gms.internal.ads.zzbnb
                                @Override // com.google.android.gms.internal.ads.zzbzq
                                public final /* synthetic */ void zza(Object obj2) {
                                    this.zza.zzd((zzbmk) obj2);
                                }
                            }, zzbnc.zza);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC3490o0.m17545k("refreshIfDestroyed: Lock released");
        zzbno zzbnoVar2 = this.zzh;
        if (zzbnoVar2 != null && zzbnoVar2.zzi() != -1) {
            int i7 = this.zzi;
            if (i7 == 0) {
                AbstractC3490o0.m17545k("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i7 != 1) {
                AbstractC3490o0.m17545k("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            AbstractC3490o0.m17545k("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        AbstractC3490o0.m17545k("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    final /* synthetic */ void zzc(zzauu zzauuVar, final zzbno zzbnoVar) {
        final long jMo18159a = C7351t.m32357o().mo18159a();
        final ArrayList arrayList = new ArrayList();
        try {
            AbstractC3490o0.m17545k("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbms zzbmsVar = new zzbms(this.zzb, this.zzd, null, null);
            AbstractC3490o0.m17545k("loadJavascriptEngine > After createJavascriptEngine");
            AbstractC3490o0.m17545k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmsVar.zzi(new zzbmj() { // from class: com.google.android.gms.internal.ads.zzbnd
                @Override // com.google.android.gms.internal.ads.zzbmj
                public final /* synthetic */ void zza() {
                    long jMo18159a2 = C7351t.m32357o().mo18159a();
                    final long j7 = jMo18159a;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(jMo18159a2 - j7));
                    String strValueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(strValueOf);
                    sb.append(" ms.");
                    AbstractC3490o0.m17545k(sb.toString());
                    zzfro zzfroVar = C3431F0.f14180l;
                    final zzbnp zzbnpVar = this.zza;
                    final zzbno zzbnoVar2 = zzbnoVar;
                    final zzbmk zzbmkVar = zzbmsVar;
                    zzfroVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbne
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbnpVar.zze(zzbnoVar2, zzbmkVar, arrayList2, j7);
                        }
                    }, ((Integer) C3250D.m17200c().zzd(zzbci.zzc)).intValue());
                }
            });
            AbstractC3490o0.m17545k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmsVar.zzm("/jsLoaded", new zzbmu(this, jMo18159a, zzbnoVar, zzbmsVar));
            C3459Y c3459y = new C3459Y();
            zzbmv zzbmvVar = new zzbmv(this, null, zzbmsVar, c3459y);
            c3459y.m17509b(zzbmvVar);
            AbstractC3490o0.m17545k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmsVar.zzm("/requestReload", zzbmvVar);
            String str = this.zzc;
            AbstractC3490o0.m17545k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                AbstractC3490o0.m17545k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmsVar.zzf(str);
                AbstractC3490o0.m17545k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                AbstractC3490o0.m17545k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmsVar.zzh(str);
                AbstractC3490o0.m17545k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                AbstractC3490o0.m17545k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmsVar.zzg(str);
                AbstractC3490o0.m17545k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            AbstractC3490o0.m17545k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            C3431F0.f14180l.postDelayed(new zzbmx(this, zzbnoVar, zzbmsVar, arrayList, jMo18159a), ((Integer) C3250D.m17200c().zzd(zzbci.zzd)).intValue());
        } catch (Throwable th) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error creating webview.", th);
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzij)).booleanValue()) {
                zzbnoVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzil)).booleanValue()) {
                C7351t.m32354l().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnoVar.zzg();
            } else {
                C7351t.m32354l().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnoVar.zzg();
            }
        }
    }

    final /* synthetic */ void zzd(zzbmk zzbmkVar) {
        if (zzbmkVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zze(zzbno zzbnoVar, final zzbmk zzbmkVar, ArrayList arrayList, long j7) {
        AbstractC3490o0.m17545k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                AbstractC3490o0.m17545k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzij)).booleanValue()) {
                        zzbnoVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnoVar.zzg();
                    }
                    zzgpd zzgpdVar = zzbzh.zzf;
                    Objects.requireNonNull(zzbmkVar);
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbna
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbmkVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(C3250D.m17200c().zzd(zzbci.zzc));
                    int iZzi = zzbnoVar.zzi();
                    int i7 = this.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    long jMo18159a = C7351t.m32357o().mo18159a() - j7;
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 94 + String.valueOf(iZzi).length() + 39 + String.valueOf(i7).length() + 57 + strValueOf2.length() + 42 + String.valueOf(jMo18159a).length() + 15);
                    sb.append("Could not receive /jsLoaded in ");
                    sb.append(strValueOf);
                    sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb.append(iZzi);
                    sb.append(". Update status(onEngLoadedTimeout) is ");
                    sb.append(i7);
                    sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb.append(strValueOf2);
                    sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb.append(jMo18159a);
                    sb.append(" ms. Rejecting.");
                    AbstractC3490o0.m17545k(sb.toString());
                    AbstractC3490o0.m17545k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                AbstractC3490o0.m17545k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ Object zzf() {
        return this.zza;
    }

    final /* synthetic */ zzfie zzg() {
        return this.zze;
    }

    final /* synthetic */ zzbno zzh() {
        return this.zzh;
    }

    final /* synthetic */ void zzi(zzbno zzbnoVar) {
        this.zzh = zzbnoVar;
    }

    final /* synthetic */ int zzj() {
        return this.zzi;
    }

    final /* synthetic */ void zzk(int i7) {
        this.zzi = i7;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.util.InterfaceC3761p;
import java.util.Objects;
import p380w2.C7332a;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbms implements zzbmk, zzbmi {
    private final zzcek zza;

    public zzbms(Context context, C7584a c7584a, zzauu zzauuVar, C7332a c7332a) throws zzcez {
        C7351t.m32350h();
        zzcek zzcekVarZza = zzcfa.zza(context, zzcgt.zzb(), "", false, false, null, null, c7584a, null, null, null, zzbbh.zza(), null, null, null, null, null);
        this.zza = zzcekVarZza;
        zzcekVarZza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        C3244B.m17190a();
        if (C7590g.m33273C()) {
            AbstractC3490o0.m17545k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            AbstractC3490o0.m17545k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (C3431F0.f14180l.post(runnable)) {
                return;
            }
            AbstractC7599p.m33331f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmt
    public final void zza(final String str) {
        AbstractC3490o0.m17545k("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzf(String str) {
        AbstractC3490o0.m17545k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzg(final String str) {
        AbstractC3490o0.m17545k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzh(final String str) {
        AbstractC3490o0.m17545k("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzq(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzi(final zzbmj zzbmjVar) {
        zzcgi zzcgiVarZzP = this.zza.zzP();
        Objects.requireNonNull(zzbmjVar);
        zzcgiVarZzP.zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbmm
            @Override // com.google.android.gms.internal.ads.zzcgh
            public final /* synthetic */ void zza() {
                zzbmjVar.zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzj() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final boolean zzk() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final zzbnr zzl() {
        return new zzbnr(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzm(String str, zzbjl zzbjlVar) {
        this.zza.zzab(str, new zzbml(this, zzbjlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzn(String str, final zzbjl zzbjlVar) {
        this.zza.zzad(str, new InterfaceC3761p() { // from class: com.google.android.gms.internal.ads.zzbmq
            @Override // com.google.android.gms.common.util.InterfaceC3761p
            public final /* synthetic */ boolean apply(Object obj) {
                zzbjl zzbjlVar2 = (zzbjl) obj;
                if (zzbjlVar2 instanceof zzbml) {
                    return ((zzbml) zzbjlVar2).zzb().equals(zzbjlVar);
                }
                return false;
            }
        });
    }

    final /* synthetic */ void zzo(String str) {
        this.zza.zza(str);
    }

    final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzq(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    final /* synthetic */ void zzr(String str) {
        this.zza.loadUrl(str);
    }
}

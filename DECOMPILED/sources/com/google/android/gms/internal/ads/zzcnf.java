package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p396y2.InterfaceC7536x;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnf implements zzayi, zzcwn, InterfaceC7536x, zzcwm {
    private final zzcna zza;
    private final zzcnb zzb;
    private final zzbop zzd;
    private final Executor zze;
    private final InterfaceC3750e zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcne zzh = new zzcne();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcnf(zzbom zzbomVar, zzcnb zzcnbVar, Executor executor, zzcna zzcnaVar, InterfaceC3750e interfaceC3750e) {
        this.zza = zzcnaVar;
        zzbnx zzbnxVar = zzboa.zza;
        this.zzd = zzbomVar.zza("google.afma.activeView.handleUpdate", zzbnxVar, zzbnxVar);
        this.zzb = zzcnbVar;
        this.zze = executor;
        this.zzf = interfaceC3750e;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcek) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdB() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdC() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final synchronized void zzdo(zzayh zzayhVar) {
        zzcne zzcneVar = this.zzh;
        zzcneVar.zza = zzayhVar.zzj;
        zzcneVar.zzf = zzayhVar;
        zzl();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdw() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcne zzcneVar = this.zzh;
                zzcneVar.zzd = this.zzf.mo18161c();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcneVar);
                for (final zzcek zzcekVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnd
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            StringBuilder sb = new StringBuilder(string.length() + 31);
                            sb.append("Calling AFMA_updateActiveView(");
                            sb.append(string);
                            sb.append(")");
                            String string2 = sb.toString();
                            int i7 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33326a(string2);
                            zzcekVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzbzk.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e7) {
                AbstractC3490o0.m17546l("Failed to call ActiveViewJS", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcek zzcekVar) {
        this.zzc.add(zzcekVar);
        this.zza.zzb(zzcekVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}

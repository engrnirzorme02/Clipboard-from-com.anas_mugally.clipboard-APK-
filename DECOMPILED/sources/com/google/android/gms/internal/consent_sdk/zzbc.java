package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.appcompat.app.AbstractC2263x;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p108N3.InterfaceC0960b;
import p108N3.InterfaceC0966h;
import p108N3.InterfaceC0967i;
import p111O.AbstractC1061m0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbc implements InterfaceC0960b {
    private final Application zzb;
    private final zzbx zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzdt zzf;
    private Dialog zzg;
    private zzbv zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbc(Application application, zzad zzadVar, zzbx zzbxVar, zzaq zzaqVar, zzbq zzbqVar, zzdt zzdtVar) {
        this.zzb = application;
        this.zzc = zzbxVar;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zzdtVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaz zzazVar = (zzaz) this.zzl.getAndSet(null);
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    @Override // p108N3.InterfaceC0960b
    public final void show(Activity activity, InterfaceC0960b.a aVar) {
        zzcs.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            aVar.m4213a(new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        this.zzh.zzc();
        zzaz zzazVar = new zzaz(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzazVar);
        this.zzl.set(zzazVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.m4213a(new zzg(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        AbstractC1061m0.m4703b(window, false);
        this.zzk.set(aVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    final zzbv zzc() {
        return this.zzh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzf(InterfaceC0967i interfaceC0967i, InterfaceC0966h interfaceC0966h) {
        zzbv zzbvVarZzb = ((zzbw) this.zzf).zza();
        this.zzh = zzbvVarZzb;
        zzbvVarZzb.setBackgroundColor(0);
        zzbvVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbvVarZzb.getSettings().setAllowFileAccess(false);
        zzbvVarZzb.getSettings().setAllowContentAccess(false);
        zzbvVarZzb.setWebViewClient(new zzbt(zzbvVarZzb, null));
        this.zzj.set(new zzba(interfaceC0967i, interfaceC0966h, 0 == true ? 1 : 0));
        zzbv zzbvVar = this.zzh;
        zzbq zzbqVar = this.zze;
        zzbvVar.loadDataWithBaseURL(zzbqVar.zza(), zzbqVar.zzb(), "text/html", "UTF-8", null);
        zzcs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void zzg(int i7) {
        zzk();
        AbstractC2263x.m9328a(this.zzk.getAndSet(null));
    }

    final void zzh(zzg zzgVar) {
        zzk();
        AbstractC2263x.m9328a(this.zzk.getAndSet(null));
    }

    final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}

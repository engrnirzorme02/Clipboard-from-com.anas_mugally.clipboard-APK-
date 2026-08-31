package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p108N3.C0965g;
import p108N3.EnumC0963e;
import p108N3.InterfaceC0960b;
import p108N3.InterfaceC0966h;
import p108N3.InterfaceC0967i;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbo {
    private final zzdt zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();

    zzbo(zzdt zzdtVar, Executor executor) {
        this.zza = zzdtVar;
        this.zzb = executor;
    }

    public static /* synthetic */ void zza(zzbo zzboVar, zzbc zzbcVar) {
        final AtomicReference atomicReference = zzboVar.zzd;
        Objects.requireNonNull(atomicReference);
        zzbcVar.zzf(new InterfaceC0967i() { // from class: com.google.android.gms.internal.consent_sdk.zzbf
            @Override // p108N3.InterfaceC0967i
            public final void onConsentFormLoadSuccess(InterfaceC0960b interfaceC0960b) {
                atomicReference.set(interfaceC0960b);
            }
        }, new InterfaceC0966h() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // p108N3.InterfaceC0966h
            public final void onConsentFormLoadFailure(C0965g c0965g) {
                Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(c0965g.m4221a())));
            }
        });
    }

    public final void zzb(InterfaceC0967i interfaceC0967i, InterfaceC0966h interfaceC0966h) {
        zzcs.zza();
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            interfaceC0966h.onConsentFormLoadFailure(new zzg(3, "No available form can be built.").zza());
        } else {
            ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza().zzf(interfaceC0967i, interfaceC0966h);
        }
    }

    public final void zzc() {
        zzbq zzbqVar = (zzbq) this.zzc.get();
        if (zzbqVar == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        final zzbc zzbcVarZza = ((zzaw) this.zza.zza()).zza(zzbqVar).zzb().zza();
        zzbcVarZza.zza = true;
        zzcs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbe
            @Override // java.lang.Runnable
            public final void run() {
                zzbo.zza(this.zza, zzbcVarZza);
            }
        });
    }

    public final void zzd(zzbq zzbqVar) {
        this.zzc.set(zzbqVar);
    }

    public final void zze(Activity activity, final InterfaceC0960b.a aVar) {
        zzcs.zza();
        zzj zzjVarZzb = zza.zza(activity).zzb();
        if (zzjVarZzb == null) {
            zzcs.zza.post(new Runnable(aVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbh
                public final /* synthetic */ InterfaceC0960b.a zza;

                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(1, "No consentInformation.").zza();
                    throw null;
                }
            });
            return;
        }
        if (!zzjVarZzb.isConsentFormAvailable() && zzjVarZzb.getPrivacyOptionsRequirementStatus() != EnumC0963e.NOT_REQUIRED) {
            zzcs.zza.post(new Runnable(aVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbi
                public final /* synthetic */ InterfaceC0960b.a zza;

                @Override // java.lang.Runnable
                public final void run() {
                    new zzg(3, "No valid response received yet.").zza();
                    throw null;
                }
            });
            zzjVarZzb.zza(activity);
        } else {
            if (zzjVarZzb.getPrivacyOptionsRequirementStatus() == EnumC0963e.NOT_REQUIRED) {
                zzcs.zza.post(new Runnable(aVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbj
                    public final /* synthetic */ InterfaceC0960b.a zza;

                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is not required.").zza();
                        throw null;
                    }
                });
                return;
            }
            InterfaceC0960b interfaceC0960b = (InterfaceC0960b) this.zzd.get();
            if (interfaceC0960b == null) {
                zzcs.zza.post(new Runnable(aVar) { // from class: com.google.android.gms.internal.consent_sdk.zzbk
                    public final /* synthetic */ InterfaceC0960b.a zza;

                    @Override // java.lang.Runnable
                    public final void run() {
                        new zzg(3, "Privacy options form is being loading. Please try again later.").zza();
                        throw null;
                    }
                });
            } else {
                interfaceC0960b.show(activity, aVar);
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        return this.zzc.get() != null;
    }
}

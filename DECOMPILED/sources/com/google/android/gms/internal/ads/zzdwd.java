package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3284O0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p380w2.C7351t;
import p396y2.C7535w;
import p396y2.InterfaceC7536x;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwd implements InterfaceC7536x, zzcgg {
    private final Context zza;
    private final C7584a zzb;
    private zzdvs zzc;
    private zzcek zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private InterfaceC3284O0 zzh;
    private boolean zzi;

    zzdwd(Context context, C7584a c7584a) {
        this.zza = context;
        this.zzb = c7584a;
    }

    private final synchronized boolean zzq(InterfaceC3284O0 interfaceC3284O0) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue()) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Ad inspector had an internal error.");
            try {
                interfaceC3284O0.zze(zzfee.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Ad inspector had an internal error.");
            try {
                C7351t.m32354l().zzg(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                interfaceC3284O0.zze(zzfee.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (C7351t.m32357o().mo18159a() >= this.zzg + ((long) ((Integer) C3250D.m17200c().zzd(zzbci.zzjL)).intValue())) {
                return true;
            }
        }
        int i9 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC3284O0.zze(zzfee.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final synchronized void zza(boolean z7, int i7, String str, String str2) {
        if (z7) {
            AbstractC3490o0.m17545k("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Ad inspector failed to load.");
        try {
            zzbyv zzbyvVarM32354l = C7351t.m32354l();
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i7);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzbyvVarM32354l.zzg(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            InterfaceC3284O0 interfaceC3284O0 = this.zzh;
            if (interfaceC3284O0 != null) {
                interfaceC3284O0.zze(zzfee.zzd(17, null, null));
            }
        } catch (RemoteException e7) {
            C7351t.m32354l().zzg(e7, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
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
    public final synchronized void zzdY(int i7) {
        this.zzd.destroy();
        if (!this.zzi) {
            AbstractC3490o0.m17545k("Inspector closed.");
            InterfaceC3284O0 interfaceC3284O0 = this.zzh;
            if (interfaceC3284O0 != null) {
                try {
                    interfaceC3284O0.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
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

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzdvs zzdvsVar) {
        this.zzc = zzdvsVar;
    }

    public final synchronized void zzm(InterfaceC3284O0 interfaceC3284O0, zzbkg zzbkgVar, zzbjz zzbjzVar, zzbjm zzbjmVar) {
        if (zzq(interfaceC3284O0)) {
            try {
                C7351t.m32350h();
                zzcek zzcekVarZza = zzcfa.zza(this.zza, zzcgt.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbbh.zza(), null, null, null, null, null);
                this.zzd = zzcekVarZza;
                zzcgi zzcgiVarZzP = zzcekVarZza.zzP();
                if (zzcgiVarZzP == null) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Failed to obtain a web view for the ad inspector");
                    try {
                        C7351t.m32354l().zzg(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        interfaceC3284O0.zze(zzfee.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e7) {
                        C7351t.m32354l().zzg(e7, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = interfaceC3284O0;
                Context context = this.zza;
                zzcgiVarZzP.zzZ(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkgVar, null, new zzbkf(context), zzbjzVar, zzbjmVar, null, null, null);
                zzcgiVarZzP.zzG(this);
                this.zzd.loadUrl((String) C3250D.m17200c().zzd(zzbci.zzjJ));
                C7351t.m32348f();
                C7535w.m33168a(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = C7351t.m32357o().mo18159a();
            } catch (zzcez e8) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33332g("Failed to obtain a web view for the ad inspector", e8);
                try {
                    C7351t.m32354l().zzg(e8, "InspectorUi.openInspector 0");
                    interfaceC3284O0.zze(zzfee.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e9) {
                    C7351t.m32354l().zzg(e9, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp();
                }
            });
        }
    }

    public final Activity zzo() {
        zzcek zzcekVar = this.zzd;
        if (zzcekVar == null || zzcekVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}

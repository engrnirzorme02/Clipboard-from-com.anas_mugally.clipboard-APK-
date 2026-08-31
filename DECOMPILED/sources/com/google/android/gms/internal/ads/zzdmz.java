package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Collections;
import java.util.Map;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdmz extends zzbly implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfg {
    private View zza;
    private InterfaceC3340f1 zzb;
    private zzdip zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmz(zzdip zzdipVar, zzdiu zzdiuVar) {
        this.zza = zzdiuVar.zzJ();
        this.zzb = zzdiuVar.zzy();
        this.zzc = zzdipVar;
        if (zzdiuVar.zzT() != null) {
            zzdiuVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdip zzdipVar = this.zzc;
        if (zzdipVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdipVar.zzu(view, map, map, zzdip.zzI(view));
    }

    private static final void zzi(zzbmc zzbmcVar, int i7) {
        try {
            zzbmcVar.zzf(i7);
        } catch (RemoteException e7) {
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zza() {
        C3431F0.f14180l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e7) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final InterfaceC3340f1 zzb() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33328c("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zzc() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzg();
        zzdip zzdipVar = this.zzc;
        if (zzdipVar != null) {
            zzdipVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zzd(InterfaceC3772a interfaceC3772a, zzbmc zzbmcVar) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Instream ad can not be shown after destroy().");
            zzi(zzbmcVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Instream internal error: ".concat(str));
            zzi(zzbmcVar, 0);
            return;
        }
        if (this.zze) {
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("Instream ad should not be used again.");
            zzi(zzbmcVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) BinderC3773b.m18220M0(interfaceC3772a)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        C7351t.m32345c();
        zzbzu.zza(this.zza, this);
        C7351t.m32345c();
        zzbzu.zzb(this.zza, this);
        zzh();
        try {
            zzbmcVar.zze();
        } catch (RemoteException e7) {
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33334i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(InterfaceC3772a interfaceC3772a) {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        zzd(interfaceC3772a, new zzdmx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzblz
    public final zzbft zzf() {
        AbstractC3718s.m18076e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33328c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdip zzdipVar = this.zzc;
        if (zzdipVar == null || zzdipVar.zzP() == null) {
            return null;
        }
        return zzdipVar.zzP().zza();
    }
}
